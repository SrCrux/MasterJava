<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bucle mejorado</title>
</head>
<body>
	<h1>Un buclo mejorado</h1>
	<%
	for (int i = 1; i < 11; i++) {

		out.println("<p>" + i + "</p>");
	}
	%>
	<h2>Lo vamos a hacer más sencillo</h2>
	<%
	for (int i = 1; i < 11; i++) {
	%>

	<p><%=i%></p>
	<%
	}
	%>

</body>
</html>