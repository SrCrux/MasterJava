/**
 * 
 */
package com.masterjava.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.masterjava.modelo.ECategoria;
import com.masterjava.modelo.Producto;

/**
 *
 * ProductoService Clase que inicializa una lista de productos e incorpora una
 * serie de métodos.
 *
 * @author Pablo Guijarro
 * @version 1.0, 14 oct 2024
 */
public class ProductoService {

	private static List<Producto> listaProductos = new ArrayList<Producto>(Arrays.asList(

			new Producto("Movil", ECategoria.ELECTRONICA, 399.99, 10),
			new Producto("Television", ECategoria.ELECTRONICA, 699.99, 8),
			new Producto("Portatil", ECategoria.ELECTRONICA, 1099.99, 15),
			new Producto("Boligrafo", ECategoria.PAPELERIA, 0.80, 120),
			new Producto("Lapicero", ECategoria.PAPELERIA, 0.5, 200),
			new Producto("Cuaderno", ECategoria.PAPELERIA, 2.15, 75),
			new Producto("Crema de cacao", ECategoria.ALIMENTACION, 2.5, 35),
			new Producto("Galletas", ECategoria.ALIMENTACION, 1.75, 40),
			new Producto("Pan de molde", ECategoria.ALIMENTACION, 3.10, 25)

	));

	/**
	 * Método que retorna una lista de productos.
	 * 
	 * @return
	 */
	public List<Producto> getListaProductos() {

		return listaProductos;
	}

	/**
	 * Método que retorna la información de un producto.
	 * 
	 * @param producto del que quieres la información.
	 * @return
	 */
	public Producto getProducto(Producto producto) {

		for (Producto p : listaProductos) {

			if (p.getNombre().equalsIgnoreCase(producto.getNombre())) {
				return p;
			}

		}
		return null;
	}

	/**
	 * Método que aniade un objeto a la lista
	 * 
	 * @param producto que quiere aniadirse
	 */
	public void altaProducto(Producto producto) {

		listaProductos.add(producto);

	}

	/**
	 * Método que elimina un objeto de la lista.
	 * 
	 * @param nombre del objeto que quiere eliminarse
	 */
	public void bajaProducto(String nombre) {

		for (int i = 0; i < listaProductos.size(); i++) {

			if (listaProductos.get(i).getNombre().equalsIgnoreCase(nombre)) {

				listaProductos.remove(i);
			}
		}
	}

	/**
	 * Método que añade un número x de elementos a la variable stock.
	 * 
	 * @param nombre   del producto que desea pedir.
	 * @param unidades del producto que desea pedir.
	 */
	public void realizarPedido(String nombre, int unidades) {
		for (int i = 0; i < listaProductos.size(); i++) {

			if (listaProductos.get(i).getNombre().equalsIgnoreCase(nombre)) {

				listaProductos.get(i).setStock(listaProductos.get(i).getStock() + unidades);
			}
		}

	}

	/**
	 * Método que retira un número x de elementos a la variable stock.
	 * 
	 * @param nombre
	 * @param unidades
	 */
	public void enviarPedido(String nombre, int unidades) {
		for (int i = 0; i < listaProductos.size(); i++) {

			if (listaProductos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				if (listaProductos.get(i).getStock() < unidades) {

					listaProductos.get(i).setStock(0);
				} else {
					listaProductos.get(i).setStock(listaProductos.get(i).getStock() - unidades);
				}

			}
		}

	}

}
