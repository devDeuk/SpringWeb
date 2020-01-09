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
	
	<p>both : <fmt:formatDate value="${now}" type="both" /></p>
	<p>both default default : <fmt:formatDate value="${now}" type="both" dateStyle="default" timeStyle="default" /></p>
	<p>both short short : <fmt:formatDate value="${now}" type="both" dateStyle="short" timeStyle="short" /></p>
	<p>both medium medium : <fmt:formatDate value="${now}" type="both" dateStyle="medium" timeStyle="medium" /></p>
	<p>both long long : <fmt:formatDate value="${now}" type="both" dateStyle="long" timeStyle="long" /></p>
	<p>both full full : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full" /></p>
</body>
</html>
