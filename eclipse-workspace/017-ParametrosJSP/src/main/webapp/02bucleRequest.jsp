<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bucle segun datos de entrada</title>
</head>
<body>
	<%
	int numero = Integer.parseInt(request.getParameter("numero"));
	%>
	<%
	for (int i = 0; i <= numero; i++) {
	%>

	<p><%=i%></p>
	<%
	}
	%>
</body>
</html>