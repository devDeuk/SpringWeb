<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h4>상대 URL - 절대 경로</h4>
	<c:redirect url="/board/list" />
	
	<h4>redirect 이후의 코드는 실행되지 않는다.</h4>
</body>
</html>
