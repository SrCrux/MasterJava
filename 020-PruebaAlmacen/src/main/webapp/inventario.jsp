<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.service.ProductoService"%>
<%@ page import="java.util.List"%>
<%@ page import="com.masterjava.modelo.Producto"%>
<%
ProductoService service = new ProductoService();
List<Producto> listaProductos = service.getListaProductos();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inventario</title>
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
	<%for (int i = 0; i < listaProductos.size(); i++) {%>
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