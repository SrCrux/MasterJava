package com.masterjava.controlador;

import java.io.IOException;

import com.masterjava.modelo.ECategoria;
import com.masterjava.modelo.Producto;
import com.masterjava.service.ProductoService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * AltaProductoControlador Servlet que crea un nuevo objeto según los parametros
 * indicados por el usuario.
 *
 * @author Pablo Guijarro
 * @version 1.0, 14 oct 2024
 */
public class AltaProductoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean daError = false;
		String nombre = request.getParameter("nombre");
		String categoria = request.getParameter("categoria");
		double precio = 0;
		int unidades = 0;
		ECategoria categoriaElegida = null;
		try {
			precio = Double.parseDouble(request.getParameter("precio"));
			unidades = Integer.parseInt(request.getParameter("unidades"));

		} catch (Exception e) {
			request.getRequestDispatcher("productoCreadoError.html").forward(request, response);
			daError = true;
		}

		switch (categoria) {

		case "electronica":
			categoriaElegida = ECategoria.ELECTRONICA;
			break;
		case "papeleria":
			categoriaElegida = ECategoria.PAPELERIA;
			break;
		case "alimentacion":
			categoriaElegida = ECategoria.ALIMENTACION;
			break;
		}

		if (request.getParameter("nombre") != null && request.getParameter("precio") != null
				&& request.getParameter("unidades") != null && !daError) {

			if (precio > 0 && unidades > 0) {

				Producto p = new Producto(nombre, categoriaElegida, precio, unidades);
				ProductoService service = new ProductoService();
				service.altaProducto(p);
				request.getRequestDispatcher("productoCreado.jsp").forward(request, response);
			}
		}
		request.getRequestDispatcher("productoCreadoError.html").forward(request, response);
	}

}
