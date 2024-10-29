package com.masterjava.prueba;

import java.util.List;

import com.masterjava.modelo.Pelicula;
import com.masterjava.service.Gestor;

public class Prueba {

	public static void main(String[] args) {

		Gestor gestor = new Gestor();
		List<Pelicula> listaPeliculas;
		List<String> listaDirectores;
		List<Object[]> listaObjetos;

		// LISTAR TODAS LAS PELICULAS
		listaPeliculas = gestor.listarPeliculas();
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula);
		}

		// LISTAR TODAS LAS PELICULAS DE UN DIRECTOR
		listaPeliculas = gestor.buscarPeliculaPorDirector("Bon Jon-Hoo");
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula);
		}

		// LISTAR TODAS LAS PELICULAS QUE EMPIECEN POR 'X' LETRA DEL NOMBRE DE UN
		// DIRECTOR
		listaPeliculas = gestor.buscarPeliculaPorLetraInicialDirector('C');
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula);
		}

		// LISTAR TODAS LAS PELICULAS DE 2 DIRECTORES
		listaPeliculas = gestor.buscarPeliculasAlgunDirector("Damien Chazelle", "Hayao Miyazaki");
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula);
		}

		// LISTAR TODOS LOS DIRECTORES
		listaDirectores = gestor.buscarDirectores();
		for (String director : listaDirectores) {
			System.out.println(director);
		}

		// LISTAR TODAS LAS PELICULAS ENTRE 2 PRECIOS
		listaPeliculas = gestor.listarPeliculaPrecio(5, 10);
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula);
		}

		// MUESTRA LA CANTIDAD DE PELICULAS QUE EXISTEN DE CADA PRECIO
		listaObjetos = gestor.cantidadPeliculasPorPrecio();
		for (Object[] objeto : listaObjetos) {
			System.out.println("Existen " + objeto[1] + " peliculas en alquiler por " + objeto[0] + "€.");
		}

	}

}
