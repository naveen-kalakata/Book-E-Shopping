package com.app.BookEShopping.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.app.BookEShopping.dao.RegisterClassService;

public class LoginValidationTest {

	@Test
	public void trueloginvalidationtestforcustomer() throws SQLException {
		
		Connection conn=Dbconnectiontest.returnConnectionObject();
		Statement mystmt=conn.createStatement();
		ResultSet myRs=mystmt.executeQuery("select * from  logindetails ");
		boolean flag=true;

		

		if((myRs.next())){

			String id=myRs.getString("userId");

			if(id.equals("888888")){
				flag=false;
			}
				
			}
		if(flag==true){
			mystmt.executeUpdate("insert into logindetails(userCategory,userId,pass) values('customer','888888','Abc@1234')");
		}
		RegisterClassService dao=new RegisterClassService();
		String acop=dao.LoginValidation("888888", "Abc@1234");
		if(acop.equals("customer")){
			assertTrue(true);
		}
		else{
			assertFalse(false);
		}
		//assertEquals("customer",acop);

		
	}
	@Test
	public void trueloginvalidationtestforadmin() throws SQLException {
		
		Connection conn=Dbconnectiontest.returnConnectionObject();
		Statement mystmt=conn.createStatement();
		ResultSet myRs=mystmt.executeQuery("select * from  logindetails ");
		boolean flag=true;

		

		if((myRs.next())){

			String id=myRs.getString("userId");

			if(id.equals("888889")){
				flag=false;
			}
				
			}
		if(flag==true){
			mystmt.executeUpdate("insert into logindetails(userCategory,userId,pass) values('admin','888889','Abd@1234')");
		}
		RegisterClassService dao=new RegisterClassService();
		String acop=dao.LoginValidation("888889", "Abd@1234");
		if(acop.equals("admin")){
			assertTrue(true);
		}
		else{
			assertFalse(false);
		}
		//assertEquals("customer",acop);

		
	}
	@Test
	public void falseloginvalidationtestforcustomer() throws SQLException {
		
		Connection conn=Dbconnectiontest.returnConnectionObject();
		Statement mystmt=conn.createStatement();
		ResultSet myRs=mystmt.executeQuery("select * from  logindetails ");
		boolean flag=true;

		

		if((myRs.next())){

			String id=myRs.getString("userId");

			if(id.equals("888888")){
				flag=false;
			}
				
			}
		if(flag==true){
			mystmt.executeUpdate("insert into logindetails(userCategory,userId,pass) values('customer','888888','Abc@1234')");
		}
		RegisterClassService dao=new RegisterClassService();
		String acop=dao.LoginValidation("888888", "Dbc@1234");
		assertNotEquals("customer","");

		
	}
	@Test
	public void falseloginvalidationtestforadmin() throws SQLException {
		
		Connection conn=Dbconnectiontest.returnConnectionObject();
		Statement mystmt=conn.createStatement();
		ResultSet myRs=mystmt.executeQuery("select * from  logindetails ");
		boolean flag=true;

		

		if((myRs.next())){

			String id=myRs.getString("userId");

			if(id.equals("888889")){
				flag=false;
			}
				
			}
		if(flag==true){
			mystmt.executeUpdate("insert into logindetails(userCategory,userId,pass) values('admin','888889','Abd@1234')");
		}
		RegisterClassService dao=new RegisterClassService();
		String acop=dao.LoginValidation("888889", "bd@1234");
		assertNotEquals("admin","");

		//assertEquals("customer",acop);

		
	}
	

	
	

}
