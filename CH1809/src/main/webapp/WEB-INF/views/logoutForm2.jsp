<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Insert title here</title>
</head>
<body>
  
<h1>Logout Page</h1>

<form action="/logout" method='post'>
<input type="hidden"name="${_csrf.parameterName}"value="${_csrf.token}"/>
<button>로그아웃</button>
</form>

</body>
</html>
