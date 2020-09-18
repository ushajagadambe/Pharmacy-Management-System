package com.itm.DAOIMP;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itm.BO.AddMedicineBO;
import com.itm.utility.JDBCConnectionUtility;

public class AddmedicineDAO {
	private JDBCConnectionUtility connection;
	private static final String query="insert into medicine values(?,?,?,?,?)";
	private static final String select_query="select medname from medicine";
	
public boolean addmedicinedao(AddMedicineBO bo) throws SQLException
{
	PreparedStatement prestatement=null;
	String name=null;boolean res=false;Statement statement=null;ResultSet rs=null;String med_name=null;
	name=bo.getName();
	java.sql.Date mdate=new Date(bo.getMdate().getTime());
	java.sql.Date edate=new Date(bo.getEdate().getTime());
	int power=bo.getPower();int price=bo.getPrice();
	int k=0;int quntity=0;
	Connection con=connection.getConnection();
		prestatement =con.prepareStatement(query);
		statement=con.createStatement();
		rs=statement.executeQuery(select_query);
		if(rs.next())
		{
			 med_name=rs.getString(1);
			 if(med_name.equalsIgnoreCase(name))
			 {
				 k=1;
				 quntity=rs.getInt(4);
			 }
			 
		}
 if(k==0)
 {
	 prestatement.setString(1, name);
		prestatement.setDate(2, mdate);
		prestatement.setDate(3, edate);
		prestatement.setInt(4, power);
		prestatement.setInt(5, price);
 }
 else
 {
	 prestatement.setInt(4, power+quntity);
 }
	int n=prestatement.executeUpdate();
	if(n==0)
		res=false;
	else
		res=true;
	return res;
	
}
}
