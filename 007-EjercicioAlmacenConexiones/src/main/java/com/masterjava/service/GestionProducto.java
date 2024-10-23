package com.masterjava.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masterjava.conexion.ConexionBD;
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

}
