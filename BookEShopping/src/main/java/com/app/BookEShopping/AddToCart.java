package com.app.BookEShopping;

import java.util.Date;


public class AddToCart {
	private String userid;
	private String bookname;
	private double bookprice;
	private int quanity;
	private String rentbuy;
	private String deliveryAddress;
	private String trackstatus;
	private String cardnumber;
	private Date expirydate;
	private String cvv;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	public String getRentbuy() {
		return rentbuy;
	}
	public void setRentbuy(String rentbuy) {
		this.rentbuy = rentbuy;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getTrackstatus() {
		return trackstatus;
	}
	public void setTrackstatus(String trackstatus) {
		this.trackstatus = trackstatus;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	

}
