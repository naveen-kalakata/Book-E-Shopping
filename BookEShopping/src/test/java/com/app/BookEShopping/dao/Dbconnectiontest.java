package com.app.BookEShopping.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Dbconnectiontest {
	public static Connection returnConnectionObject(){
		Connection conn=null;
		
		Properties prp = new Properties();
		try {
			prp.load(new FileInputStream("src/main/resources/testconnection.properties"));
			String dburl = prp.getProperty("DB_URL");
			String user = prp.getProperty("DB_USERNAME");
			String passw = prp.getProperty("DB_PASSWORD");
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
