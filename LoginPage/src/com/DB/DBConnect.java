package com.DB;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection conn = null;
	public static Connection getConnection() {
		try {
			
			if(conn==null) {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage","root","root6");
			}
			
		}	catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
