<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Encabezados html creados con jsp</title>
</head>
<body>
	<%
	for (int i = 1; i <= 6; i++) {
	%>
	<h<%=i%>>Hola a todos</h<%=i%>>
	<%
	}
	%>
</body>
</html>