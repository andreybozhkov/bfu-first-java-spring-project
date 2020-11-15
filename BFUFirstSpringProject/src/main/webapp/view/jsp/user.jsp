<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="firstProject.data.dataClasses.PersonClass" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Java Spring Boot: e-Store</title>
		<link rel="stylesheet" href="../../css/styles.css">
		<%
			PersonClass user = (PersonClass)session.getAttribute("user");
		%>
		<script type="text/javascript">
			function updateAgeValueField(newAge) {
				document.getElementById("ageDisplay").innerHTML = "Age: " + newAge;
			}
		</script>
	</head>
	<body>
		<h1>Hello, <c:out value="${user.getName()}"></c:out></h1>
		<h2>Your details:</h2>
		<form action="/user" method="POST">
			<label for="id">User ID:
				<input type="text" id="id" name="id" value="${user.getId()}">
			</label>
			<br>
			<label for="name">Name:
				<input type="text" id="name" name="name" value="${user.getName()}">
			</label>
			<br>
			<label for="age">Age
				<input type="range" id="age" name="age" min="18" max="100" step="1" onchange="updateAgeValueField(this.value)" value="${user.getAge()}">
			</label>
			<p id="ageDisplay">Age: ${user.getAge()}</p>
			<p>Gender: ${user.getGender()}. If you select gender from below, gender info will be updated.</p>
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
			<h3>Add interest (one at a time, then press Update your details button):</h3>
			<label for="addInterest">Name:
				<input type="text" id="addInterest" name="addInterest">
			</label>
			<br>
			<br>
			<h3>Your interests: (check an interest if you would like to delete it, then press Update your details button)</h3>
			<ul id="interests">
				<c:forEach items="${user.getInterests()}" var="interest" varStatus="loopStatus">
					<li><c:out value="${interest}"></c:out></li>
					<label for="removeInterest-${loopStatus.getIndex()}">
						<input type="checkbox" id="removeInterest-${loopStatus.getIndex()}" name="removeInterest-${loopStatus.getIndex()}" value="${interest}">
					</label>
				</c:forEach>
			</ul>
			<button type="submit">Update your details</button>
		</form>
	</body>
</html>