package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;

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
		 System.out.println(radio);
		if(radio.equalsIgnoreCase("addmedicine"))
		{
			out.print("add medicine");
		}
	}

}
