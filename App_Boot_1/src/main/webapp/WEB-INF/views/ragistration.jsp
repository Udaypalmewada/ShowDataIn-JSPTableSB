<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="registorUser" modelAttribute="user" method="post">
		<table>
			<tr>
				<td><label>UserId</label></td>
				<td><form:input path="userId" type="text" name="userId"
						id="userId" /></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><form:input path="name" type="text" name="name" id="name" /></td>
			</tr>
			<tr>
				<td><label>Number</label></td>
				<td><form:input path="number" type="text" name="number"
						id="number" /></td>
			</tr>

			<tr>
				<td><label>email</label></td>
				<td><form:input path="email" type="text" name="email"
						id="email" /></td>
			</tr>
			
		</table>

		<br />
		<button id="btn" type="submit">Submit</button>

		</div>
	</form:form>
</body>
</html>