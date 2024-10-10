<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
background-repeat:no-repeat;
background-position:center;
background-size:50%;
}
#v1{
color:green;}
</style>
<body background="https://static.scientificamerican.com/sciam/cache/file/1DDFE633-2B85-468D-B28D05ADAE7D1AD8_source.jpg?w=590&h=800&D80F3D79-4382-49FA-BE4B4D0C62A5C3ED">
	<div>
		<span style="display: inline-block;"><h1>
				<i><b>Book-E-Shopping</b></i>
			</h1></span> <span style="display: inline-block; margin-top: 10px;"><img
			src="https://www.logolynx.com/images/logolynx/51/518a650b8f036ca07a763ee8337d858c.jpeg"
			style="width: 100px; height: 100px; border-radius: 50px"></span>


		<div
			style="font-size: 20px; float: right; margin-top: 80px">
			<a href="/login">Login</a>&nbsp&nbsp <a href="/registeruser">Register
				as user</a>&nbsp&nbsp <a href="/registeradmin">Register as admin</a>
		</div>
	</div>

	<div>
		<h5>All fields are mandatory</h5>
		<h2 style="text-align:center" id="v1">
			<font color="green">${msg}</font>
		</h2>
		<form:form method="post" modelAttribute="registerclass"
			action="/register" id="reg">
			<fieldset>
				<form:label path="firstName">First Name</form:label>
				<form:input type="text" placeholder="Enter Your First Name"
					required="required" pattern="[A-Za-z]+" path="firstName" />
			</fieldset>
			<fieldset>
				<form:label path="lastName">Last Name</form:label>
				<form:input type="text" path="lastName"
					placeholder="Enter Your Last Name" required="required"
					pattern="[A-Za-z]+" />
			</fieldset>
			<fieldset>
				<form:label path="dob">Date Of Birth</form:label>
				<form:input path="dob" type="date" required="required" />
			</fieldset>
			<fieldset>
				<form:label path="gender">Gender</form:label>
				<form:select required="required" path="gender">
					<option value="male">Male</option>
					<option value="female">Female</option>
				</form:select>
			</fieldset>
			<fieldset>
				<form:label path="contactNo">Contact Number</form:label>
				<form:input type="tel" path="contactNo" pattern="[7-9]{1}[0-9]{9}"
					required="required" />
			</fieldset>
			<fieldset>
				<form:label path="email">Email</form:label>
				<form:input type="email" path="email" required="required"
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
					title="not a valid email" />
			</fieldset>
			<fieldset>
				<form:label path="userCategory">User Category</form:label>
				<form:input path="userCategory" value="${category}" readonly="true" />
			</fieldset>
			<fieldset>
				<form:label path="userId">User Id</form:label>
				<form:input path="userId" type="text" value="${userId}"
					readonly="true" />
			</fieldset>
			<fieldset>
				<form:label path="password">Password</form:label>
				<form:input path="password" type="password" required="required"
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters" />
			</fieldset>
			<fieldset>
				<form:label path="petname">What is your Pet name?</form:label>
				<form:input path="petname" required="required" />
			</fieldset>
			<fieldset>
				<form:label path="favteachername">Who is your favourite childhood teacher name?</form:label>
				<form:input path="favteachername" required="required" />
			</fieldset>
			<fieldset>
				<form:label path="schoolname">What is your School Name?</form:label>
				<form:input path="schoolname" required="required" />
			</fieldset>
			<input type="submit" />
		</form:form>
	</div>
	
</body>
</html>