package com.masterjava.prueba;

import java.util.List;

import com.masterjava.modelo.Persona;
import com.masterjava.service.Gestor;

public class Prueba {

	public static void main(String[] args) {

		Gestor gestor = new Gestor();
		List<Persona> listaPersonas;

		// LISTAR A TODAS LAS PERSONAS
		listaPersonas = gestor.listarPersonas();
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}

		// LISTAR POR TELÉFONO
		listaPersonas = gestor.buscarPorTelefono(633102030);
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}

		// LISTAR POR PRIMER APELLIDO
		listaPersonas = gestor.buscarPorPrimerApellido("Bros");
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}

		// LISTAR POR AMBOS APELLIDOS
		listaPersonas = gestor.buscarPorApellidos("Miyazaki", "Ghibli");
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}
	}
}
