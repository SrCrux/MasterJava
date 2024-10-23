package com.masterjava.crud;

import java.io.IOException;

import com.masterjava.modelo.ECategoria;
import com.masterjava.modelo.Producto;
import com.masterjava.service.GestionProducto;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AltaProducto
 */
public class AltaProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GestionProducto gestor = new GestionProducto();
		Producto producto = new Producto();
		String opcion = request.getParameter("categoria");
		String nombre = request.getParameter("nombre");
		double precio = 0;
		int stock = 0;
		try {
			precio = Double.parseDouble(request.getParameter("precio"));
			stock = Integer.parseInt(request.getParameter("unidades"));
		} catch (NumberFormatException e) {
			request.getRequestDispatcher("error.html").forward(request, response);
		}
		if (precio > 0 && stock > 0) {
			producto.setNombre(nombre);
			producto.setPrecio(precio);
			producto.setStock(stock);

			switch (opcion) {

			case "electronica":
				producto.setCategoria(ECategoria.ELECTRONICA);
				break;
			case "papeleria":
				producto.setCategoria(ECategoria.PAPELERIA);
				break;
			case "alimentacion":
				producto.setCategoria(ECategoria.ALIMENTACION);
				break;
			}
			gestor.altaProducto(producto);
			request.getRequestDispatcher("altaProductoExito.html").forward(request, response);
		}
		request.getRequestDispatcher("error.html").forward(request, response);
	}

}
