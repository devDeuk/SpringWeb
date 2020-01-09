<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
	<title>Board</title>
</head>

<body>

<h3>REGISTER</h3>

<form:form modelAttribute="board" action="register">

	<table>
		<tr>
			<td>Title</td>
			<td><form:input path="title" /></td>
			<td><font color="red"><form:errors path="title" /></font></td>
		</tr>
		<tr>
			<td>Writer</td>
			<td><form:input path="writer" /></td>
			<td><font color="red"><form:errors path="writer" /></font></td>
		</tr>
		<tr>
			<td>Content</td>
			<td><form:textarea path="content" /></td>
			<td><font color="red"><form:errors path="content" /></font></td>
		</tr>
	</table>
	
	<div>
		<input type="submit" value="Submit" />
		<input type="reset" value="Reset" />
	</div>
	<a href="list">List</a>
</form:form>

</body>
</html>
