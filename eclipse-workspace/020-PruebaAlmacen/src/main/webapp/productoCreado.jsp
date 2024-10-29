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
<title>Alta exitosa</title>
</head>
<body>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	padding: 5px;}
</style>
	<h3>Se ha añadido exitosamente el producto.</h3>
	<%for (int i = listaProductos.size() - 1; i < listaProductos.size(); i++) {%>
	<table><tr>
			<th>Nombre</th>
			<th>Categoria</th>
			<th>Precio</th>
			<th>Stock</th>
		</tr>
		<tr>
			<td><%=listaProductos.get(i).getNombre()%></td>
			<td><%=listaProductos.get(i).getCategoria()%></td>
			<td><%=listaProductos.get(i).getPrecio()%></td>
			<td><%=listaProductos.get(i).getStock()%></td>
		</tr></table>
	<%}%>
	<br>
	<a href="almacenService.html">Volver al gestor</a>
</body>
</html>
