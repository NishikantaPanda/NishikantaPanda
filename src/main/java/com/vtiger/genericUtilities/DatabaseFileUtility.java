package com.vtiger.genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
/**
 * This  Class consisting of Data to be used
 * @author RR
 * 
 *
 */
public class DatabaseFileUtility {

	public void readDataFromDatabase() throws SQLException {
		Driver d = new Driver();
		 DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/sql_store\",\"root\",\"kg3Chrlie29@L");
		Statement smt = con.createStatement();
		ResultSet result = smt.executeQuery("select * from sql_store");
		
		while(result.next()) {
			System.out.println(result.getInt(0));
		}
		
		con.close();
	}
	
	
}
