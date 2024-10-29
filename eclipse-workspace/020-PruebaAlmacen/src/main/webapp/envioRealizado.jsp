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
<title>Envío realizado</title>
</head>
<body>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	padding: 5px;}
</style>
	<h3>Envío realizado correctamente.</h3>
	<%
	for (GestionProducto p : listaProductos) {
		if (p.getNombre().equalsIgnoreCase(request.getParameter("nombre"))) {
			if(p.getStock()==0){
	%>
		<h4>La cantidad de producto enviada es mayor al stock, se han enviado todas las unidades de <%=p.getNombre()%>. Ya no quedan más unidades</h4>
		<%}else {%>
	<h4>Se han enviado <%=unidades%> unidades del producto <%=p.getNombre()%></h4>
	<%}%>
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