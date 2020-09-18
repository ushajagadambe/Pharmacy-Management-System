package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminMenuControoler")
public class AdminMenuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String radio=null;PrintWriter out=null;
		out=response.getWriter();
		 radio=request.getParameter("select");
		 
		if(radio.equalsIgnoreCase("addmedicine"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Addmidicine.html");
			rd.include(request,response);
		}
		else if(radio.equalsIgnoreCase("removemedicine"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("RemoveMedicine.html");
			rd.include(request,response);
		}
		else if(radio.equalsIgnoreCase("serachmedicine"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("SearchMedicine.html");
			rd.include(request,response);
		}
		else if(radio.equalsIgnoreCase("viewAllOrder"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/ViewAllOrderController");
			rd.forward(request,response);
		}
		else if(radio.equalsIgnoreCase("viewAllmedicineInStack"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/ViewAllMedicineInStock");
			rd.forward(request,response);
		}
		else if(radio.equalsIgnoreCase("exit"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("thankyou.html");
			rd.forward(request,response);
		}
	}

}
