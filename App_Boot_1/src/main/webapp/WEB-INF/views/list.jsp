<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of User IN Account</title>
</head>
<body>
	<table border="1" cellpadding="5">
		<h2>List of Employee</h2>
		<tr>
			<th>UserId</th>
			<th>Name</th>
			<th>Mobile Number</th>
			<th>Email</th>

		</tr>
		<c:forEach var="userList" items="${userList}">
			<tr>
			   <td><c:out value="${userList.name}" /></td>
				<td><c:out value="${userList.userId}" /></td>
				<td><c:out value="${userList.number}" /></td>
				<td><c:out value="${userList.email}" /></td>
				<td></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>