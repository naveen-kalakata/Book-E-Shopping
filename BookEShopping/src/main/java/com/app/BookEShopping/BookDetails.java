package com.app.BookEShopping;

public class BookDetails {
	private String bookName;
	private String bookCode;
	private String bookDesc;
	private String author;
	//fiction,scifi,horror,personaltiydevelopment,reference,novel,comic,kidsbook,other
	private String bookcategory;
	//E-book,hardcopy
	private String booktype;
	//renting,to buy
	private String buyingoption;
	private String bookrate;
	private int discount;
	private int noofcopiesavailable;
	private int noofcopiessold;
	private int noofcopiesreturned;
	private String bookpreview;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookDesc() {
		return bookDesc;
	}
	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookcategory() {
		return bookcategory;
	}
	public void setBookcategory(String bookcategory) {
		this.bookcategory = bookcategory;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public String getBuyingoption() {
		return buyingoption;
	}
	public void setBuyingoption(String buyingoption) {
		this.buyingoption = buyingoption;
	}
	public String getBookrate() {
		return bookrate;
	}
	public void setBookrate(String bookrate) {
		this.bookrate = bookrate;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getNoofcopiesavailable() {
		return noofcopiesavailable;
	}
	public void setNoofcopiesavailable(int noofcopiesavailable) {
		this.noofcopiesavailable = noofcopiesavailable;
	}
	public int getNoofcopiessold() {
		return noofcopiessold;
	}
	public void setNoofcopiessold(int noofcopiessold) {
		this.noofcopiessold = noofcopiessold;
	}
	public int getNoofcopiesreturned() {
		return noofcopiesreturned;
	}
	public void setNoofcopiesreturned(int noofcopiesreturned) {
		this.noofcopiesreturned = noofcopiesreturned;
	}
	public String getBookpreview() {
		return bookpreview;
	}
	public void setBookpreview(String bookpreview) {
		this.bookpreview = bookpreview;
	}
	

}
