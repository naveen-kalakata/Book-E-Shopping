package com.app.BookEShopping.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	
	public static Connection returnConnectionObject(){
		Connection conn=null;
		
		Properties prp = new Properties();
		try {
			prp.load(new FileInputStream("src/main/resources/connection.properties"));
			String driver = "com.mysql.jdbc.Driver";
			String dburl = prp.getProperty("DB_URL");
			String user = prp.getProperty("DB_USERNAME");
			String passw = prp.getProperty("DB_PASSWORD");
			System.setProperty(driver,"");
			conn = DriverManager.getConnection(dburl, user, passw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return conn;
	}

}
