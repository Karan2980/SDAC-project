package operation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.GetConnection;
import model.ProductPojo;

public  class OperationImp implements Operation{
	@Override
	public void productInsert(ProductPojo pojo) {
		
		PreparedStatement pr;
		try {
			pr = GetConnection.getConnection().prepareStatement("insert into products values(?,?)");
			pr.setInt(1, pojo.getPid());
		    pr.setString(2, pojo.getPname());
		    pr.executeUpdate();
		    System.out.println("successful OperationImp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@Override
	public void productUpdate(ProductPojo pojo) {
		PreparedStatement pr = null;
		try {
			pr = GetConnection.getConnection().prepareStatement("update products set pname =? where pid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr.setString(1, pojo.getPname());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr.setInt(2, pojo.getPid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void productDelete(ProductPojo pojo) {
		PreparedStatement pr=null;
		try {
			pr = GetConnection.getConnection().prepareStatement("delete from products where pid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr.setInt(1, pojo.getPid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

public List<ProductPojo> showProduct() {
		
		List<ProductPojo> productList=new ArrayList<>();
		
		PreparedStatement pr = null;
		try {
			pr = GetConnection.getConnection().prepareStatement("Select * from products");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet resultSet = null;
		try {
			resultSet = pr.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(resultSet.next()) {
				ProductPojo pojo=new ProductPojo();
				pojo.setPid(resultSet.getInt("pid"));
				pojo.setPname(resultSet.getString("pname"));
				productList.add(pojo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return productList;
	}	

}
