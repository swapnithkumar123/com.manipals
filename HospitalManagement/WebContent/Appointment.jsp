<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Appointment" method="get">
<table width="50%">
<tr height="40">
<h1>Appointment Deatils</h1></tr>
<tr height="40">
<td>Patient Id</td>
<td><input type="text" placeholder="Enter Patient Id" name="patientid" maxlength="10" required/></td>
</tr>
<tr height="40">
<td>Doctor Id</td>
<td><input type="text" placeholder="Enter Doctor Id" name="docid" maxlength="10" required/></td>
</tr>
<tr>
<td>Appointment Location</td>
<td><input type="text" placeholder="Enter Location" name="location" maxlength="10" required /></td>
</tr>
<tr>
<tr height="40">
<td>Appointment Date and Time</td>
<td><input type="text" placeholder="dd/mm/yyyy HH:MM" name="date" maxlength="10" required/></td>
</tr>
<tr height="40">
<td><input type="submit"  value="submit"/></td>

</tr>
</table>
</form>
</body>
</html>