<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bookstore login</title>
</head>
<body>
${param.message} <br>
<form action="LoginController" method="post">
		<table>
			<tr>
				<td>userName:</td>
				<td><input type="text" name=username id="userId"></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="text" name="password" id="passwordId"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
		</table>


	</form>

</body>
</html>