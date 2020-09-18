package com.itm.controllerImp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itm.utility.JDBCConnectionUtility;

@WebServlet("/ViewAllOrderController")
public class ViewAllOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ViewAllOrderController");
		PrintWriter out=response.getWriter();Statement statement=null;
		JDBCConnectionUtility connection=null;ResultSet rs=null;
		Connection con=connection.getConnection();
		try {
			statement=con.createStatement();
			rs=statement.executeQuery("select name,medname,power from order_customer");
		while(rs.next())
		{
			out.print("customer name="+rs.getString(1)+"med name="+rs.getString(2)+"qunatity="+rs.getInt(3)+"\n");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
