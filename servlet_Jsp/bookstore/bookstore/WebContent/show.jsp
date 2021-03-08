<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookStroe Application</title>
</head>
<body>
	Welcome ${user.username}!
	<br>
	<br>
	<a href="LogoutController">logout</a>
	<br>
	<c:if test="${user.profile == 'admin' }">
		<h4>You are in Admin</h4>
	</c:if>
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>isbn</th>
				<th>title</th>
				<th>author</th>
				<th>pubDate</th>
				<th>price</th>
				<c:if test="${user.profile == 'admin' }">
				<th>update</th>
				<th>delete</th>
				</c:if>	
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td>${book.id}</td>
					<td>${book.isbn}</td>
					<td>${book.title}</td>
					<td>${book.author}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy"
							value="${book.pubDate }" /></td>
					<td>${book.price}</td>

					<c:if test="${user.profile == 'admin'}">
						<td><a
							href="BookController.do?action=updateBook&id=<c:out value="${book.id}"/>">update</a></td>
						<td><a
							href="BookController.do?action=delbook&id=<c:out value="${book.id}"/>">delete</a></td>
					</c:if>
				</tr>
			</c:forEach>

		</tbody>
	</table>

	<c:if test="${user.profile == 'admin' || user.profile== 'developer'}">
		<a href="BookController.do?action=addbook">add a new book</a>
	</c:if>
	<c:if test="${user.profile == 'admin' }">
	<a href ="UserManageController.do?action=adduser">register a new User!</a>		
	</c:if>	
	
</body>
</html>