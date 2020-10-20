<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link href="<c:url value="/Css/Login.css"/>" rel="stylesheet" type="text/css" >
</head>
<body>
	<marquee direction="left">
		<p>Welcome to online Examination System</p>
	</marquee>
	<div class="login-box">
		<h1>Login Here</h1>
		<form action="signin" method="post">
			<p>Username</p>
			<input type="email" placeholder="Enter Username" name="email">
			<p>Password</p>
			<input type="password" placeholder="Enter Password" name="password">
			<input type="submit" value="SignIn">
			<a href="signUp"><input type="button" value="SignUp"></a>
			<p><a href="forgotpw">Forgot Password</a></p>
		</form>
	</div>
</body>
</html>