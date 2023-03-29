package com.practice.Automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCExecuteQuery2 {

	public static void main(String[] args) throws SQLException {

		Driver driver = new Driver();
		DriverManager.registerDriver(driver); // Register the Driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/sql_store","root","kg3Chrlie29@L");
		Statement statement = con.createStatement();
		int res = statement.executeUpdate("update sql_store.customers set points=1056 where customer_id=1;");
		
		System.out.println("The new point is :"+res );
		con.close();
		
		
		
	}

}
