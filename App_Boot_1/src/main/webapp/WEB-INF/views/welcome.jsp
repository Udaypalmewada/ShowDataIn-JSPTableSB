<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

<h1>welcomes you</h1>
 <%out.println("Hello <b>"+request. getParameter("name")+"</b>!"); %>
</body>
</html>