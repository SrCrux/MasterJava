package com.masterjava.servlets;

import java.io.IOException;

import com.masterjava.modelos.Persona;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SesionPersonaCrear
 */
public class SesionPersonaCrear extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		HttpSession sesion = request.getSession(true);
		Persona persona = new Persona(nombre);
		sesion.setAttribute("persona", persona);
		
		RequestDispatcher rd = request.getRequestDispatcher("ServletFormularioPersona");
		rd.forward(request, response);
	}

}
