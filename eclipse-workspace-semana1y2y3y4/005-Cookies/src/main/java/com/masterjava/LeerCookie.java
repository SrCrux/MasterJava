package com.masterjava;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LeerCookie
 */
public class LeerCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String respuesta = "";
		Cookie[] listaCookies = request.getCookies();

		if (listaCookies != null) {

			for (Cookie c : listaCookies) {
				respuesta += c.getName() + ": " + c.getValue();
			}

		} else {

			respuesta = "No hay cookies";
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Cookies</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Resultado de las cookies</h1>");
		out.println("<p>" + respuesta + "</p>");

		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}