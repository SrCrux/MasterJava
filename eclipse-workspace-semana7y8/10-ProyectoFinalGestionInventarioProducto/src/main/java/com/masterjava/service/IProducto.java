package com.masterjava.service;

import java.util.List;

import com.masterjava.model.Producto;

/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public interface IProducto {

	List<Producto> listarProductos();

	double precio(int idProducto);

	void altaProducto(Producto producto);

	void modificarProducto(Producto producto);

	void eliminarProducto(int idProducto);

	void actualizarStock(int idProducto, int unidades);

}
