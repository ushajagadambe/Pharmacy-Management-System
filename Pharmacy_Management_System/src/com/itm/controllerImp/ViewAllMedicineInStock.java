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


@WebServlet("/ViewAllMedicineInStock")
public class ViewAllMedicineInStock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();Statement statement=null;
		JDBCConnectionUtility connection=null;ResultSet rs=null;
		Connection con=connection.getConnection();
		try {
			statement=con.createStatement();
			rs=statement.executeQuery("select medname,mdate,edate,power,price from medicine");
			 while(rs.next())
			 {
				 out.print("name="+rs.getString(1)+"mdate="+rs.getDate(2)+"edate="+rs.getDate(3)+"quantity="+rs.getInt(4)+"price="+rs.getInt(5)+"\n");
				 out.print("\n");
			 }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
