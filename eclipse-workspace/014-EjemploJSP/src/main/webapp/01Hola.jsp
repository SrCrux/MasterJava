<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Priemr proyecto JSP</title>
</head>
<body>
	<h1>Mi primer ejemplo con JSP</h1>
	<%
	//Esto es un scriptlet
	String saludo = "Hola mundo, desde JSP";
	out.println(saludo);
	%>
	<br>Esto está después del scriptlet

</body>
</html>