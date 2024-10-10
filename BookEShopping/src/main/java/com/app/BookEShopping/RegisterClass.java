package com.app.BookEShopping;



import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;


public class RegisterClass {
private String firstName;
private String lastName;
@DateTimeFormat(pattern = "dd-MM-yyyy")
private Date dob;
private String gender;
private String contactNo;
private String email;
private String userCategory;
private String userId;
private String password;
private String petname;
private String favteachername;
private String schoolname;
//public RegisterClass(String firstName, String lastName, Date dob, String gender, String contactNo, String email,
//String userCategory, String userId, String password) {
//super();
//this.firstName = firstName;
//this.lastName = lastName;
//this.dob = dob;
//this.gender = gender;
//this.contactNo = contactNo;
//this.email = email;
//this.userCategory = userCategory;
//this.userId = userId;
//this.password = password;
//}
//public RegisterClass() {
//	// TODO Auto-generated constructor stub
//}
public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lastName) {
this.lastName = lastName;
}
public Date getDob() {
return dob;
}
public void setDob(Date dob) {
this.dob = dob;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public String getContactNo() {
return contactNo;
}
public void setContactNo(String contactNo) {
this.contactNo = contactNo;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getUserCategory() {
return userCategory;
}
public void setUserCategory(String userCategory) {
this.userCategory = userCategory;
}
public String getUserId() {
return userId;
}
public void setUserId(String userId) {
this.userId = userId;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}

@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
RegisterClass other = (RegisterClass) obj;
if (userId != other.userId)
return false;
return true;
}
public String getPetname() {
	return petname;
}
public void setPetname(String petname) {
	this.petname = petname;
}
public String getFavteachername() {
	return favteachername;
}
public void setFavteachername(String favteachername) {
	this.favteachername = favteachername;
}
public String getSchoolname() {
	return schoolname;
}
public void setSchoolname(String schoolname) {
	this.schoolname = schoolname;
}


}