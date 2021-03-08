<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- scriplet tag : inside is you can only use pure java -->
<h1>   </h1>
<%

Integer sum=(Integer)session.getAttribute("sum");
out.print("sum ="+sum  +"<br>");

%>
</body>
</html>