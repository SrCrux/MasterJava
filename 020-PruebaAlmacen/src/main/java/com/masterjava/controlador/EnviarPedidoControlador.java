package com.masterjava.controlador;

import java.io.IOException;

import com.masterjava.service.ProductoService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * EnviarPedidoControlador Servlet que simula el envío de un pedido por nombre
 * de producto.
 *
 * @author Pablo Guijarro
 * @version 1.0, 14 oct 2024
 */
public class EnviarPedidoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductoService service = new ProductoService();
		String nombre = request.getParameter("nombre");
		int unidades = 0;
		try {
			unidades = Integer.parseInt(request.getParameter("unidades"));
		} catch (Exception e) {
			request.getRequestDispatcher("envioPedidoError.html").forward(request, response);
		}

		if (!request.getParameter("nombre").isEmpty() && unidades > 0) {

			for (int i = 0; i < service.getListaProductos().size(); i++) {

				if (service.getListaProductos().get(i).getNombre().equalsIgnoreCase(nombre)) {
					service.enviarPedido(nombre, unidades);
					request.getRequestDispatcher("envioRealizado.jsp").forward(request, response);
				}
			}
		}
		request.getRequestDispatcher("envioPedidoError.html").forward(request, response);
	}
}
