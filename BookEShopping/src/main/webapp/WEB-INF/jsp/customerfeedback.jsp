<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback</title>
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
		<h2 style="text-align:center">
			<font color="green">${m1}</font>
		</h2>
		<span style="display: inline-block;"><h1>
				<i><b>Book-E-Shopping</b></i>
			</h1></span> <span style="display: inline-block; margin-top: 10px;"><img
			src="https://www.logolynx.com/images/logolynx/51/518a650b8f036ca07a763ee8337d858c.jpeg"
			style="width: 100px; height: 100px; border-radius: 50px"></span>

		<div
			style="background-color: white; font-size: 20px; float: right; margin-top: 80px; margin-right: 20px">
			<a href="/logout">Logout</a>

		</div>
	</div>

<div>
<br><br>
<form method="POST" action="/customerfeedback">
<div>
<fieldset>
<label>User Name</label> <input type="text" name="username"
placeholder="enter your name" required="required">
</fieldset>
</div>
<br>
<div>
<fieldset>
<label>Contact No.</label> <input type="tel" name="contactno"
placeholder="enter your number"  pattern="[7-9]{1}[0-9]{9}" required="required">
</fieldset>
</div>
<br>

<div>
<fieldset>
<label>Reviews/Feedback</label> <input type="text" name="feedback"
placeholder="enter feedback" required="required">
</fieldset>
</div>
<input type="submit" value="CustomerFeedback"> 

</form>


</div>




<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "bookshopping";
String userId = "root";
String password = "root";

//try {
// Class.forName(driverName);
//} catch (ClassNotFoundException e) {
//e.printStackTrace();
//}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

</body>
</html>
