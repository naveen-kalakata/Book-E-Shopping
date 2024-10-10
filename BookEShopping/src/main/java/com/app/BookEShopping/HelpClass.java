package com.app.BookEShopping;
import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

public class HelpClass {
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dateofticket;
	private String helpId;
	private String contactNo;
	private String issue;
	public Date getDateofticket() {
		return dateofticket;
	}
	public void setDateofticket(Date dateofticket) {
		this.dateofticket = dateofticket;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getHelpId() {
		return helpId;
	}
	public void setHelpId(String helpId) {
		this.helpId = helpId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
}
