package com.cursojava.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo1 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/bdcurso";
		String user = "root";
		String password = "root";
		String query = "INSERT INTO personas (nombre,apellido,edad) VALUES ('Pepito','Grillo',32)";

		try {
			Connection conexion = DriverManager.getConnection(url, user, password);
			System.out.println("Conexión con la BD establecida");
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate(query);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
