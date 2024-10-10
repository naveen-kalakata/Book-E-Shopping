<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
			style="background-color: white; font-size: 20px; float: right; margin-top: 80px; margin-right: 20px">
				<a href="/adminhome">Home</a>
			<a href="/logout">Logout</a>
		</div>
	</div>

	

	<div>
		<h2 style="text-align:center">
		<font color="green">${msg}</font>
		</h2>
		<form:form method="post" modelAttribute="bookdetails"
			action="/addbookdetails">
			<fieldset>
				<form:label path="bookName">Book Name*</form:label>
				<form:input type="text" placeholder="Enter the Book Name"
					required="required" path="bookName" />
			</fieldset>
			<fieldset>
				<form:label path="bookCode">Book Code*</form:label>
				<form:input type="text" path="bookCode"
					placeholder="Enter the Book Code" required="required" />
			</fieldset>
			<fieldset>
				<form:label path="bookDesc">Book Description*</form:label>
				<form:input type="text" path="bookDesc"
					placeholder="Enter the Book Description" required="required" />
			</fieldset>
			<fieldset>
				<form:label path="author">Author*</form:label>
				<form:input type="text" path="author" placeholder="Enter the Author"
					required="required" />
			</fieldset>
			<fieldset>
				<form:label path="bookcategory">Category*</form:label>
				<form:select required="required" path="bookcategory">
					<option value="Fiction">Fiction</option>
					<option value="Horror">Horror</option>
					<option value="Personalitydevlopment">Personality
						devlopment</option>
					<option value="Reference">Reference</option>
					<option value="Novel">Novel</option>
					<option value="Comic">Comic</option>
					<option value="Kidsbook">Kidsbook</option>
					<option value="Etc">Other</option>
				</form:select>
			</fieldset>
			<fieldset>
				<form:label path="booktype">Type*</form:label>
				<form:select required="required" path="booktype">
					<option value="EBook">EBook</option>
					<option value="Hardcopy">Hardcopy</option>
				</form:select>
			</fieldset>
			<fieldset>
				<form:label path="buyingoption">Option*</form:label>
				<form:select required="required" path="buyingoption">
					<option value="Renting">Renting</option>
					<option value="tobuy">BUY</option>
					<option value="rent/buy">Rent/BUY</option>
				</form:select>
			</fieldset>
			<fieldset>
				<form:label path="bookrate">Rate*</form:label>
				<form:input type="text" path="bookrate" placeholder="Enter the Rate"
					required="required" pattern="[0-9]+" title="enter number only" />
			</fieldset>
			<fieldset>
				<form:label path="discount">Discount</form:label>
				<form:input type="text" path="discount"
					placeholder="Enter the Discount (if any) " pattern="[0-9]+"
					title="enter number only" required="required" />
			</fieldset>
			<fieldset>
				<form:label path="noofcopiesavailable">No. Of Copies Available:*</form:label>
				<form:input type="number" path="noofcopiesavailable"
					placeholder="Enter the no of copiesavailable" value='0' min='0'
					pattern="[0-9]+" title="enter number only" required="required" />
			</fieldset>
			<fieldset>
				<form:label path="noofcopiessold">No. Of Copies Sold:*</form:label>
				<form:input type="number" path="noofcopiessold"
					placeholder="Enter the no of copiessold" value='0' min='0'
					pattern="[0-9]+" title="enter number only" required="required" />
			</fieldset>
			<fieldset>
				<form:label path="noofcopiesreturned">No. Of Copies Returned:*</form:label>
				<form:input type="number" path="noofcopiesreturned"
					placeholder="Enter the no of copiesreturned" value='0' min='0'
					pattern="[0-9]+" title="enter number only" required="required" />
			</fieldset>
			<fieldset>
				<form:label path="bookpreview">Book Preview:*</form:label>
				<form:input type="text" path="bookpreview"
					placeholder="Enter the book link" required="required" />
			</fieldset>
			<input type="submit" />
		</form:form>
	</div>
	

</body>
</html>
