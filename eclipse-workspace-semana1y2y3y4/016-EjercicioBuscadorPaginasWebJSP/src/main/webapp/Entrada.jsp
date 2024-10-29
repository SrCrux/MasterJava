<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.modelo.Tematica"%>
<%
Tematica tematica = (Tematica) request.getAttribute("tematica");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Temática <%=tematica.getNombre()%></title>
</head>
<body>
	<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	padding: 5px;
}
</style>
	<%
	for (int i = 0; i < tematica.getListaPaginas().size(); i++) {
	%>
	<h2><%=tematica.getListaPaginas().get(i).getNombre()%></h2>
	<table>
		<tr>
			<th>Temática</th>
			<th>URL</th>
			<th>Descripción</th>
		</tr>
		<tr>
			<td><%=tematica.getListaPaginas().get(i).getTematica()%></td>
			<td><a href="<%=tematica.getListaPaginas().get(i).getUrl()%>"
				target="_blank"><%=tematica.getListaPaginas().get(i).getNombre()%></a></td>
			<td><%=tematica.getListaPaginas().get(i).getDescripcion()%></td>
		</tr>
	</table>
	<%
	}
	%>
</body>
</html>
