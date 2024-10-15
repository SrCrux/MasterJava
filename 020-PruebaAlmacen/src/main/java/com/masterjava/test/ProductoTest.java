/**
 * 
 */
package com.masterjava.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.masterjava.modelo.ECategoria;
import com.masterjava.modelo.Producto;
import com.masterjava.service.ProductoService;

/**
 *
 * ProductoTest Clase JUnit que testea el correcto funcionamiento de los métodos de la clase ProductoService
 *
 * @author Pablo Guijarro
 * @version 1.0, 14 oct 2024
 */
class ProductoTest {

	ProductoService service = new ProductoService();
	Producto producto = new Producto("Ordenador", ECategoria.ELECTRONICA, 1000, 10);

	@Test
	void getListaProductosTest() {
		List<Producto> listaProductosTest = service.getListaProductos();

		assertEquals(service.getListaProductos(), listaProductosTest);
	}
	
	@Test
	void getProductoTest() {
		
		Producto productoTest = service.getProducto(producto);
		
		assertEquals(service.getProducto(producto), productoTest);
	}

}
