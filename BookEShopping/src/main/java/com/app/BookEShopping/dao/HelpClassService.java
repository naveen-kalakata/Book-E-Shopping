package com.app.BookEShopping.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class HelpClassService {
	public boolean adddata(Date dateofticket, String helpId, String contactNo, String issue) {

		//RegisterClassService rsobj = new RegisterClassService();

		Connection conn=null;

		Statement mystmt = null;

		

		try {

			

//			Properties prp = new Properties();
//			prp.load(new FileInputStream("src/main/resources/connection.properties"));
//			String dburl = prp.getProperty("DB_URL");
//			String user = prp.getProperty("DB_USERNAME");
//			String passw = prp.getProperty("DB_PASSWORD");
//			conn = DriverManager.getConnection(dburl, user, passw);
			conn=DbConnection.returnConnectionObject();
			mystmt = conn.createStatement();

//			int ra = mystmt.executeUpdate("insert into logindetails"

//					+ "(firstName,lastName,dob,gender,contactNo,email,userCategory,userId,pass)" + 

//					"value"

//					+ "(firstName,lastName,dob,gender,contactNo,email,userCategory,userId,'hj')");

			

			mystmt.executeUpdate("INSERT INTO `help`(dateofticket,helpId,contactNo,issue) "

					+ "VALUES ('"+dateofticket+"','"+helpId+"','"+contactNo+"','"+issue+"')");

			//("INSERT INTO `time_entry`(pid,tid,rid,tspend,description) VALUE ('"+pid+"','"+tid+"','"+rid+"',"+tspent+",'"+des+"')");
			conn.close();
			mystmt.close();
			return true;

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		return false;



	}

	
	public String generaterequestId() {

		Random n1 = new Random();

		int u = n1.nextInt(9999);



		String helpid = String.format("%04d",u);

		return helpid;

	}

}