package com.app.BookEShopping.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.BookEShopping.BookDetails;

public class AdvancedClassService {

	public List<BookDetails> advancedSearchBook(String category,String keyword) {
		List<BookDetails> booklist = new ArrayList<BookDetails>();

		Connection conn = null;
		Statement mystmt = null;

		try {
			conn=DbConnection.returnConnectionObject();
			mystmt = conn.createStatement();
			
			if((category!="") &&(keyword!="")){
				System.out.println(category);
				ResultSet myRs = mystmt.executeQuery("select * from  bookdetails where bookcategory = '" + category +"'"+"and bookName LIKE '%"+keyword+"%'"+" and archieve='no'");
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
			}
			else if((category=="") &&(keyword!="")){
				ResultSet myRs = mystmt.executeQuery("select * from  bookdetails where bookName LIKE '%"+keyword+"%'"+" and archieve='no' ");
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
				
			}
			else{
				ResultSet myRs = mystmt.executeQuery("select * from  bookdetails where bookcategory = '" + category +"'"+" and archieve='no'");
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
				
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booklist;
	}
}
