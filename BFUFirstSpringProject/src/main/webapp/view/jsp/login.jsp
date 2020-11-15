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
		<h2><a href="/register">Register</a></h2>
		<h2>Login with User ID</h2>
		<c:if test="${error != null}">
			<p><c:out value="${error}"></c:out></p>
		</c:if>
		<form action="/login" method="POST">
			<label for="id">User ID:
				<input type="text" id="id" name="id" value="Please enter your ID here...">
			</label>
			<button type="submit">Login</button>
		</form>
	</body>
</html>