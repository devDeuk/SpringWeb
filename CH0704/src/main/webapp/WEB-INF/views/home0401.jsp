<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>\${coin == 1000 && userId == "hongkd"}</td>
			<td>${coin == 1000 && userId == "hongkd"}</td>
		</tr>
		<tr>
			<td>\${coin == 1000 and userId eq "hongkd"}</td>
			<td>${coin == 1000 and userId eq "hongkd"}</td>
		</tr>
		<tr>
			<td>\${not empty member && userId eq "hongkd"}</td>
			<td>${not empty member && userId eq "hongkd"}</td>
		</tr>
		<tr>
			<td>\${! empty member && userId eq "hongkd"}</td>
			<td>${! empty member && userId eq "hongkd"}</td>
		</tr>
	</table>
</body>
</html>
