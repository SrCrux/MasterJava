package com.masterjava;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrearCookie
 */
public class CrearCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie c1 = new Cookie("nombre", "pepito");
		c1.setMaxAge(60); // establecemos el tiempo de duración de la cookie. Es opcional.
		response.addCookie(c1);

		Cookie c2 = new Cookie("edad", "40");
		c2.setMaxAge(90);
		response.addCookie(c2);
	}

}
