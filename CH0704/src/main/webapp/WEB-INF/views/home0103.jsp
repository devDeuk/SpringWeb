<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>\${member.address.postCode}</td>
			<td>${member.address.postCode}</td>
		</tr>
		<tr>
			<td>\${member.address.location}</td>
			<td>${member.address.location}</td>
		</tr>
	</table>
</body>
</html>
