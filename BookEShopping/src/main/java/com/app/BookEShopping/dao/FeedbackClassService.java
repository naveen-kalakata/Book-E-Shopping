package com.app.BookEShopping.dao;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import org.springframework.stereotype.Service;

@Service
public class FeedbackClassService {
	public void review(String username, String contactno, String feedback) {

		System.out.println(username);

		Connection conn = null;

		Statement mystmt = null;

		try {

			conn = DbConnection.returnConnectionObject();
			mystmt = conn.createStatement();

			mystmt.executeUpdate("INSERT INTO `feedback`(userName,contactNo,feedback) "

					+ "VALUES ('" + username + "','" + contactno + "','" + feedback + "')");

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} 

	}

}