<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Register Form 
</h1>
	<form action="/register01" method="post">
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="100"><br>
		<input type="submit" value="register01">
	</form>
	
	<form action="/register02" method="post">
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="100"><br>
		<input type="submit" value="register02">
	</form>
	
	<form action="/register03" method="post">
		uid: <input type="text" name="uid" value="50"><br>
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="100"><br>
		<input type="submit" value="register03">
	</form>
</body>
</html>
