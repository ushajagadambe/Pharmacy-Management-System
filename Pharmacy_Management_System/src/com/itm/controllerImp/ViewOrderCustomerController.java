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

import org.apache.catalina.core.ApplicationContext;

import com.itm.Delegate.ViewOrdercustomerDelegate;
import com.itm.VO.ViewOrderCustomerVO;


@WebServlet("/ViewOrderCustomerController")
public class ViewOrderCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	ServletContext sc=request.getServletContext();String res=null;PrintWriter out=null;
	HttpSession session=request.getSession();
	String cust_name=(String) session.getAttribute("cust_name");
	ViewOrderCustomerVO vo=new ViewOrderCustomerVO();
	vo.setName(cust_name);
	ViewOrdercustomerDelegate delegate=new ViewOrdercustomerDelegate();
	try {
	res=	delegate.viewordercustdel(vo);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(res==null)
	{
		out.print("no order placed");
	}
	else
		out.print("view the order<\n>"+res);
	}

}
