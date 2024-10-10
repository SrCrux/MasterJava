package com.masterjava.servlet;

import java.io.IOException;

import com.masterjava.modelo.Tematica;
import com.masterjava.service.ValidationService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Buscador
 */
public class Buscador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ValidationService service;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tematica = request.getParameter("tematica");
		service = new ValidationService();
		Tematica validado = service.validarTematica(tematica);

		if (validado != null) {
			request.setAttribute("tematica", validado);
			RequestDispatcher rd = request.getRequestDispatcher("Entrada");
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("/Error");
			rd.forward(request, response);
		}
	}

}
