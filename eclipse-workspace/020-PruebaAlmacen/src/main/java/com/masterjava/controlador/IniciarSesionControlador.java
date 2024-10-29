package com.masterjava.controlador;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IniciarSesionControlador
 */
public class IniciarSesionControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("nombre");
		String password = request.getParameter("password");
		
		if(usuario.equalsIgnoreCase("admin")&& password.equals("admin")) {
			
			request.getRequestDispatcher("almacenService.html").forward(request, response);
			
		}else {
			request.getRequestDispatcher("inicioSesionError.html").forward(request, response);
		}
		
	}

}
