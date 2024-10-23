package com.masterjava.crud;

import java.io.IOException;

import com.masterjava.service.PersonaService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertarServlet
 */
public class InsertarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonaService service = new PersonaService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		int edad = Integer.parseInt(request.getParameter("edad"));
		service.insertarDatos(nombre, apellido, edad);

	}

}
