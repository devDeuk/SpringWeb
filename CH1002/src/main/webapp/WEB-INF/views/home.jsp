<%@ page contentType="text/html; charset=utf-8" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
	<spring:message code="welcome.message" /> <br> 
	<spring:message code="result.succeed" />
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
