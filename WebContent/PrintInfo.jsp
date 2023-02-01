<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PrintInfo</title>
</head>
<body>
	<h2>Your Detail</h2>

	<%
		String firstName = (String) request.getAttribute("firstName");
		String email = (String) request.getAttribute("email");
		String password = (String) request.getAttribute("password");
	%>
	
	FirstName => <%=firstName %> <br>
	Email => <%=email %><br>
	Password => <%=password %>



</body>
</html>