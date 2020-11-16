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
		<nav>
			<ul>
				<li><a href="/">Home</a></li>
				<li><a href="/user">User</a></li>
				<li><a href="/logout">Logout</a></li>
			</ul>
		</nav>
		<h2>Add Product</h2>
		<jsp:useBean id="newProductBean" class="firstProject.beans.NewProductBean" scope="page">
			<form action="/addProduct" method="POST">
				<label for="id">Product ID:
					<input type="text" id="id" name="id" value="${newProductBean.getId()}">
				</label>
				<br>
				<label for="name">Name:
					<input type="text" id="name" name="name" value="${newProductBean.getName()}">
				</label>
				<br>
				<label for="price">Price
					<input type="number" id="price" name="price" min="0.00" step="0.01" value="${newProductBean.getPrice()}">
				</label>
				<label for="quantity">Initial available quantity
					<input type="number" id="quantity" name="quantity" min="1" max="32767" step="1" value="${newProductBean.getQtyAvailable()}">
				</label>
				<br>
				<button type="submit">Add Product</button>
			</form>
		</jsp:useBean>
	</body>
</html>