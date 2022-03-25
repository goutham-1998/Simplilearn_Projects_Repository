<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes</title>
</head>
<body style="background-color:rgb(255,252,211)">
<br>

<h2 style="color:blue;">Please Enter Your Email ID and New Password</h2>
<div style="border:3px solid pink;width:25%;border-radius:20px;padding:20px">
<form action=adminForgotPassword method=post>
	<label for=email>Email :-</label> <input type="email" name=email id=email /><br><br>
	<label for=pass>New Password :-</label> <input type="password" name=password id=pass /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>
</div><br><br>
<a href=Home.jsp style="color:Green;text-decoration:none ;font-size:20px;font-weight:bold;"> Click Here to Logout and Re-Login</a>
<br><br>
<p style="color:Green;">${message}</p>
</body>
</html>