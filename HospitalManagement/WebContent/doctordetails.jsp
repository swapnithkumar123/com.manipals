<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="dbconn" method="get">
<table width="50%">
<tr height="40">
<td>Enter DoctorId:</td>
<td><input type="text" placeholder="doctor Id" name="doctorid" maxlength="10" required/></td>
</tr>
<tr height="40">
<td>Enter doctor Name</td>
<td><input type="text" placeholder="doctor Name" name="docname" maxlength="10" required/></td>
</tr>
<tr height="40">
<td>Enter Department Name:</td>
<td><input type="text" placeholder="department Name" name="deptname" maxlength="10" /required></td>
</tr>
<tr height="40">
<td><input type="submit"  value="submit"/></td>
</tr>
</table>
</form>

</body>
</html>