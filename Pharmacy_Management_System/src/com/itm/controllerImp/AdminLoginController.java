package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itm.Delegate.AdminLoginDelegate;
import com.itm.VO.AdminLoginVO;


@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Controller class");
		AdminLoginDelegate adminlogindelegate=null;
		String username=null;PrintWriter printwriter=null;
		String password=null;boolean result;
		 username=request.getParameter("username");
		 password=request.getParameter("password");
		AdminLoginVO adminloginvo=new AdminLoginVO();
		adminloginvo.setUsername(username);
		adminloginvo.setPassword(password);
		adminlogindelegate=new AdminLoginDelegate();
		printwriter=response.getWriter();
		try {
			result=adminlogindelegate.handleReq(adminloginvo);
			if(result==true)
			{ RequestDispatcher rd= request.getRequestDispatcher("AdminMenu.html");
			rd.include(request, response);
			}
			else
			{ 
			printwriter.print("Login unsuceessfull may be user name or password is wrong");
			printwriter.print("<html><body><br><a href=Adminlogin.html>try again</a></</body></html>");
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

}
