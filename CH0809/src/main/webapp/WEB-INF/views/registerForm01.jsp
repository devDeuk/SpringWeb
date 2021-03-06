<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
	<title>Spring Form</title>
</head>
<body>
<h2>Spring Form</h2>
<form:form modelAttribute="member" method="post" action="register">
	<table>
		<tr>
			<td>성별</td>
			<td>
			<form:radiobuttons path="gender" items="${genderCodeMap}" />
			</td>
		</tr>
	</table>
	
	<form:button name="register">등록</form:button>
</form:form>
</body>
</html>
