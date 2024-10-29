<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bucle JSP</title>
</head>
<body>
	<h1>Bucle con JSP</h1>
	<%
	for (int i = 1; i < 11; i++) {

		out.println(i + "<br>");

	}
	%>
</body>
</html>