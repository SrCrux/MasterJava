<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.service.GestionProducto"%>
<%@ page import="java.util.List"%>
<%@ page import="com.masterjava.modelo.Producto"%>

<%
GestionProducto service = new GestionProducto();
List<GestionProducto> listaProductos = service.getListaProductos();
int unidades = Integer.parseInt(request.getParameter("unidades"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pedido realizado</title>
</head>
<body>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	padding: 5px;}
</style>
	<h3>Pedido realizado correctamente.</h3>
	<%
	for (GestionProducto p : listaProductos) {
		if (p.getNombre().equalsIgnoreCase(request.getParameter("nombre"))) {
	%>
	<h4>Se han añadido <%=unidades%> unidades al producto <%=p.getNombre()%></h4>
	<table><tr>
			<th>Nombre</th>
			<th>Categoria</th>
			<th>Precio</th>
			<th>Stock</th>
		</tr>
		<tr>
			<td><%=p.getNombre()%></td>
			<td><%=p.getCategoria()%></td>
			<td><%=p.getPrecio()%></td>
			<td><%=p.getStock()%></td>
		</tr></table>
	<%}}%>
	<br>
	<a href="almacenService.html">Volver al gestor</a>
</body>
</html>