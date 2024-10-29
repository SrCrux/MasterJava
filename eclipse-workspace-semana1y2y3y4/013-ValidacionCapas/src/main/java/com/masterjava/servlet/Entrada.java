package com.masterjava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.masterjava.modelo.Perfil;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Entrada
 */
public class Entrada extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuario = request.getParameter("usuario");
		Perfil perfil = (Perfil) request.getAttribute("perfil");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Bienvenid@ " + usuario + " a mi página</h1>");
		out.println("<h2>Direccion de email: " + perfil.getCorreo() + "</h2>");
		out.println("<h2>Edad " + perfil.getEdad() + "</h2>");

		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
