<%@page import= "java.util.List" %>
<%@page import= "com.model.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Application</title>
</head>
<body>
<%
List<Customer> customers=(List<Customer>)request.getAttribute("list");
for(Customer c: customers){
	out.print(c +"<br>");
}

%>
</body>
</html>