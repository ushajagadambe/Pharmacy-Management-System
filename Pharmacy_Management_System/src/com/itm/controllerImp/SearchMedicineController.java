package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itm.Delegate.SearchMedicineDelegate;
import com.itm.VO.SearchMedicineVO;

/**
 * Servlet implementation class SearchMedicineController
 */
@WebServlet("/SearchMedicineController")
public class SearchMedicineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();int power=0;
	String name=request.getParameter("med");
	SearchMedicineVO VO=new SearchMedicineVO();
	VO.setName(name);
	SearchMedicineDelegate delegate=new SearchMedicineDelegate();
	try {
		power=delegate.serachmedicinedelegate(VO);
	} catch (Exception e) {
		
		e.printStackTrace();
	}	
	if(power==0)
		out.print("medicine not available in stock"+"<html><body><br><a href=\"AdminMenu.html\">try again</a></</body></html>");
	else
		out.print("name="+name+"----"+"quantity="+power);
	
	
	}
    
    	
}
