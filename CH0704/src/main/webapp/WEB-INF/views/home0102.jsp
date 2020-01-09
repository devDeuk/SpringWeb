<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<table border="1">	
		<tr>
			<td>member.hobbyArray</td>
			<td>
				<c:forEach var="hobby" items="${member.hobbyArray}">
					${hobby} <br>
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td>\${member.hobbyArray[0]}</td>
			<td>${member.hobbyArray[0]}</td>
		</tr>
		<tr>
			<td>\${member.hobbyArray[1]}</td>
			<td>${member.hobbyArray[1]}</td>
		</tr>
		<tr>
			<td>member.hobbyList</td>
			<td>
				<c:forEach var="hobby" items="${member.hobbyList}">
					${hobby} <br>
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td>\${member.hobbyList[0]}</td>
			<td>${member.hobbyList[0]}</td>
		</tr>
		<tr>
			<td>\${member.hobbyList[1]}</td>
			<td>${member.hobbyList[1]}</td>
		</tr>
	</table>
</body>
</html>
