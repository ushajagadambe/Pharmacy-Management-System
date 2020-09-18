package com.itm.DAOIMP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itm.BO.ViewOrderCustomerBO;
import com.itm.utility.JDBCConnectionUtility;

public class ViewOrderCustomerDAO {
	private JDBCConnectionUtility connection;
	private static final String  Select_Query="select name,medname,power from medicine where nmae=?";
	public String viewordercustomerdao(ViewOrderCustomerBO bo) throws Exception
	{ String cust_name=bo.getCust_name();String res=null;
		Connection con=null;ResultSet rs=null;
	 	con=connection.getConnection();
	 	PreparedStatement st=con.prepareStatement(Select_Query);
	 	st.setString(1,cust_name);
	 rs=	st.executeQuery();
	 if(rs.next())
	 {
		 res="customer_name"+rs.getString(1)+"medicine_name"+rs.getString(2)+"quantity="+rs.getString(3);
	 }
		return res;
		
	}
}
