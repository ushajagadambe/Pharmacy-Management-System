package com.itm.DAOIMP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itm.BO.SearchMedicineBO;
import com.itm.utility.JDBCConnectionUtility;

public class SearchMedicineDAO {
	private JDBCConnectionUtility connection;
	private static final String query="select medname,power from medicine where medname=?";
	public int searchmedicine(SearchMedicineBO BO) throws Exception
	{ String name=BO.getName();
		PreparedStatement pstatement=null;int power=0;
		ResultSet resultset=null;
		Connection con=connection.getConnection();
		pstatement=con.prepareStatement(query);
		pstatement.setString(1, name);
		resultset=pstatement.executeQuery();
		if(resultset.next())
		power=resultset.getInt(2);
		else
			power=0;
		return power;
		
	}
}
