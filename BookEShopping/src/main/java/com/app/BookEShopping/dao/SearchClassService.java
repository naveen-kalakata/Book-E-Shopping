package com.app.BookEShopping.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.app.BookEShopping.BookDetails;

public class SearchClassService {

	public List<BookDetails> SearchBook(String bookname, String author) {
		List<BookDetails> booklist = new ArrayList<BookDetails>();

		Connection conn = null;
		Statement mystmt = null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
//			Properties prp = new Properties();
//			prp.load(new FileInputStream("src/main/resources/connection.properties"));
//			String dburl = prp.getProperty("DB_URL");
//			String user = prp.getProperty("DB_USERNAME");
//			String passw = prp.getProperty("DB_PASSWORD");
//			conn = DriverManager.getConnection(dburl, user, passw);
			conn=DbConnection.returnConnectionObject();
			mystmt = conn.createStatement();
			// "select LastModified from CacheTable where url = '" + url +"'"
			// '"+firstName+"','"+lastName+"','"+dob+"','"+gender+"','"+contactNo+"','"+email+"','"+userCategory+"','"+userId+"','"+password+"'
			// "select * from logindetails where userId = '"+userId+"'"
			ResultSet myRs = mystmt.executeQuery(
					"select * from  bookdetails where bookName = '" + bookname + "' and author = '" + author + "'");
			while (myRs.next()) {
				BookDetails book = new BookDetails();
				book.setBookName(myRs.getString("bookName"));
				book.setBookCode(myRs.getString("bookCode"));
				book.setBookDesc((myRs.getString("bookDesc")));
				book.setAuthor((myRs.getString("author")));
				book.setBookcategory(myRs.getString("bookcategory"));
				book.setBooktype(myRs.getString("booktype"));
				book.setBuyingoption(myRs.getString("buyingoption"));
				book.setBookrate((myRs.getString("bookrate")));
				book.setDiscount((myRs.getInt("discount")));
				booklist.add(book);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booklist;
	}
}
