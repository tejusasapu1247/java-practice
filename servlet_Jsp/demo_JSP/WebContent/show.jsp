<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.demo.jsp.*" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  
<%
Person person=(Person)request.getAttribute("person");
Dog dog=person.getDog();
out.print(dog.getName());
%>
-->
${person.dog.name} 
</body>
</html>