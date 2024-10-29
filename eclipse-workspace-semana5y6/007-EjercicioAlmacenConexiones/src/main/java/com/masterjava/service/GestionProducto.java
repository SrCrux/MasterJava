package com.masterjava.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masterjava.conexion.ConexionBD;
import com.masterjava.modelo.ECategoria;
import com.masterjava.modelo.Producto;

public class GestionProducto {

	ConexionBD conexion = new ConexionBD();
	Connection con = conexion.conectarBD();

	public void altaProducto(Producto producto) {
		String query = "INSERT INTO productos (nombre,categoria,precio,stock) VALUES (?,?,?,?)";

		try (PreparedStatement statement = con.prepareStatement(query)) {
			statement.setString(1, producto.getNombre());
			statement.setString(2, String.valueOf(producto.getCategoria()));
			statement.setDouble(3, producto.getPrecio());
			statement.setInt(4, producto.getStock());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Producto> getListaProductos() {
		List<Producto> listaProductos = new ArrayList<Producto>();
		ECategoria categoria = null;
		String query = "SELECT * FROM productos ORDER BY categoria";

		try (PreparedStatement statement = con.prepareStatement(query); ResultSet rs = statement.executeQuery(query);) {

			while (rs.next()) {
				int id = rs.getInt(1);
				String nombre = rs.getString(2);
				switch (rs.getString(3)) {
				case "ELECTRONICA":
					categoria = ECategoria.ELECTRONICA;
					break;
				case "PAPELERIA":
					categoria = ECategoria.PAPELERIA;
					break;
				case "ALIMENTACION":
					categoria = ECategoria.ALIMENTACION;
					break;
				}
				double precio = rs.getDouble(4);
				int stock = rs.getInt(5);
				Producto producto = new Producto(id, nombre, categoria, precio, stock);
				listaProductos.add(producto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaProductos;
	}

}
