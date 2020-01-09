<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<c:set var="memberId" value="${member.userId}" />
	
	<table border="1">
		<tr>
			<td>member.userId</td>
			<td>${memberId}</td>
		</tr>
	</table>
	
	<c:remove var="memberId" />
	
	<table border="1">
		<tr>
			<td>member.userId</td>
			<td>${memberId}</td>
		</tr>
	</table>
</body>
</html>
