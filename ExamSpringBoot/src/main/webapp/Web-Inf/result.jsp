<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
	
		h1{
			margin-left: 640px;
		}
		table{
			margin-left: 430px;
		}
		hr{
			background-color: red;
		}
	</style>
</head>
<body>

	<h1>Your Mark is:<c:out value="${Mark }"></c:out></h1>
	<hr>
	<br>
	<br>
	<table border="bold">
	<tr>
	
	<td>ID</td>
	<td>Question</td>
	<td>Your Answer</td>
	<td>Correct Answer</td>
	<td>Status</td>
	</tr>
	
		<c:forEach items="${Result }" var="result">
		
			<tr>
			<td><c:out value="${result.id }"/></td>
			<td><c:out value="${result.question }"/></td>
			<td><c:out value="${result.ans }"/></td>
			<td><c:out value="${result.corectans }"/></td>
			<td><c:out value="${result.status }"/></td>
			</tr>
		
	
		</c:forEach>
	
	
	</table>

	
	
	
</body>
</html>