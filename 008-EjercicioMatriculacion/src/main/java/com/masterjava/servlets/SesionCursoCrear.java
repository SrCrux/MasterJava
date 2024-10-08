package com.masterjava.servlets;

import java.io.IOException;

import com.masterjava.modelos.Curso;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SesionCursoCrear
 */
public class SesionCursoCrear extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombre = request.getParameter("curso");
		HttpSession sesion = request.getSession(true);
		Curso curso = new Curso(nombre);
		sesion.setAttribute("curso", curso);

		RequestDispatcher rd = request.getRequestDispatcher("ServletFormularioCurso");
		rd.forward(request, response);

	}

}
