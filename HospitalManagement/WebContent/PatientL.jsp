<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
String errormsg = (String)request.getAttribute("msg");
if(errormsg!=null){
--%>
<!--  <h3 style="color:red"><%--errormsg--%></h3>-->
<%--} --%>


<h1>Registration successful please login</h1>


<form action="PatientLogin" method="post">

<table width="50%">
<tr height="40">
<td>UserName:</td>
<td><input type="text" placeholder="UserName" name="userid" maxlength="10" /></td>
</tr>
<tr height="40">
<td>Password:</td>
<td><input type="password" placeholder="Password" name="password" maxlength="10" /></td>
</tr>
<tr height="40">
<td><input type="submit"  value="Login"/></td>
</tr>
</table>
</form>
</body>
</html>
