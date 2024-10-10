package com.masterjava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Error
 */
public class Error extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>No se ha podido encontrar ningún resultado, por favor vuelva a intentarlo escribiendo correctamente una de las temáticas.</h3>");
		out.println("<a href='Formulario.html'>Volver atrás</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
