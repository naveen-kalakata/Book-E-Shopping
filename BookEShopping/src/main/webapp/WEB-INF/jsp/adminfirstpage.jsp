
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
if("${data}"===""){
	alert("stock available");
}else{
	alert("some books are required to be purchased ${data}");
}

</script>
</head>
<style>
body{
background-repeat:no-repeat;
background-position:center;
background-size:50%;
}
h3{
color:white;}
</style>
<body background="https://static.scientificamerican.com/sciam/cache/file/1DDFE633-2B85-468D-B28D05ADAE7D1AD8_source.jpg?w=590&h=800&D80F3D79-4382-49FA-BE4B4D0C62A5C3ED">

<div>
<span style="display: inline-block;"><h1><i><b>Book-E-Shopping</b></i></h1></span>
<span style="display: inline-block;margin-top:10px;"><img src="https://www.logolynx.com/images/logolynx/51/518a650b8f036ca07a763ee8337d858c.jpeg" style="width:100px;height:100px;border-radius:50px"></span>

<div style="font-size:20px;float:right;margin-top:80px;margin-right:20px">
	<a href="/logout">Logout</a>
</div>
</div>

<div style="float:left;width:50%">
<ul style="list-style-type:none;font-size:25px;">
<li><a href="/addresoures">Add Resources</a></li>
<li><a href="/showbookdetails"> Resources List</a></li>
<li><a href="/seeallordersinadmin">Orders</a></li>
<li><a href="/seefeedback">See Feedback</a></li>
<li><a href="/seehelp">View Issues</a>
</ul>
</div>
<div style="float:left;width:50%;">
<h3>
	WELCOME ADMIN ${u}
</h3>
</div>

</body>
</html>
