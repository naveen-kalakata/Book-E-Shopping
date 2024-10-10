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
background-size: 50%;        
}
label{
color:black;
}
</style>
<body background="https://static.scientificamerican.com/sciam/cache/file/1DDFE633-2B85-468D-B28D05ADAE7D1AD8_source.jpg?w=590&h=800&D80F3D79-4382-49FA-BE4B4D0C62A5C3ED">
<div>
<span style="display: inline-block;"><h1><i><b>Book-E-Shopping</b></i></h1></span>
<span style="display: inline-block; margin-top: 10px;"><img
			src="https://www.logolynx.com/images/logolynx/51/518a650b8f036ca07a763ee8337d858c.jpeg"
			style="width: 100px; height: 100px; border-radius: 50px"></span>
</div>

<div style="float:left;width:50%">
	<br><br>
		<form method="POST" action="/login">
		<font color="red">${errorMessage}</font>
		<fieldset>
			
				<fieldset>
					<label><b>User Id</b></label> <input type="text" name="userid"
						placeholder="enter your user id" required="required">
				</fieldset>
			
			<br>
			
				<fieldset>
					<label><b>Password</b></label> <input type="password" name="pswrd"
						placeholder="enter your password" required="required">
				</fieldset>
			
			<br>
			<input type="submit" value="Login"> 
		</fieldset>	
		</form>
		<br><br>
		
		
		
	</div>
	<div style="font-size:20px;float:left;margin-top:1px;margin-right:500px;">
<a href="/registeruser">Register as user</a>&nbsp&nbsp
<a href="/registeradmin">Register as admin</a>
<br><br>
		<a href="/forgotpassword">FORGOT PASSWORD</a>
		<br><br>
		<a href="/forgotuserid">FORGOT USERID</a>
</div>


</body>
</html>