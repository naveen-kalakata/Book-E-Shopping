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
		<span style="display: inline-block;"><h1>
				<i><b>Book-E-Shopping</b></i>
			</h1></span> <span style="display: inline-block; margin-top: 10px;"><img
			src="https://www.logolynx.com/images/logolynx/51/518a650b8f036ca07a763ee8337d858c.jpeg"
			style="width: 100px; height: 100px; border-radius: 50px"></span>

		<div
			style="font-size: 20px; float: right; margin-top: 80px; margin-right: 20px">
				<a href="/adminhome">Home</a>
			<a href="/logout">Logout</a>
		</div>
	</div>


<div>
<font color="green">${msg}</font>

	<form method="post" action="/updatebookdetails">
	<input name="bookcode" value="${bookcode}" readonly="true"/>
	
		<table>
			<tr>
				<td><label>Rate</label> </td>
				<td><input type="text" name="rate" 
				placeholder="Enter the Rate" required="required" pattern="[0-9]+" title="enter number only" value="${rate}"/></td>
			</tr>
			<tr>
				<td><label>Discount</label> </td>
				<td><input type="text" name="dis"
				placeholder="Enter the Discount (if any) " pattern="[0-9]+" title="enter number only" value="${dis}"/></td>
			</tr>
			<tr>
				<td><label>No. Of Copies Available:</label> </td>
				<td><input type="number" name="available"
				placeholder="Enter the no of copiesavailable" pattern="[0-9]+" title="Enter number only" value="${available}"/></td>
			</tr>
			<tr>
				<td><label>No. Of Copies Returned:</label> </td>
				<td><input type="number" name="returned"
				placeholder="Enter the no of copiesreturned" pattern="[0-9]+" title="enter number only" value="${return}"/></td>
			</tr>
		</table>
		<input type="submit"/>
	</form>
</div>	
</body>
</html>