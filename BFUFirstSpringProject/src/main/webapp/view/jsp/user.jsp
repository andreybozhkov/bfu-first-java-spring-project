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
		<%
			Object user = session.getAttribute("user");
		%>
		<h1>Hello, <c:out value="${user.getName()}"></c:out></h1>
	</body>
</html>