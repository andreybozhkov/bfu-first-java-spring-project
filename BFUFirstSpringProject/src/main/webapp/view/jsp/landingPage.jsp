<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="firstProject.data.dataClasses.ProductClass" %>
<%@ page import="firstProject.services.ProductsService" %>
<%@ page import="java.util.ArrayList" %>
    
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
			if (user != null) {
				//ProductsService productsService = new ProductsService();
				//ArrayList<ProductClass> products = productsService.getProducts();
				//System.out.println ( products.get(0).getName());
			}
		%>
		<c:if test="${user == null}">
			<nav>
				<ul>
					<li><a href="/register">Register</a></li>
					<li><a href="/login">Login</a></li>
				</ul>
			</nav>
		</c:if>
		<c:if test="${user != null}">
			<h2>Hello, <c:out value="${user.getName()}"></c:out></h2>
			<nav>
				<ul>
					<li><a href="/addProduct">Add Product</a></li>
					<li><a href="/user">User</a></li>
					<li><a href="/logout">Logout</a></li>
				</ul>
			</nav>
			<c:if test="${products.size() > 0}">
				<c:forEach items="${products}" var="product" varStatus="loopStatus">
					<article>
						<h3><c:out value="${product.getName()}"></c:out></h3>
						<p><c:out value="${product.getPrice()}"></c:out></p>
						<c:forEach items="${product.getTags()}" var="tag" varStatus="tagLoopStatus">
							<p><c:out value="${tag}"></c:out></p>
						</c:forEach>
					</article>
				</c:forEach>
			</c:if>
		</c:if>
	</body>
</html>