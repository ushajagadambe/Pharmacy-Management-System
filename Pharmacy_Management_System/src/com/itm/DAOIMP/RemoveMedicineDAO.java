package com.itm.DAOIMP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itm.BO.RemoveMedicineBO;
import com.itm.utility.JDBCConnectionUtility;

public class RemoveMedicineDAO {
	private JDBCConnectionUtility connection;
	private static final String  Select_Query="select medname from medicine where medname=?";

public boolean removemedicinedao(RemoveMedicineBO bo) throws Exception
{
	String name=null;PreparedStatement pstatement=null;ResultSet resultset=null;boolean result = false;
	name=bo.getName();Statement st=null;
	System.out.println(name+"dao");
	Connection con=connection.getConnection();
 st=con.createStatement();
	pstatement=con.prepareStatement(Select_Query);
	pstatement.setString(1, name);
	resultset=	pstatement.executeQuery();
	/*while(resultset.next())
	{
		if(name.equalsIgnoreCase(resultset.getString(1)))
		{
			result=true;
		}
		else
			result=false;
	}*/
	if(resultset.next())
		{
		st.executeUpdate("delete from medicine where medname="+name+"");
		result=true;
		}
	else
		result=false;
	return result;
	
}
}
