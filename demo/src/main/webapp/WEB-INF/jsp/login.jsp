<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<form action="/loginSuccessfully" method="post">
	<p>User Name: <input type="text" name="userName"/></p>
	<p>User Password: <input type="text" name="password"/></p>
	<p>User Email Address: <input type="text" name="email"/></p>
	<input type="submit" value="Submit this form by clicking here"/>
	<input type="reset" value="Reset" />
</form>
</body>
</html>