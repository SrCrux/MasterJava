package com.masterjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.masterjava.modelos.Curso;
import com.masterjava.modelos.Persona;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletFormularioCurso
 */
public class ServletFormularioCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesion = request.getSession();
		Curso curso = (Curso) sesion.getAttribute("curso");
		Persona persona = (Persona) sesion.getAttribute("persona");
		persona.addCursoLista(curso);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		if (curso!=null) {
		out.println("<h1>" + persona.getNombre() + ", estas matriculado en los cursos siguientes:</h1>");
		for (int i = 0; i < persona.getListaCursos().size(); i++) {
			out.println("<p>" + persona.getListaCursos().get(i).getNombre() + "</p>");
		}
		out.println("<a href='FormularioCurso.html'>Matricularse de otro curso</a>");
		}else {
			
			out.println("No se han seleccionado cursos");
			
		}
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
