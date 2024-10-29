<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.masterjava.modelo.Tematica"%>
<%@ page import="com.masterjava.service.ValidationService"%>

<%
String tematica = request.getParameter("tematica");
ValidationService service = new ValidationService();
Tematica validacion = service.validarTematica(tematica);
%>

<%
if (validacion != null) {

	request.setAttribute("tematica", validacion);
	RequestDispatcher rd = request.getRequestDispatcher("Entrada.jsp");
	rd.forward(request, response);
} else {

	RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
	rd.forward(request, response);

}
%>