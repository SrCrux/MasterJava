package com.masterjava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.masterjava.modelo.Tematica;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Entrada
 */
public class Entrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Tematica t = (Tematica) request.getAttribute("tematica");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		out.println(
				"<style>table, th, td {border: 1px solid black;border-collapse: collapse;text-align: center;padding:5px;</style>");
		for (int i = 0; i < t.getListaPaginas().size(); i++) {

			out.println("<h2>" + t.getListaPaginas().get(i).getNombre() + "</h2>");
			out.println("<table><tr><th>Nombre</th><th>Descripción</th></tr>" + "<tr><td>" + "</td><td><a href="
					+ t.getListaPaginas().get(i).getUrl() + " target=" + "_blank" + ">"
					+ t.getListaPaginas().get(i).getNombre() + "</a></td><td>"
					+ t.getListaPaginas().get(i).getDescripcion() + "</td></tr></table>");

		}

		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
