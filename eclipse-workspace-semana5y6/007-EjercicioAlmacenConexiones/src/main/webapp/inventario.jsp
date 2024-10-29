<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.service.GestionProducto"%>
<%@ page import="java.util.List"%>
<%@ page import="com.masterjava.modelo.Producto"%>
<%
GestionProducto gestor = new GestionProducto();
List<Producto> listaProductos = gestor.getListaProductos();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inventario Almacenes Guijarro</title>
</head>
<body>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	padding: 5px;}
</style>
	<h3>Inventario de productos.</h3>
	<table><tr>
			<th>Nombre</th>
			<th>Categoría</th>
			<th>Precio</th>
			<th>Stock</th>
		</tr>
	<%for (Producto producto: listaProductos) {%>
			
		<tr>
			<td><%=producto.getNombre()%></td>
			<td><%=producto.getCategoria()%></td>
			<td><%=producto.getPrecio()%></td>
			<td><%=producto.getStock()%></td>
			</tr>
	<%}%>
	</table>
	<br>
	<a href="index.html">Volver al gestor</a>
</body>
</html>