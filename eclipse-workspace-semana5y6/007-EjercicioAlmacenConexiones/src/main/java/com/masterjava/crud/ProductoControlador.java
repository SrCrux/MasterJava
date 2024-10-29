package com.masterjava.crud;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductoControlador
 */
public class ProductoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String opcion = request.getParameter("opcion");
		String opcionElegida = "/";

		switch (opcion) {

		case "alta":
			opcionElegida = "altaProducto.html";
			break;
		case "baja":
			opcionElegida = "bajaProducto.html";
			break;
		case "modificar":
			opcionElegida = "modificarProducto.html";
			break;
		case "buscar":
			opcionElegida = "buscarProducto.html";
			break;
		case "listar":
			opcionElegida = "inventario.jsp";
			break;
		}

		request.getRequestDispatcher(opcionElegida).forward(request, response);
	}

}
