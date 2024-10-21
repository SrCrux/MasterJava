package com.masterjava.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que implementa un método para conectarse a una base de datos en MySQL.
 * 
 * @author Pablo Guijarro Pérez 21/10/2024
 * @version 1.0
 */
public class ConexionBD {

	private static final String URL = "jdbc:mysql://localhost:3306/bdcurso";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	/**
	 * Método para conectar una base de datos en MySQL al mundo java.
	 * 
	 * @return Retorna la conexión con la base de datos.
	 */
	public Connection conexion() {

		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conexion;

	}

}
