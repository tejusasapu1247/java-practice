<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isThreadSafe="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My counter application</title>
</head>
<body>
<%@include file="header.jsp" %>
<%!private int counter=0; %>
<%=counter++ %>
<hr>
<%@include file="footer.jsp" %>

</body>
</html>