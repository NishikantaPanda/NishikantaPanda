package com.practice.Automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCExecuteQuery {

	public static void main(String[] args) throws SQLException {

		Driver d = new Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/sql_store","root","kg3Chrlie29@L");
		
		Statement st = con.createStatement();
		
		ResultSet res = st.executeQuery("select * from sql_store.shippers;");
		
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2));
		}
		
		con.close();
		
		
	}

}
