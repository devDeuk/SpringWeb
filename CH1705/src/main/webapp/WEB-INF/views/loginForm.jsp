<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Login Page</h1>

<form method="post" action="/login">
	<div>
		<input type="text" name="userId" value="admin">
	</div>
	
	<div>
		<input type="password" name="userPw" value="1234">
	</div>
	
	<div>
		<input type="submit">
	</div>
</form>

</body>
</html>
