package com.masterjava.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
@NamedQueries({ @NamedQuery(name = "listarPeliculas", query = "SELECT p FROM Pelicula p"),
		@NamedQuery(name = "buscarPeliculaPorDirector", query = "SELECT p FROM Pelicula p WHERE p.director = :director"),
		@NamedQuery(name = "buscarPeliculaPorLetraInicialDirector", query = "SELECT p FROM Pelicula p WHERE p.director LIKE :letra"),
		@NamedQuery(name = "buscarPeliculasAlgunDirector", query = "SELECT p FROM Pelicula p WHERE p.director IN (:director1, :director2)"),
		@NamedQuery(name = "buscarDirectores", query = "SELECT p.director FROM Pelicula p"),
		@NamedQuery(name = "listarPeliculasPrecio", query = "SELECT p FROM Pelicula p WHERE p.precio BETWEEN :precio1 AND :precio2 ORDER BY p.precio"),
		@NamedQuery(name = "cantidadPeliculasPorPrecio", query = "SELECT p.precio, COUNT(p.precio) FROM Pelicula p GROUP BY p.precio ORDER BY p.precio") })
/**
 * Clase Pelicula que implementa querys JPQL y el modelo para la recreación de
 * una película en un videoclub.
 * 
 * @author Pablo Guijarro Pérez
 * @version 1.0 24/10/2024
 */
public class Pelicula {
	@Id
	private int codigo;
	private String titulo;
	private String director;
	private double precio;

	public Pelicula() {
	}

	public Pelicula(int codigo) {
		this.codigo = codigo;
	}

	public Pelicula(int codigo, String titulo, String director, double precio) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.director = director;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Pelicula:\n Código: " + codigo + "\n Título: " + titulo + "\n Director: " + director
				+ "\n Precio alquiler: " + precio + "€";
	}

}
