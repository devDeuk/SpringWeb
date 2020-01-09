<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
	<title>Insert title here</title>
</head>
<body>
  
<h1>Logout Page</h1>

<form action="<c:url value='/logout' />" method="post">
	<sec:csrfInput />
<button>로그아웃</button>
</form>

</body>
</html>
