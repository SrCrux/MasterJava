<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.service.CursoService"%>
<%@ page import="com.masterjava.modelo.Curso"%>
<%@ page import="java.util.List"%>
<%
CursoService service = new CursoService();
List<Curso> listaCursos = service.getListaCursos();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select Cursos</title>
</head>
<body>
	<h1>Elige un curso del desplegable</h1>
	<form action="paginaCursos.jsp" method="post">
		<select name="curso">
			<%
			for (int i = 0; i < listaCursos.size(); i++) {
			%>
			<option value="<%=listaCursos.get(i).getNombre()%>"><%=listaCursos.get(i).getNombre()%></option>
			<%
			}
			%>
		</select> <input type="submit" value="Buscar">
	</form>
</body>
</html>