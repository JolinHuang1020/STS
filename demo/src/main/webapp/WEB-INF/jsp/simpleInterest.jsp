<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>e</title>
</head>
<body>

<p>Please enter the detail information</p>

<form action="/getResult" method="post">
	<p>Principal: <input type="text" name="principal"/></p>
	<p>#of Year: <input type="text" name="numOfYear"/></p>
	<p>Interest Rate: <input type="text" name="interestRate"/></p>
	<input type="submit" value="Submit this form by clicking here"/>
	<input type="reset" value="Reset" />
</form>

</body>
</html>