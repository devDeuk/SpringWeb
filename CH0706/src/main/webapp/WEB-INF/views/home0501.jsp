<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<c:if test="${member.hobbyArray == null}">
		<p>member.hobbyArray == null</p>
	</c:if>
	
	<c:if test="${member.hobbyArray eq null}">
		<p>member.hobbyArray eq null</p>
	</c:if>
</body>
</html>
