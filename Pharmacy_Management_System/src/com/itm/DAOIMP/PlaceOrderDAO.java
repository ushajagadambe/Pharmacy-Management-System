package com.itm.DAOIMP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itm.BO.PlaceOrderBO;
import com.itm.utility.JDBCConnectionUtility;

public class PlaceOrderDAO {
	private JDBCConnectionUtility connection;
	//private static final String  Select_Query="select medname,mdate,edate,power,price from medicine";
	private static final String  Insert_Query="insert into order_customer values(?,?,?)";
	public int placeorder(PlaceOrderBO bo) throws Exception
	{
	String med_name=bo.getMed_name();
	int qua=bo.getQuantity();
	String cust_name=bo.getCust_name();
	int price=0;
	Statement statement=null;
	ResultSet rs=null;
	Connection con=connection.getConnection();
	statement=con.createStatement();
	rs=statement.executeQuery("select medname,mdate,edate,power,price from medicine where medname="+med_name+"");
	/*while(rs.next())
	{
		System.out.println(med_name+qua+cust_name);
		System.out.println(rs.getString(1)+rs.getInt(4));
		if(rs.getString(1).equalsIgnoreCase(med_name)&&qua>=rs.getInt(4))
		{
			
			PreparedStatement ps=con.prepareStatement(Insert_Query);
			ps.setString(1,cust_name);
			ps.setString(2, med_name);
			ps.setInt(3, qua);
			price=qua*rs.getInt(5);
			}
		}*/
		if(rs.next())
		{
			PreparedStatement ps=con.prepareStatement(Insert_Query);
			ps.setString(1,cust_name);
			ps.setString(2, med_name);
			ps.setInt(3, qua);
			price=qua*rs.getInt(5);
		}
	
	
		
		return price;
		
	}
}
