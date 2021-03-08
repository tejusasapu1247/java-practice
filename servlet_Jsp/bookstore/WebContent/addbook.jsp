<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding the book</title>
</head>
<body>
	<form action="BookController.do" method="post">
	<input type="hidden" name="id" value="0"/>
		<table>
			<tr>
				<td>isbn</td>
				<td><input type="text" name="isbn" id="isbnId"></td>
			</tr>
			<tr>
				<td>title</td>
				<td><input type="text" name="title" id="titleId"></td>
			</tr>
			<tr>
				<td>Author</td>
				<td><input type="text" name="author" id="AuthorId"></td>
			</tr>
			<tr>
				<td>pubDate</td>
				<td><input type="text" name="pubDate" id="pubDateId"></td>
			</tr>
			<tr>
				<td>price</td>
				<td><input type="text" name="price" id="priceId"></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
		</table>


	</form>
</body>
</html>