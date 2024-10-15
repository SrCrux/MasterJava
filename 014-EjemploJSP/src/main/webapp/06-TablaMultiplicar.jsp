<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabla multiplicar</title>
</head>
<body>
	<%for (int i = 1; i <= 10; i++) {%>
	<h3>Tabla del <%=i%></h3>
	<%for (int j = 1; j <= 10; j++) {
	int multiplicacion = i * j;%>
	<tr><%=multiplicacion%></tr>
	<%}}%>
</body>
</html>