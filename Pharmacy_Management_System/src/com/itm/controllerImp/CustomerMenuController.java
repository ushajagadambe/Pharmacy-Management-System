package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerMenuController")
public class CustomerMenuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String radio=null;PrintWriter out=null;
		out=response.getWriter();
		 radio=request.getParameter("select");
		 
		if(radio.equalsIgnoreCase("placeOrder"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("PlaceOrder.html");
			rd.include(request,response);
		}
		else if(radio.equalsIgnoreCase("viewOrder"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("ViewOrderCustomerController");
			rd.include(request,response);
		}
		else if(radio.equalsIgnoreCase("exit"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("thankyou.html");
			rd.include(request,response);
		}
	}

}
