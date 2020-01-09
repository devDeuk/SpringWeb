<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h4>절대 URL</h4>
	<c:url value="http://localhost:8080/board/list" />
	
	<h4>상대 URL - 절대 경로</h4>
	<c:url value="/board/list" />
	
	<h4>상대 URL - 상대 경로</h4>
	<c:url value="./board/list" />
</body>
</html>
