<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Form</h1>
<%
String errormsg = (String)request.getAttribute("msg");
if(errormsg!=null){
%>
<h3 style="color:red"><%=errormsg%></h3>
<%} %>

<form action="patientValidate" method="get">
<table width="50%">
<tr height="40">
<td>Patient:</td>
<td><input type="text" placeholder="Enter Ur Name" name="name" maxlength="10" /></td>
</tr>
<tr height="40">
<td>phonenumber:</td>
<td><input type="text" placeholder="Enter Ur phone" name="no" maxlength="10" /></td>
</tr><tr height="40">
<tr height="40">
<td>Password:</td>
<td><input type="password" placeholder="Enter Ur Password" name="password" maxlength="10" /></td>
</tr>
<td>Email:</td>
<td><input type="email" placeholder="Enter Ur Email" name="mail" maxlength="20" /></td>
</tr><tr height="40">
<tr height="40">
<td><input type="submit"  value="submit"/></td>
</tr>
</table>
</form>

</body>
</html>
