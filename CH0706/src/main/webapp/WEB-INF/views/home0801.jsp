<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<c:forTokens var="hobby" items="${member.hobby}" delims=",">
		${hobby} <br>
	</c:forTokens>
</body>
</html>
