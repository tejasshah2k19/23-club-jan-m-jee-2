<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PrintData</title>
</head>
<body>

	CurrentDateAndTime => ${currentDateTime}
	<br> ${10+20*3}
	<br> ${30 > 40 }
	<br> ${30 gt 40 }
	<br> ${10 / 0 }
	<br> Name => ${name}
	<br> Name=>${sessionScope.name }
	<br> FirstName => ${cookie.firstName.value}

	<br>

	<%
		Integer age = (Integer) request.getAttribute("age");
	%>

	<%
		if (age >= 18) {
	%>
	hey user
	<br> you are
	<br> Eligible
	<%
		}
	%>
	<br>
	<BR> ${age ge 18 ? "Eligible":"" }


	<br>
	<Br>

	<c:if test="${age ge 18 }">
		Hey User<BR>
		You are <BR>
		Eligible<BR>
	</c:if>
	<br><br>
	List<br>
	<c:forEach items="${list}"  var="x">
		${x}<br>
	</c:forEach>

	<%int g = 90; %>
	<%=g %>
	
	
	<c:set var="gg" value="500"></c:set>
	<c:out value="${gg}"></c:out>

	<c:remove var="gg"/>

	<c:set var="ch" value="31"></c:set>
	<c:choose>
		<c:when test="${ch == 1 }">
		1
		</c:when>
		<c:when test="${ch == 2 }">
		2
		</c:when>
		<c:when test="${ch == 3 }">
		3
		</c:when>
		<c:otherwise>
		0
		</c:otherwise>
	</c:choose>





</body>
</html>