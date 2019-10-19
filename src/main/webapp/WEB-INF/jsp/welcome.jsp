<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><spring:message code="welcome.header" text="welcome.header"></spring:message></title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container">
		<h1>
			<spring:message code="welcome.header" text="welcome.header"></spring:message>
		</h1>

		<b><spring:message code="welcome.user.id" text="welcome.user.id"></spring:message>:</b> ${user.userId}
		<b><spring:message code="welcome.user.role" text="welcome.user.role"></spring:message>:</b> ${user.role}
		
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>