<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
	<title>Logout</title>
</head>
<body>
	<h1>Logout</h1>
	
	<form action="/logout" method="post">
		<sec:csrfInput />
	<button>로그아웃</button>
	</form>
</body>
</html>
