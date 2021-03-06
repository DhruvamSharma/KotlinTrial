package com.fil.dao.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection connection;
	private static final String URL = "jdbc:mysql://localhost:3306/machine_market";
	
	DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, "root", "chalorebels");
		} catch(ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static Connection getDBConnection() {
		
		try {
			if(connection == null || connection.isClosed()) {
				new DBConnection();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}

}
