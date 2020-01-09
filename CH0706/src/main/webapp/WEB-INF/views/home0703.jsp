<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<c:forEach var="card" items="${member.cardList}">
		${card.no} ${card.validMonth} <br>
	</c:forEach>
</body>
</html>
