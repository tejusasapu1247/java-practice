<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
  <%
  int ip1=Integer.parseInt(request.getParameter("input1"));
  int ip2=Integer.parseInt(request.getParameter("input2"));
  out.println("welcome user....");
  int k=ip1+ip2;
  out.println("the result="+ k);
  %>
</body>
</html>