package com.masterjava.servlet;

import java.io.IOException;

import com.masterjava.modelo.Perfil;
import com.masterjava.service.ValidacionService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ValidacionService service;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuario = request.getParameter("usuario");
		String pwd = request.getParameter("pwd");
		service = new ValidacionService();
		Perfil validado = service.autenticar(usuario, pwd);

		if (validado != null) {
			request.setAttribute("perfil", validado);
			RequestDispatcher rd = request.getRequestDispatcher("/Entrada");
			rd.forward(request, response);
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("/Error");
			rd.forward(request, response);
		}
	}

}
