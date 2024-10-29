package com.masterjava;

import java.io.IOException;
import java.io.PrintWriter;

import com.masterjava.modelo.Producto;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LeerSesionProducto
 */
public class LeerSesionProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesion = request.getSession();
		Producto producto = (Producto) sesion.getAttribute("producto");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Productos</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Resultado de las sesiones de producto</h1>");
		if (producto != null) {
			out.println("<p>" + "ID: " + producto.getId() + " Nombre: " + producto.getNombre() + " Precio: "
					+ producto.getPrecio() + "</p>");
		} else {

			out.println("<p>No existen productos</p>");

		}
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}