package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itm.Delegate.CustomerLoginDelegate;
import com.itm.VO.CustomerLoginVO;



@WebServlet("/CustomerLoginController")
public class CustomerLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("controller class");
		CustomerLoginDelegate customerlogindelegate;
		String username=null;PrintWriter printwriter=null;
		String password=null;boolean result;
		CustomerLoginVO customerloginvo=null; 
		username=request.getParameter("username");
		password=request.getParameter("password");
	   customerloginvo=new CustomerLoginVO();
	   customerloginvo.setUsername(username);
	   customerloginvo.setPassword(password);
	   customerlogindelegate=new CustomerLoginDelegate();
	   printwriter=response.getWriter();
	   try {
		result=customerlogindelegate.Handle(customerloginvo);
		if(result==true)
		{
		printwriter.print("successfull");
			
		}		
		
		else
			printwriter.print("unsuccessfull may be username or password is wrong or may be not register");
	      printwriter.print("<html><body><br><a href=\"CustomerReg.html\">Registration</a></body></html>");
	   } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
