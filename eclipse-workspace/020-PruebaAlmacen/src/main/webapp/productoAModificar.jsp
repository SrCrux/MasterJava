<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.service.GestionProducto"%>
<%@ page import="java.util.List"%>
<%@ page import="com.masterjava.modelo.Producto"%>
<%
GestionProducto service = new GestionProducto();
List<GestionProducto> listaProductos = service.getListaProductos();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Producto a modificar</title>
</head>
<body>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	padding: 5px;}
</style>
	<h3>Información del producto a modificar</h3>
	<%
	for (GestionProducto p : listaProductos) {
			if (p.getNombre().equalsIgnoreCase(request.getParameter("nombre"))) {
	%>
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
	<h3>¿Qué desea modificar?</h3>
	<br>
	<form action="ProductoModificadoControlador" method="post">
		<label for="nombre">Nombre:</label> 
		<input type="text" id="nombre" name="nombre"><br> 
		<label for="precio">Precio:</label> 
		<input type="text" id="precio" name="precio"><br> 
		<label for="unidades">Unidades:</label>
		<input type="text" id="unidades" name="unidades"><br> 
		<input type="submit" value="Modificar">
	</form>
	<a href="almacenService.html">Volver al gestor</a>
</body>
</html>