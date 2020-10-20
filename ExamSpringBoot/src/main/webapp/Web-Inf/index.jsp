<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/Css/index.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<c:url var="ap" value="StudentPage.jsp"></c:url>
	<marquee direction="left">
	<p>Welcome to online Examination System</p>
	</marquee>
	<div class="login-box">
		<form method="post" action="login">
			<a href="admin"><input type="button" value="Admin" name="admin"></a>
			<a href="student"><input type="button" value="Student" name="student"></a>
		</form>
	</div>
</body>
</html>