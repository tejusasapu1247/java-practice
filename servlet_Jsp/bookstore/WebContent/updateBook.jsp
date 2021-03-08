<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update The Book</title>
</head>
<body>
<body>
	<form action="BookController.do" method="post">
	<input type="hidden" name="id" value="${book.id}"/>
		<table>
			<tr>
				<td>isbn</td>
				<td><input type="text" name="isbn" value="${book.isbn}" id="isbnId"></td>
			</tr>
			<tr>
				<td>title</td>
				<td><input type="text" name="title" value="${book.title}" id="titleId"></td>
			</tr>
			<tr>
				<td>Author</td>
				<td><input type="text" name="author" value="${book.author}" id="AuthorId"></td>
			</tr>
			<tr>
				<td>pubDate</td>
				<td><input type="text" name="pubDate" id="pubDateId" value=<fmt:formatDate pattern="dd/MM/yyyy" value="${book.pubDate }"/>></td>
			</tr>
			<tr>
				<td>price</td>
				<td><input type="text" name="price" value="${book.price}"  id="priceId"></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
		</table>


	</form>
</body>
</html>