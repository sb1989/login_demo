<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<spring:message code="welcome.message" text="Welcome" />
		Name: <input type="text" name="userId" /> Password: <input
			type="password" name="password" /> <input type="submit" />
	</form>
</body>
</html>