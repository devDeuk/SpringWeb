<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h4>절대 URL</h4>
	<c:redirect url="http://localhost:8080/board/list" />
	
	<h4>redirect 이후의 코드는 실행되지 않는다.</h4>
</body>
</html>
