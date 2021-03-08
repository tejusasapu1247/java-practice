<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" errorPage="myError.jsp"%>
    
<%@ page import="com.demo.jsp.Dog" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Dog dog=null;
	out.print(dog.getName());
%>
</body>
</html>