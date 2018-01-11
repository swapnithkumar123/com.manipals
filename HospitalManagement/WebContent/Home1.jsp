<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String Name=(String)request.getAttribute("Name"); 

out.print("welcome"+Name);
%>
<br/>
<a href="main.jsp">Go to Main page</a>


<!-- <h1 style="background-color:cyan">Welcome <%--<%=Name%>--%></h1> -->


</body>
</html>