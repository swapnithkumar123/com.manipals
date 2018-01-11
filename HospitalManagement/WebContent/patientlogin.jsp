<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="PatientLoginValidation" method="get">
<table width="50%">
<tr height="40">
<td>User Name*</td>
<td><input type="text" placeholder="Enter Ur Name" name="pname" maxlength="10" required /></td>
</tr>
<tr>
<tr height="40">
<td>Password*</td>
<td><input type="password" placeholder="Enter Ur Password" name="password" maxlength="10" required/></td>
</tr>
<tr height="40">
<td><input type="submit"  value="Login"/></td>

</tr>
</table>
</form>
</body>
</html>