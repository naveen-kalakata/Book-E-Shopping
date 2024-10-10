<html>
<style>
body{
background-repeat:no-repeat;
background-position:center;
background-size:50%;
}
</style>
<body background="https://static.scientificamerican.com/sciam/cache/file/1DDFE633-2B85-468D-B28D05ADAE7D1AD8_source.jpg?w=590&h=800&D80F3D79-4382-49FA-BE4B4D0C62A5C3ED">

<div>
<span style="display: inline-block;"><h1><i><b>Book-E-Shopping</b></i></h1></span>
<span style="display: inline-block;margin-top:10px;"><img src="https://www.logolynx.com/images/logolynx/51/518a650b8f036ca07a763ee8337d858c.jpeg" style="width:100px;height:100px;border-radius:50px"></span>

<div style="font-size:20px;float:right;margin-top:80px;margin-right:20px">
	<a href="/logout">Logout</a>
	<a href="/custhome">Home</a>
</div>
</div>

<br>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%

String cat = request.getParameter("bookscat");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "bookshopping";
String userId = "root";
String password = "root";

try {
 Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<table align="center" cellpadding="5" cellspacing="5" border="1">
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
<td><b>noofcopiesavailable</b></td>
<td><b>bookpreview</b></td>

</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="select * from bookdetails where archieve ='no' and bookcategory ='"+cat+"' order by bookcategory desc";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

<tr>
<td><%=resultSet.getString("bookName") %></td>
<td><%=resultSet.getString("bookCode") %></td>
<td><%=resultSet.getString("bookDesc") %></td>
<td><%=resultSet.getString("author") %></td>
<td><%=resultSet.getString("bookcategory") %></td>
<td><%=resultSet.getString("booktype") %></td>
<td><%=resultSet.getString("buyingoption") %></td>
<td><%=resultSet.getString("bookrate") %></td>
<td><%=resultSet.getString("discount") %></td>
<td><%=resultSet.getString("noofcopiesavailable") %></td>
<td><a href="<%=resultSet.getString("bookpreview") %>" target="_blank">bookpreview</a></td>
</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body></html>