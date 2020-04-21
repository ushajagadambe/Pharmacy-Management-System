package com.itm.DAOIMP;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itm.BO.AdminLoginBO;
import com.itm.utility.JDBCConnectionUtility;

public class AdminLoginDAO {
	private JDBCConnectionUtility connection;
	private static final String  Select_Query="select username,password from adminLogin";
public boolean validate(AdminLoginBO adminloginbo) throws Exception
{//username=usha and password=usha1234
	Statement statement=null;ResultSet resultset=null;
	String username=null;String passworod=null;boolean res = false;
	username=adminloginbo.getUsername();
	passworod=adminloginbo.getPassword();
	Connection con=connection.getConnection();
	statement=con.createStatement();
	resultset=statement.executeQuery(Select_Query);
	if(resultset.next())
	{
	System.out.println(resultset.getString(1)+resultset.getString(2));
	if(username.equalsIgnoreCase(resultset.getString(1))&&passworod.equalsIgnoreCase(resultset.getString(2)))
		return res=true;
	}
	else
		return res=false;
	
	
	return res;
}
}
