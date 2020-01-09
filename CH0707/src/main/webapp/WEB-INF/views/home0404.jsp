<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<p>dateValue : ${dateValue} </p>
	<fmt:parseDate value="${dateValue}" type="date" dateStyle="long" var="date" />
	<p>date : ${date} </p>
</body>
</html>
