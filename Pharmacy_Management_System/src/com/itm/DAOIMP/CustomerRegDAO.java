package com.itm.DAOIMP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.itm.BO.CustomerRegBO;
import com.itm.utility.JDBCConnectionUtility;

public class CustomerRegDAO {
	private JDBCConnectionUtility connection;
	private static final String query="insert into customer values(?,?,?,?)";
	
public boolean InsertCustomer(CustomerRegBO bo) throws Exception
{ String username=null;String password=null;String address=null;long phone;boolean res=false;
   username=bo.getName();
   password=bo.getPassword();
   address=bo.getAddress();
   address=bo.getAddress();
   phone=bo.getPhone();
   phone=bo.getPhone();
	Connection con=connection.getConnection();
	PreparedStatement ps=con.prepareStatement("query");
	ps.setString(0,username);
	ps.setString(1, password);
	ps.setString(2, address);
	ps.setLong(3, phone);
	int n=ps.executeUpdate();
	if(n==0)
		res=false;
	else
		res=true;
	return res;
	
}
}
