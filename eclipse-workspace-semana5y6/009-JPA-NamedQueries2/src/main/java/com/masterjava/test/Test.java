package com.masterjava.test;

import com.masterjava.consultas.Consulta;
import com.masterjava.modelo.Libro;

public class Test {

	public static void main(String[] args) {
		Consulta consulta = new Consulta();

		for (Libro l : consulta.buscarTodos()) {
			System.out.println(l);
		}

		for (Libro l : consulta.buscarPorIsbn("1A")) {
			System.out.println(l);
		}

	}

}
