<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
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
</style>
<body background="https://static.scientificamerican.com/sciam/cache/file/1DDFE633-2B85-468D-B28D05ADAE7D1AD8_source.jpg?w=590&h=800&D80F3D79-4382-49FA-BE4B4D0C62A5C3ED">
	<div>
	<br><br>
		<form method="POST" action="/login">
		<font color="red">${errorMessage}</font>
			<div>
				<fieldset>
					<label>User Id</label> <input type="text" name="userid"
						placeholder="Enter your user Id" required="required">
				</fieldset>
			</div>
			<br>
			<div>
				<fieldset>
					<label>Password</label> <input type="password" name="pswrd"
						placeholder="Enter your Password" required="required">
				</fieldset>
			</div>
			<br>
			<input type="submit" value="Login"> 
			
		</form>
		<br><br>
		
		<br><br>
		<a href="/forgotpassword">FORGOT PASSWORD</a>
		<br><br>
		<a href="/forgotuserid">FORGOT USERID</a>
		
	</div>
</body>
</html>