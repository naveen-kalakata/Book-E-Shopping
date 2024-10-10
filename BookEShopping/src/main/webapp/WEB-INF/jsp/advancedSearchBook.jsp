<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<div>
<span style="display: inline-block;"><h1><i><b>Book-E-Shopping</b></i></h1></span>
<span style="display: inline-block;margin-top:10px;"><img src="https://www.logolynx.com/images/logolynx/51/518a650b8f036ca07a763ee8337d858c.jpeg" style="width:100px;height:100px;border-radius:50px"></span>

<div style="background-color:white;font-size:20px;float:right;margin-top:80px;margin-right:20px">
	<a href="/logout">Logout</a>
	
</div>
</div>


<form method="POST" action="/advancedSearchBook">

<div>
<fieldset>
<label for="books">Category of book:</label>
 <select name="category" id="books">
 	<option value="">-----</option>
   <option value="fiction">Fiction</option>
   <option value="sci fiction">sci fiction</option>
   <option value="horror">Horror</option>
   <option value="personality development">Personality Development</option>
   <option value="reference">Reference</option>
   <option value="novels">Novels</option>
   <option value="comic">Comic</option>
   <option value="kids books">Kids Books</option>
   <option value="Etc">Other</option>
</fieldset>
</div>
<input placeholder="book name keyword" name="keyword" value=""/>
<input type="submit" placeholder="Submit"> 
<br>
<font color="green"> ${msg}</font>
</form>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<thead>
<tr>
<td><b>bookName</b></td>
<td><b>bookCode</b></td>
<td><b>bookDesc</b></td>
<td><b>author</b></td>
<td><b>bookcategory</b></td>
<td><b>booktype</b></td>
<td><b>buyingoption</b></td>
<td><b>bookrate</b></td>
<td><b>discount</b></td>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="book">
					<tr>
						<td>${book.bookName}</td>
						<td>${book.bookCode}</td>
						<td>${book.bookDesc}</td>
						<td>${book.author}</td>
						<td>${book.bookcategory}</td>
						<td>${book.booktype}</td>
						<td>${book.buyingoption}</td>
						<td>${book.bookrate}</td>
						<td>${book.discount}</td>
						
					</tr>
</c:forEach>

</tbody>
</table>

</div>
</body>
</html>