<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
</style>
<body background="https://static.scientificamerican.com/sciam/cache/file/1DDFE633-2B85-468D-B28D05ADAE7D1AD8_source.jpg?w=590&h=800&D80F3D79-4382-49FA-BE4B4D0C62A5C3ED">
<div>
		<span style="display: inline-block;"><h1>
				<i><b>Book-E-Shopping</b></i>
			</h1></span> <span style="display: inline-block; margin-top: 10px;"><img
			src="https://www.logolynx.com/images/logolynx/51/518a650b8f036ca07a763ee8337d858c.jpeg"
			style="width: 100px; height: 100px; border-radius: 50px"></span>


		<div
			style="background-color: white; font-size: 20px; float: right; margin-top: 80px;margin-right:50px;">
			<a href="/login">Login</a>
		</div>
	</div>
	<form method="post" action="/forgotpassword">
		
		<fieldset>
					<label>User Id</label> 
					<input type="text" name="userid" required="required"/>
		</fieldset>
		<fieldset>
			<label>What is your Pet name?</label>
			<input name="petname" required="required"/>
		</fieldset>
		<fieldset>
			<label>Who is your favourite childhood teacher?</label>
			<input name="favteachername" required="required"/>
		</fieldset>
		<fieldset>
			<label>What is your School Name?</label>
			<input name="schoolname" required="required"/>
		</fieldset>	
		<fieldset>
			<label>New Password</label>
			<input name="pass" required="required" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
  title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters"/>
		</fieldset>	
		<input type="submit" value="UPDATE"/>
	</form>

</body>
</html>