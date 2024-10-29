package com.masterjava.modelo;

/**
 *
 * Producto Clase que establece las propiedades de un Producto.
 *
 * @author Pablo Guijarro
 * @version 1.0, 14 oct 2024
 */
public class Producto {

	private String nombre;
	private ECategoria categoria;
	private double precio;
	private int stock;
	
	public Producto(String nombre, ECategoria categoria, double precio, int stock) {
		
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ECategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(ECategoria categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
}
