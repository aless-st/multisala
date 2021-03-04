<%@page import="cinema.entities.Film"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Film</title>
</head>
<body>

<h1>Lista di film</h1>


<ul>
<c:forEach items="${film}" var="film">
	
	<li>${film.toString()}</li>	

</c:forEach>
</ul>

</body>
</html>