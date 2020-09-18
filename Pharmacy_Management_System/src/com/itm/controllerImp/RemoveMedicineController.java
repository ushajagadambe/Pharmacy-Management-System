package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itm.DTO.RemoveMedicineDTO;
import com.itm.Delegate.RemoveMedicineDelegate;
import com.itm.VO.RemoveMedicineVO;


@WebServlet("/RemoveMedicineController")
public class RemoveMedicineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();boolean result=false;
		String name=request.getParameter("med");
		System.out.println("controller value="+name);
		RemoveMedicineVO vo=new RemoveMedicineVO();
		vo.setName(name);
	RemoveMedicineDelegate delegate=new RemoveMedicineDelegate();
	try {
		result=delegate.removemedicinedel(vo);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	if(result==true)
	{
		pw.print("<html><body>removed sucessfully <br><a href=\"AdminMenu.html\">Admin Menu</a></body></html>");
	}
	else
		pw.print("<html><body>no medicine unavailable<br><a href=\"AdminMenu.html\">Admin Menu</a></body></html>");
	}

}
