package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ProductPojo;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProductPojo pojo = new ProductPojo();
		String i = request.getParameter("insert");
		String u = request.getParameter("update");
		String d = request.getParameter("delete");
		String s = request.getParameter("show");
		String flag = i + u + d + s;
		if(flag.equals("insertnullnullnull")) {
			System.out.println("start");
			pojo.setPid(Integer.parseInt(request.getParameter("pid")));
			pojo.setPname(request.getParameter("pname"));
			pojo.saveInsert(pojo);
			System.out.println("Successfull controller");
		}else if(flag.equals("nullupdatenullnull")) {
			pojo.setPid(Integer.parseInt(request.getParameter("pid")));
			pojo.setPname(request.getParameter("pname"));
			pojo.saveUpdate(pojo);
		}else if(flag.equals("nullnulldeletenull")) {
			pojo.setPid(Integer.parseInt(request.getParameter("pid")));
			//pojo.setPname(request.getParameter("pname"));
			pojo.saveDelete(pojo);
		}
		else if(flag.equals("nullnullnullshow")){
			System.out.println("showing");
			List<ProductPojo> productList = pojo.showProduct();
            request.setAttribute("productList", productList);
            request.getRequestDispatcher("show_table.jsp").forward(request, response);
            return;
		}
	}

}
