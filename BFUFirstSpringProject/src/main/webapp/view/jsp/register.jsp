<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Java Spring Boot: e-Store</title>
		<link rel="stylesheet" href="../../css/styles.css">
		<script type="text/javascript">
			function updateAgeValueField(newAge) {
				document.getElementById("ageDisplay").innerHTML = "Age: " + newAge;
			}
		</script>
	</head>
	<body>
		<h1>Welcome to the e-Store powered by Java Spring Boot!</h1>
		<nav>
			<ul>
				<li><a href="/">Home</a></li>
				<li><a href="/login">Login</a></li>
			</ul>
		</nav>
		<h2>Register</h2>
		<jsp:useBean id="newPersonBean" class="firstProject.beans.NewPersonBean" scope="page">
			<form action="/register" method="POST">
				<label for="id">User ID:
					<input type="text" id="id" name="id" value="${newPersonBean.getId()}">
				</label>
				<br>
				<label for="name">Name:
					<input type="text" id="name" name="name" value="${newPersonBean.getName()}">
				</label>
				<br>
				<label for="age">Age
					<input type="range" id="age" name="age" min="18" max="100" step="1" onchange="updateAgeValueField(this.value)" value="${newPersonBean.getAge()}">
				</label>
				<p id="ageDisplay">Age: ${newPersonBean.getAge()}</p>
				<br>
				<label for="gender-male">Male
					<input type="radio" id="gender-male" name="gender" value="male">
				</label>
				<label for="gender-female">Female
					<input type="radio" id="gender-female" name="gender" value="female">
				</label>
				<label for="gender-other">Other
					<input type="radio" id="gender-other" name="gender" value="other">
				</label>
				<br>
				<button type="submit">Register</button>
			</form>
		</jsp:useBean>
	</body>
</html>