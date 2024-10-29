<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Segundo proyecto JSP</title>
</head>
<body>
	<h1>Mi segundo ejemplo con JSP</h1>
	<%
	String texto = "Hola otra vez";
	// Vamos a usar una expresion JSP
	%>
	<h2>Un texto cualquiera de HTML</h2>
	<!--  Esto es una expresion JSP -->
	<%=texto%>
</body>
</html>