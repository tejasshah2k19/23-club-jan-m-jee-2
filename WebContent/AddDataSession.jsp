<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="SaveDataSesssionServlet" method="post">

		Key : <input type="text" name="key" /><br>
		<rb> Value : <input type="text" name="value" />
		<br>
		<br>


		<input type="submit" value="save" />
	</form>

	<br>
	<br>
	<a href="ReadDataFromSessionServlet">Read Data From Session</a>
	<br><Br>
	<a href="LogoutServlet">Logout</a>
	
</body>
</html>