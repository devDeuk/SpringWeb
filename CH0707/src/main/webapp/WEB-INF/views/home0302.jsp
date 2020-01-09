<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<p>now : ${now} </p>
	
	<p>time : <fmt:formatDate value="${now}" type="time" /></p>
	<p>time default : <fmt:formatDate value="${now}" type="time" dateStyle="default" /></p>
	<p>time short : <fmt:formatDate value="${now}" type="time" dateStyle="short" /></p>
	<p>time medium : <fmt:formatDate value="${now}" type="time" dateStyle="medium" /></p>
	<p>time long : <fmt:formatDate value="${now}" type="time" dateStyle="long" /></p>
	<p>time full : <fmt:formatDate value="${now}" type="time" dateStyle="full" /></p>
</body>
</html>
