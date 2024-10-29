package com.masterjava.controlador;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * ProductoControlador Servlet que actua de front controller y controla la elección del archivo
 * almacenService.jsp y redirecciona al usuario a la página deseada.
 *
 * @author Pablo Guijarro
 * @version 1.0, 14 oct 2024
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
		case "pedido":
			opcionElegida = "realizarPedido.html";
			break;
		case "enviar":
			opcionElegida = "enviarPedido.html";
			break;
		case "listar":
			opcionElegida = "inventario.jsp";
			break;

		}

		request.getRequestDispatcher(opcionElegida).forward(request, response);

	}

}
