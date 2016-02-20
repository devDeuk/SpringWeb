<%@page import="com.devdeuk.spring.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<style type="text/css">
	.msg{
		color:#f00;
	}
</style>
</head> 
<body>

<%= UserDAO.size() %>

<form method ="post" action ="register.do">
	id:<input type="text" name="id" value="${user.id }"><br>
	pw:<input type="text" name="password"><br>
	confirm pw:<input type="text" name="confirmPassword"><br>
	<input type="submit" value="register">
	
<br>
<span class="msg">${msg}</span>	
	
</form>

</body>
</html>