package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itm.Delegate.CustomerLoginDelegate;
import com.itm.Delegate.CustomerRegDelegate;
import com.itm.VO.CustomerRegVO;
import com.itm.utility.CustomException;


@WebServlet("/CustomerReg")
public class CustomerRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
private CustomerRegDelegate delegate=null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
CustomerRegVO vo=null;boolean result=false;
delegate=new CustomerRegDelegate();
String username=request.getParameter("username");
String password=request.getParameter("password");
String address=request.getParameter("address");
String phone=request.getParameter("phone");
vo=new CustomerRegVO();
vo.setAddress(username);
vo.setAddress(address);
vo.setPassword(password);
vo.setPhone(phone);PrintWriter out=response.getWriter();
try {
	result=delegate.Reg(vo);
	if(result==true)
	{
		RequestDispatcher rd=request.getRequestDispatcher("");
		rd.include(request,response);
	}
	else
	{
		out.print("<html><body></body></html>");
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	try {
		throw new  CustomException("Inter Exception error");
	} catch (CustomException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}

	}
	

}
