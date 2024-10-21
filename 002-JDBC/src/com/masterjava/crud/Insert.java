package com.masterjava.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/bdcurso";
		String user = "root";
		String password = "root";
		String query = "INSERT INTO personas (nombre,apellido,edad) VALUES ('Rosa','Ndome',50)";

		try (Connection conexion = DriverManager.getConnection(URL, user, password);
				Statement sentencia = conexion.createStatement();) {
			System.out.println("Conexión con la BD establecida");
			sentencia.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}