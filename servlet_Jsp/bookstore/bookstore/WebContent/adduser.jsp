<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add user</title>
</head>
<body>
<form action="UserManageController.do" method="post">
	<input type="hidden" name="id" value="0"/>
		<table>
			<tr>
				<td>username</td>
				<td><input type="text" name="username" id="usernameId"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="password" id="passwordId"></td>
			</tr>
			<tr>
				<td>profile</td>
				<td>
				<select name="profile" size="1">
				<option value="admin">admin</option>
				<option value="user">user</option>
				<option value="developer">developer</option>
				</select>
				</td>
				</tr>
			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>
		</table>

	</form>
</body>
</html>