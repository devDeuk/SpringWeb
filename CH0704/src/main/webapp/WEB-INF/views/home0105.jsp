<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>\${member.userId}</td>
			<td>${memberMap["userId"]}</td>
		</tr>
		<tr>
			<td>\${member.password}</td>
			<td>${memberMap["password"]}</td>
		</tr>
		<tr>
			<td>\${member.userName}</td>
			<td>${memberMap["userName"]}</td>
		</tr>
		<tr>
			<td>\${member.email}</td>
			<td>${memberMap["email"]}</td>
		</tr>
		<tr>
			<td>\${member.dateOfBirth}</td>
			<td>${memberMap["dateOfBirth"]}</td>
		</tr>
	</table>
</body>
</html>
