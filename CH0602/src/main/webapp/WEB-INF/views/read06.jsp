<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h3>Result</h3>
	
	user.userId : ${user.userId} <br>
	user.password : ${user.password} <br>
	user.userName : ${user.userName} <br>
	user.email : ${user.email} <br>
	user.gender : ${user.gender} <br>
	user.hobby : ${user.hobby} <br>
	
	<c:forEach var="hobby" items="${user.hobbyArray}">
		<c:out value="${hobby}" /> <br>
	</c:forEach>
	
	<c:forEach var="hobby" items="${user.hobbyList}">
		<c:out value="${hobby}" /> <br>
	</c:forEach>
	
	user.foreigner : ${user.foreigner} <br>
	user.developer : ${user.developer} <br>
	user.nationality : ${user.nationality} <br>
	
	user.address.postCode : ${user.address.postCode} <br>
	user.address.location : ${user.address.location} <br>
	
	<c:forEach var="card" items="${user.cardList}">
		<c:out value="${card.no} ${card.validMonth}" /> <br>
	</c:forEach>
	
	<c:forEach var="card" items="${user.cardList}">
		<c:out value="${card.no}" /> <br>
		<c:out value="${card.validMonth}" /> <br>
	</c:forEach>
	
	<c:forEach var="card" items="${user.cardList}">
		${card.no} ${card.validMonth} <br>
	</c:forEach>
	
	user.cars : ${user.cars} <br>
	
	<c:forEach var="car" items="${user.carArray}">
		<c:out value="${car}" /> <br>
	</c:forEach>
	
	<c:forEach var="car" items="${user.carList}">
		<c:out value="${car}" /> <br>
	</c:forEach>
	
	user.introduction : ${user.introduction} <br>
	
	user.dateOfBirth : ${user.dateOfBirth}
</body>
</html>
