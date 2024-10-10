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
			style="background-color: white; font-size: 20px; float: right; margin-top: 80px; margin-right: 20px">
			<a href="/logout">Logout</a>

		</div>
</div>
<div>
		<h2 style="text-align:center" id="v1">
			<font color="Yellow">${m2}</font>
		</h2>
		<form:form method="post" modelAttribute="helpclass"
			action="/help" id="h">
			<fieldset>
				<form:label path="dateofticket">Date Of ticket</form:label>
				<form:input path="dateofticket" type="date" required="required" />
			</fieldset>
			<fieldset>
				<form:label path="helpId">Help Id</form:label>
				<form:input path="helpId" type="text" value="${helpId}"
					readonly="true" />
			</fieldset>
			<fieldset>
				<form:label path="contactNo">Contact Number</form:label>
				<form:input type="tel" path="contactNo" pattern="[7-9]{1}[0-9]{9}"
					required="required" />
			</fieldset>
			<fieldset>
				<form:label path="issue">Issue Description</form:label>
				<form:input path="issue" type="text" required="required"/>
			</fieldset>
			<input type="submit" />
		</form:form>
	</div>
	
</body>
</html>