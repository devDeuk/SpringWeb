<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>\${empty member}</td>
			<td>${empty member}</td>
		</tr>
		<tr>
			<td>\${empty member.hobbyArray}</td>
			<td>${empty member.hobbyArray}</td>
		</tr>
	</table>
</body>
</html>
