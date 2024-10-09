package model;

import java.util.List;

import operation.OperationImp;

public class ProductPojo {
	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	
	public void saveInsert(ProductPojo pojo) {
		new OperationImp().productInsert(pojo);
		System.out.println("inserted pojo");
	}
	public void saveUpdate(ProductPojo pojo) {
		new OperationImp().productUpdate(pojo);
	}
	public void saveDelete(ProductPojo pojo) {
	    new OperationImp().productDelete(pojo);
	}
	public List<ProductPojo> showProduct() {
		return new OperationImp().showProduct();
	}
}
