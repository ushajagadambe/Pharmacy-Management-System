package com.itm.controllerImp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itm.Delegate.CustomerLoginDelegate;
import com.itm.Delegate.CustomerRegDelegate;
import com.itm.VO.CustomerRegVO;
import com.itm.utility.CustomException;

@WebServlet("/CustomerReg")
public class CustomerRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
private CustomerRegDelegate delegate=null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("welcome to controllor");
    //ServletContext sc= request.getServletContext();
     
		CustomerRegVO vo=null;boolean result=false;
delegate=new CustomerRegDelegate();
String username=request.getParameter("username");
String password=request.getParameter("password");
String address=request.getParameter("address");
String phone=request.getParameter("phone");
HttpSession session=request.getSession();
session.setAttribute( "cust_name",username);
vo=new CustomerRegVO();
vo.setName(username);
vo.setAddress(address);
vo.setPassword(password);
vo.setPhone(phone);PrintWriter 
out=response.getWriter();//sc.setAttribute("customer_nm", username);
try {
	result=delegate.Reg(vo);
	System.out.println("res controller="+result);
	if(result==true)
	{
		RequestDispatcher rd=request.getRequestDispatcher("CustomerMenu.html");
		rd.include(request,response);
	}
	else
	{
		out.print("<html><body>--failed--please try again----<a href=\\\"CustomerReg.html\\\"></body></html>");
	}
} catch (Exception e) {
	
    
	e.printStackTrace();
}

	}
	

}
