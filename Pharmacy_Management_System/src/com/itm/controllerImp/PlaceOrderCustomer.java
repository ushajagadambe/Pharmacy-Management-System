package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itm.Delegate.PlaceOrderDelegate;
import com.itm.VO.PlaceOrderVO;


@WebServlet("/PlaceOrderCustomer")
public class PlaceOrderCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String med_name=request.getParameter("medname");int res=0;PrintWriter out=null;
		String quantity=request.getParameter("qua");
		PlaceOrderVO vo=new PlaceOrderVO();
		vo.setName(med_name);
		vo.setQuantity(quantity);
		//ServletContext sc=request.getServletContext();(String) sc.getAttribute("customer_nm");
		HttpSession session=request.getSession();
	String cust_name=(String) session.getAttribute("cust_name");
	System.out.println("customer-name="+cust_name);
	vo.setCust_name(cust_name);
	PlaceOrderDelegate delegate=new PlaceOrderDelegate();
	try {
		res=delegate.placeorderdel(vo);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(res!=0)
		out.print("bill to pay="+res+"<html><body><break><a href=\"thankyou.html\">Thank you</a></body></html>");
	/*else
		out.print("<html><body>medicine unavailable--sorry for inconvinications--<a href=\"CustomerMenu.html\">try again</a></body></html>");*/
	}

}
