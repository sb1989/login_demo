<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><spring:message code="login.header" text="login.header"/></title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container">
		<h1><spring:message code="login.header" text="login.header"></spring:message></h1>
		<br>
		<form method="post">
			<c:if test="${authenication =='fail'}">
				<spring:message code="login.user.fail" text="login.user.fail"></spring:message>
				<br>
			</c:if>
			<b><spring:message code="login.user.id" text="login.user.id"></spring:message>:</b><input type="text" name="userId" /> 
			<b><spring:message code="login.user.password" text="login.user.id"></spring:message>:</b><input type="password" name="password" />
			<input type="submit" value="<spring:message code="login.button.submit" text="login.button.submit"></spring:message>"/>
		</form>
	</div>
	<br>
	<div class="container">
			<a href="?lang=SG">English</a> | <a href="?lang=MY">Melayu</a>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>