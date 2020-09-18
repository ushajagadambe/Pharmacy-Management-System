package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itm.Delegate.AddMedicineDelegate;
import com.itm.VO.AddmedicineVO;

@WebServlet("/AddmedicineController")
public class AddmedicineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();boolean result=false;
	String name=request.getParameter("med");
	String mdate=request.getParameter("mdate");
	String edate=request.getParameter("edate");
	String power=request.getParameter("p");
	String price=request.getParameter("price");
	AddmedicineVO addmedicinevo=new AddmedicineVO();
	addmedicinevo.setName(name);
	addmedicinevo.setMdate(mdate);
	addmedicinevo.setEdate(edate);
	addmedicinevo.setPower(power);
	addmedicinevo.setPrice(price);
	AddMedicineDelegate delegate=new AddMedicineDelegate();
	try {
		result=delegate.addmedicinedel(addmedicinevo);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(result==true)
		pw.print("<html><body>Medicine added suceessfully<br><a href=\"AdminMenu.html\">Menu page</a></body></html>");
	else
		pw.print("<html><body>unsuceessfully--try again--<br><a href=\"AdminMenu.html\">Menu page</a></body></html>");
	}

}
