<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>\${userId == "hongkd"}</td>
			<td>${userId == "hongkd"}</td>
		</tr>
		<tr>
			<td>\${userId == "hongkd"}</td>
			<td>${userId eq "hongkd"}</td>
		</tr>
	</table>
</body>
</html>
