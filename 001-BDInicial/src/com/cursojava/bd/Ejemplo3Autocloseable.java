package com.cursojava.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo3Autocloseable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/bdcurso";
		String user = "root";
		String password = "root";
		String query = "INSERT INTO personas (nombre,apellido,edad) VALUES ('Pepito','Grillo',32)";

		try (Connection conexion = DriverManager.getConnection(url, user, password);
				Statement sentencia = conexion.createStatement();) {
			System.out.println("Conexión con la BD establecida");
			sentencia.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
