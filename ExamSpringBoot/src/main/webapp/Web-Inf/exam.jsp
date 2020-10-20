<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
	
		body{
		
			background-color: fuchsia;
		
		}
		input[type="submit"] {
			margin-left: 740px;
			height:50px;
			width:120px;
			background-color: purple;
			border-radius: 22px;
			font-size: 22px;
		}
	
	
	</style>
</head>
<body>
	<h1>Java</h1>
	<h3>Answer the following question(2 marks for each correct answer)</h3>
	<hr/>
	<form action="result" >
	
		<c:forEach items="${Question }" var="question">
			<c:out value="${question.id }"></c:out>.
			<c:out value="${question.question }"></c:out>
			<br>
			<input type="radio" value="${question.ans }" name="${question.id }">
			<c:out value="${question.op1 }"></c:out>
			<br>
			<input type="radio" value="${question.ans }" name="${question.id }">
			<c:out value="${question.op2 }"></c:out>
			<br>
			<input type="radio" value="${question.ans }" name="${question.id }">
			<c:out value="${question.op3 }"></c:out>
			<br>
			<input type="radio" value="${question.ans }" name="${question.id }">
			<c:out value="${question.op4 }"></c:out>
			<br>
		</c:forEach>
		<hr>
		<input type="submit" value="Submit">
	
	</form>
	
</body>
</html>