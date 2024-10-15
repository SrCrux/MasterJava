<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>     
 <%@ page import="com.masterjava.modelo.Curso" %>   
 <%@ page import="com.masterjava.service.CursoService" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Almacenar en session el curso seleccionado</title>
</head>
<body>
<%
CursoService service = new CursoService();
Curso c = service.getCurso(request.getParameter("curso"));
session.setAttribute("cursoelegido", c);
%>

<p>Se ha almacenado un objeto en session.</p>

<a href="verCursos.jsp">Mostrar el curso elegido</a>

</body>
</html>