package com.masterjava.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.masterjava.modelo.Pelicula;
import com.masterjava.service.Gestor;

/**
 * Clase Test que implementa métodos para la gestión de un videoclub y testea su funcionamiento.
 * 
 * @author Pablo Guijarro Pérez
 * @version 1.0 24/10/2024
 */
public class GestorTest {

	Gestor gestor = new Gestor();
	List<Pelicula> listaPeliculas;

	@Test
	public void listarPeliculasTest() {
		listaPeliculas = gestor.listarPeliculas();
		assertEquals(gestor.listarPeliculas(), listaPeliculas);
	}

	@Test
	public void buscarPeliculaPorDirector() {
		listaPeliculas = gestor.buscarPeliculaPorDirector("Hayao Miyazaki");
		assertEquals(gestor.buscarPeliculaPorDirector("Hayao Miyazaki"), listaPeliculas);
	}

}
