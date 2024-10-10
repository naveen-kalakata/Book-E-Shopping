package com.app.BookEShopping.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.app.BookEShopping.BookDetails;
import com.app.BookEShopping.HelpClass;

public class BookDetailsdao {
	
	public String dynamicstockupdation(){
		Connection conn=null;

		Statement mystmt = null;
		String data="";
		//int count=0;

		
		try{
			conn=DbConnection.returnConnectionObject();
			mystmt=conn.createStatement();


			ResultSet myRs=mystmt.executeQuery("select * from  bookdetails where noofcopiesavailable = 0");
			if(myRs.next()){
				//count++;
				data+=myRs.getString("bookName");
				data+=",";
				data+=myRs.getString("bookrate");
				data+=":";
			}
			//data+=";"+Integer.toString(count);
			
			conn.close();
			mystmt.close();

		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		return data;

	}
	
	public String sendbookpriceaddtocart(String bookname){
		double price=0.0;
		
		String data="";
		Connection conn=null;

		Statement mystmt = null;

		
		try{
//			Properties prp = new Properties();
//			prp.load(new FileInputStream("src/main/resources/connection.properties"));
//			String dburl = prp.getProperty("DB_URL");
//			String user = prp.getProperty("DB_USERNAME");
//			String passw = prp.getProperty("DB_PASSWORD");
//			conn = DriverManager.getConnection(dburl, user, passw);
			conn=DbConnection.returnConnectionObject();
			mystmt=conn.createStatement();

			//"select LastModified from CacheTable where url = '" + url +"'"

			ResultSet myRs=mystmt.executeQuery("select * from  bookdetails where bookname = '"+bookname+"'"+"and archieve = 'no'");
			if(myRs.next()){
				double mrp=Integer.parseInt(myRs.getString("bookrate"));
				int dis=myRs.getInt("discount");
				if(dis>0){
					price=(mrp*dis)/100;
				}
				else{
					price=mrp;
				}
				
				String quan=Integer.toString(myRs.getInt("noofcopiesavailable"));
				
				data+=Double.toString(price)+","+quan;
				
			}
			
			
			
			conn.close();
			mystmt.close();

		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		return data;

	}
	
	public void addtocartdatabase(String userid,String bookname,double bookprice,int quanity,String rentbuy,String deliveryAddress){
		
		Connection conn=null;

		Statement mystmt = null;

		
		try{
//			Properties prp = new Properties();
//			prp.load(new FileInputStream("src/main/resources/connection.properties"));
//			String dburl = prp.getProperty("DB_URL");
//			String user = prp.getProperty("DB_USERNAME");
//			String passw = prp.getProperty("DB_PASSWORD");
//			conn = DriverManager.getConnection(dburl, user, passw);
			conn=DbConnection.returnConnectionObject();
			mystmt = conn.createStatement();
			

			mystmt.executeUpdate("INSERT INTO `addtocart`(userid,bookname,bookprice,quanity,rentbuy,deliveryAddress) "

					+ "VALUES ('"+userid+"','"+bookname+"','"+bookprice+"','"+quanity+"','"+rentbuy+"','"+deliveryAddress+"')");
			
			conn.close();
			mystmt.close();

			
		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		
	}
	
	public void addcarddetails(String bookname,String cardnumber,String cvv,Date expirydate){
		Connection conn=null;

		Statement mystmt = null;

		
		try{
//			Properties prp = new Properties();
//			prp.load(new FileInputStream("src/main/resources/connection.properties"));
//			String dburl = prp.getProperty("DB_URL");
//			String user = prp.getProperty("DB_USERNAME");
//			String passw = prp.getProperty("DB_PASSWORD");
//			conn = DriverManager.getConnection(dburl, user, passw);
			conn=DbConnection.returnConnectionObject();
			mystmt = conn.createStatement();
			

			mystmt.executeUpdate("INSERT INTO `carddetails`(cardnumber,cvv,expirydate) "

					+ "VALUES ('"+cardnumber+"','"+cvv+"','"+expirydate+"')");
			conn.close();
			mystmt.close();
			
		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		
	}

	public void addbookdata(String bookName, String bookCode, String bookDesc, String author, String bookcategory,
			String booktype, String buyingoption, String bookrate, int discount,int copies,int sold,int retu,String url) {
		
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
			String a="no";

//			int ra = mystmt.executeUpdate("insert into logindetails"

//					+ "(firstName,lastName,dob,gender,contactNo,email,userCategory,userId,pass)" + 

//					"value"

//					+ "(firstName,lastName,dob,gender,contactNo,email,userCategory,userId,'hj')");

			

			mystmt.executeUpdate("INSERT INTO `bookdetails`(bookName,bookCode,bookDesc,author,bookcategory,booktype,buyingoption,bookrate,discount,noofcopiesavailable,noofcopiessold,noofcopiesreturned,archieve,bookpreview) "

					+ "VALUES('"+bookName+"','"+bookCode+"','"+bookDesc+"','"+author+"','"+bookcategory+"','"+booktype+"','"+buyingoption+"','"+bookrate+"','"+discount+"','"+copies+
					"','"+sold+"','"+retu+"','"+a+"','"+url+
					"')");

			//("INSERT INTO `time_entry`(pid,tid,rid,tspend,description) VALUE ('"+pid+"','"+tid+"','"+rid+"',"+tspent+",'"+des+"')");
			conn.close();
			mystmt.close();

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		// TODO Auto-generated method stub
		
	}
	
	public void ordered(String bookname,int quantity){
		Connection conn=null;

		Statement mystmt = null;

		try{
//			Properties prp = new Properties();
//			prp.load(new FileInputStream("src/main/resources/connection.properties"));
//			String dburl = prp.getProperty("DB_URL");
//			String user = prp.getProperty("DB_USERNAME");
//			String passw = prp.getProperty("DB_PASSWORD");
//			conn = DriverManager.getConnection(dburl, user, passw);
			conn=DbConnection.returnConnectionObject();
			mystmt=conn.createStatement();

			//"select LastModified from CacheTable where url = '" + url +"'"

			ResultSet myRs=mystmt.executeQuery("select * from  bookdetails where bookname = '"+bookname+"'");
			if(myRs.next()){
				
				int quan=myRs.getInt("noofcopiesavailable");
				quan=quan-quantity;
				int myRsu=mystmt.executeUpdate("update bookdetails set noofcopiesavailable = '"+quan+"'"+"where bookname ='"+bookname+"'");
				int myRsui=mystmt.executeUpdate("update bookdetails set noofcopiessold = '"+quantity+"'"+"where bookname ='"+bookname+"'");
				
			}
			
			
			
			conn.close();
			mystmt.close();

		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		
	}
	public BookDetails searchbookbycode(String bookcode){
		BookDetails book=new BookDetails();
		Connection conn=null;
		Statement mystmt = null;
		
		try
		{
//			Properties prp = new Properties();
//			prp.load(new FileInputStream("src/main/resources/connection.properties"));
//			String dburl = prp.getProperty("DB_URL");
//			String user = prp.getProperty("DB_USERNAME");
//			String passw = prp.getProperty("DB_PASSWORD");
//			conn = DriverManager.getConnection(dburl, user, passw);
			conn=DbConnection.returnConnectionObject();
		mystmt=conn.createStatement();
		ResultSet myRs=mystmt.executeQuery("select * from  bookdetails where bookCode = '"+bookcode+"'");
		if (myRs.next()) 
		{
			
			book.setBookName(myRs.getString("bookName"));
			book.setBookCode(myRs.getString("bookCode"));
			book.setBookDesc((myRs.getString("bookDesc")));
			book.setAuthor((myRs.getString("author")));
			book.setBookcategory(myRs.getString("bookcategory"));
			book.setBooktype(myRs.getString("booktype"));
			book.setBuyingoption(myRs.getString("buyingoption"));
			book.setBookrate((myRs.getString("bookrate")));
			book.setDiscount((myRs.getInt("discount")));
			book.setNoofcopiesavailable(myRs.getInt("noofcopiesavailable"));
			book.setNoofcopiesreturned(myRs.getInt("noofcopiesreturned"));
		}

		}
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return book;
		}
	public HelpClass searchissuebycode(String helpid){
		HelpClass help=new HelpClass();
		Connection conn=null;
		Statement mystmt = null;
		
		try
		{
//			Properties prp = new Properties();
//			prp.load(new FileInputStream("src/main/resources/connection.properties"));
//			String dburl = prp.getProperty("DB_URL");
//			String user = prp.getProperty("DB_USERNAME");
//			String passw = prp.getProperty("DB_PASSWORD");
//			conn = DriverManager.getConnection(dburl, user, passw);
			conn=DbConnection.returnConnectionObject();
		mystmt=conn.createStatement();
		ResultSet myRs=mystmt.executeQuery("select * from  help where helpid = '"+helpid+"'");
		if (myRs.next()) 
		{
			
			help.setIssue(myRs.getString("issue"));
			help.setContactNo(myRs.getString("contactNo"));
		}

		}
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return help;
		}

	public void bookupdate(String bookcode, String rate, String dis, String available, String returned) {
		// TODO Auto-generated method stub
		Connection conn=null;

		Statement mystmt = null;

		
		try{
//			Properties prp = new Properties();
//			prp.load(new FileInputStream("src/main/resources/connection.properties"));
//			String dburl = prp.getProperty("DB_URL");
//			String user = prp.getProperty("DB_USERNAME");
//			String passw = prp.getProperty("DB_PASSWORD");
//			conn = DriverManager.getConnection(dburl, user, passw);
			conn=DbConnection.returnConnectionObject();
			mystmt=conn.createStatement();

			//"select LastModified from CacheTable where url = '" + url +"'"

			ResultSet myRs=mystmt.executeQuery("select * from  bookdetails where bookcode = '"+bookcode+"'");
			if(myRs.next()){
				
				mystmt.executeUpdate("update bookdetails set bookrate = '"+rate+"'"+"where bookCode ='"+bookcode+"'");
				mystmt.executeUpdate("update bookdetails set discount = '"+dis+"'"+"where bookCode ='"+bookcode+"'");
				mystmt.executeUpdate("update bookdetails set noofcopiesavailable = '"+available+"'"+"where bookCode ='"+bookcode+"'");
				mystmt.executeUpdate("update bookdetails set noofcopiesreturned = '"+returned+"'"+"where bookCode ='"+bookcode+"'");
				
			}
			
			
			
			conn.close();
			mystmt.close();

		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		
		
	}

	public void updatestatus(String userid, String name, String status) {
		// TODO Auto-generated method stub
		Connection conn=null;

		Statement mystmt = null;
		try{
			conn=DbConnection.returnConnectionObject();
			mystmt=conn.createStatement();
			mystmt.executeUpdate("update addtocart set trackstatus = '"+status+"'"+"where userid = '"+userid+"'"+"and bookname = '"+name+"'");
		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		
		

		
		
		
	}
	public void archievebook(String bookcode){
		Connection conn=null;

		Statement mystmt = null;
		String a="yes";
		try{
			conn=DbConnection.returnConnectionObject();
			mystmt=conn.createStatement();
			
			mystmt.executeUpdate("update bookdetails set archieve = '"+a+"'"+"where bookCode = '"+bookcode+"'");
		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		
	}

	public void unarchievebook(String bookcode) {
		// TODO Auto-generated method stub
		Connection conn=null;

		Statement mystmt = null;
		String a="no";
		try{
			conn=DbConnection.returnConnectionObject();
			mystmt=conn.createStatement();
			
			mystmt.executeUpdate("update bookdetails set archieve = '"+a+"'"+"where bookCode = '"+bookcode+"'");
		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
	}

	public void updatestatustopackaging(String userid, String bookname) {
		// TODO Auto-generated method stub
		Connection conn=null;

		Statement mystmt = null;
		try{
			conn=DbConnection.returnConnectionObject();
			mystmt=conn.createStatement();
			mystmt.executeUpdate("update addtocart set trackstatus = 'packaging' where userid = '"+userid+"'"+"and bookname = '"+bookname+"'");
		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		
	}

	public void updatehelp(String helpid, String update) {
		Connection conn=null;

		Statement mystmt = null;
		try{
			conn=DbConnection.returnConnectionObject();
			mystmt=conn.createStatement();
			mystmt.executeUpdate("update help set issue = '"+update+"'");
		}catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		
		

		
		
		
	}
	
	
	
	
}
	
	
		
		
	


