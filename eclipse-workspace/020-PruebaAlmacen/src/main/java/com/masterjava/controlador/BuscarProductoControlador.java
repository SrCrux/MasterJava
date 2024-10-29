package com.masterjava.controlador;

import java.io.IOException;

import com.masterjava.service.ProductoService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
*
* BuscarProductoControlador Servlet que busca un objeto por su nombre y redirecciona a la página deseada.
*
* @author Pablo Guijarro
* @version 1.0, 14 oct 2024
*/
public class BuscarProductoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		ProductoService service = new ProductoService();
		
		for (int i = 0; i < service.getListaProductos().size(); i++) {
			if (service.getListaProductos().get(i).getNombre().equalsIgnoreCase(nombre)) {
				request.getRequestDispatcher("productoBuscado.jsp").forward(request, response);
			}

		}
		request.getRequestDispatcher("productoBuscadoError.html").forward(request, response);
	}

}
