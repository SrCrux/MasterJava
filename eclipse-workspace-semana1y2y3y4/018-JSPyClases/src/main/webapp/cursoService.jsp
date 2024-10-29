<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.masterjava.service.CursoService"%>
<%@ page import="com.masterjava.modelo.Curso"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cursos y nivel</title>
</head>
<body>
	<%
	CursoService service = new CursoService();
	List<Curso> listaCursos = service.getListaCursos();
	
	for(Curso curso:listaCursos){%>
    <p>Nombre del curso: <%=curso.getNombre() %> - Nivel del curso: <%=curso.getNivel() %> <p>
<%}%>
</body>
</html>