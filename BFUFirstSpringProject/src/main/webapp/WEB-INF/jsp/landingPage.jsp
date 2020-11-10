<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My First Java Spring Boot Application</title>
		<link rel="stylesheet" href="../../css/styles.css">
	</head>
	<body class="landingPage">
		<h1>Welcome to my first Java Spring Boot Application!</h1>
		<ul>
			<c:forEach var="person" items="${persons}">
				<li><c:out value="${person.id}"/></li>
			</c:forEach>
		</ul>
	</body>
</html>