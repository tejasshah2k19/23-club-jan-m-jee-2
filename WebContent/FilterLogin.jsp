<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Filter | Login </title>
</head>
<body>
 
<form action="FilterLoginServlet">
	Email :		<input type="text"     name="email"/>${emailError}<br><br>
	Password :  <input type="password" name="password"  />${passwordError }<br><br>
	
	<input type="submit" value="Login"/>

</form>
</body>
</html>