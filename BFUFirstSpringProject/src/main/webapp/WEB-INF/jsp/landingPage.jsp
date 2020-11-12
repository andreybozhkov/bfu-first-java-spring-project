<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Java Spring Boot: e-Store</title>
		<link rel="stylesheet" href="../../css/styles.css">
	</head>
	<body class="landingPage">
		<h1>Welcome to the e-Store powered by Java Spring Boot!</h1>
		<ul>
			<c:forEach var="person" items="${persons}">
				<li><c:out value="${person.id}"/> - <c:out value="${person.name}"/></li>
			</c:forEach>
		</ul>
		<ul>
			<c:forEach var="product" items="${products}">
				<li><c:out value="${product.id}"/> - <c:out value="${product.name}"/> - <c:out value="${product.price}"/></li>
			</c:forEach>
		</ul>
	</body>
</html>