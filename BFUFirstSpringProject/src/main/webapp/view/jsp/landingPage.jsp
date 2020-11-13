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
	<body>
		<h1>Welcome to the e-Store powered by Java Spring Boot!</h1>
		<%
			Object user = session.getAttribute("user");
		%>
		<c:if test="${user == null}">
			<h2><a href="<c:url value="/register"/>">Register</a></h2>
			<h2><a href="/login">Login</a></h2>
		</c:if>
		<c:if test="${user != null}">
			<h2><a href="/logout">Logout</a></h2>
		</c:if>
	</body>
</html>