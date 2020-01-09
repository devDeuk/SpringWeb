<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	<spring:message code="common.homeWelcome" />
</h1>

<P>  ${serverTime} </P>
</body>
</html>
