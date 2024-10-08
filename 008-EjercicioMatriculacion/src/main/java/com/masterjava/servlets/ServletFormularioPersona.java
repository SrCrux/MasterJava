package com.masterjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.masterjava.modelos.Persona;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletFormularioPersona
 */
public class ServletFormularioPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		Persona persona = (Persona) sesion.getAttribute("persona");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		if(persona!=null) {
		out.println("<h1>Persona registrada en el sistema</h1>");
		out.println("<p>Nombre de la persona registrada: " + persona.getNombre() + "</p>");
		out.println("<h2>Se puede matricular en nuestros cursos accediendo al</h2>");
		out.println("<a href='FormularioCurso.html'>Formulario del Curso</a>");
		}else {
			
			out.println("No se han registrado personas en el sistema.");
			
		}
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
