<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<form action="/submitAdmissionForm" method="post">

<table>
<tr>
	<td>Student Name:</td> <td><input type="text" name="studentName"/></td>
</tr>
<tr>
	<td>Student Hobby:</td> <td><input type="text" name="studentHobby"/></td>
</tr>
<tr>
	<td>Student Mobile:</td> <td><input type="text" name="studentMobile"/></td>
</tr>
<tr>
	<td>Student DOB:</td> <td><input type="text" name="studentDOB"/></td>
</tr>
<tr>
	<td>Student Skills:</td> <td><select name="studentSkills" multiple>
								<option value="Java Core">Java Core</option>
								<option value="Spring Core">Spring Core</option>
								<option value="Spring Boot">Spring Boot</option>
								</select></td>	
</table>	
	<input type="submit" value="Submit this form by clicking here"/>
	<input type="reset" value="Reset" />
</form>

</body>
</html>