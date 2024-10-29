package com.masterjava.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	private static final String URL = "jdbc:mysql://localhost:3306/bd_ejercicioempresafinal";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

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
