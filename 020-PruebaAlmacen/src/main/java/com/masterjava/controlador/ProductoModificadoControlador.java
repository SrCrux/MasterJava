package com.masterjava.controlador;

import java.io.IOException;

import com.masterjava.service.ProductoService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductoModificadoControlador
 */
public class ProductoModificadoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean daError = false;
		ProductoService service = new ProductoService();
		String nombre = request.getParameter("nombre");
		double precio = 0;
		int unidades = 0;
		try {
			precio = Double.parseDouble(request.getParameter("precio"));
			unidades = Integer.parseInt(request.getParameter("unidades"));

		} catch (Exception e) {
			request.getRequestDispatcher("productoModificadoError.html").forward(request, response);
			daError = true;
		}

		if (request.getParameter("nombre") != null && request.getParameter("precio") != null
				&& request.getParameter("unidades") != null && !daError) {

			if (precio > 0 && unidades > 0) {

				for (int i = 0; i < service.getListaProductos().size(); i++) {

					if (service.getListaProductos().get(i).getNombre().equalsIgnoreCase(nombre)) {

						service.getListaProductos().get(i).setNombre(nombre);
						service.getListaProductos().get(i).setPrecio(precio);
						service.getListaProductos().get(i).setStock(unidades);
						request.getRequestDispatcher("productoModificado.jsp").forward(request, response);
					}
				}
			}

		}
		request.getRequestDispatcher("productoModificadoError.html").forward(request, response);
	}

}
