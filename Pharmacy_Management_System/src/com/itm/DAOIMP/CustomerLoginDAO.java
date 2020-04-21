package com.itm.DAOIMP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itm.BO.CustomerLoginBO;
import com.itm.utility.JDBCConnectionUtility;

public class CustomerLoginDAO {
	private JDBCConnectionUtility connection;
	private static final String  Select_Query="select name,password from customer";
public boolean validate(CustomerLoginBO cutomerloginbo) throws Exception
	{
	Statement statement=null;ResultSet resultset=null;
	String username=null;String passworod=null;boolean res = false;
	username=cutomerloginbo.getUsername();
	passworod=cutomerloginbo.getPassword();
	Connection con=connection.getConnection();
	statement=con.createStatement();
	resultset=statement.executeQuery(Select_Query);
	if(resultset.next())
	{if(username.equals(resultset.getString(1))&&passworod.equals(resultset.getString(2)))
		return res=true;
	}
	else
		return res=false;
return res;
}
}
