package com.masterjava.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/bdcurso";
		String user = "root";
		String password = "root";
		String query = "UPDATE personas SET edad=33 WHERE apellido='Melano'";

		try (Connection conexion = DriverManager.getConnection(url, user, password);
				Statement sentencia = conexion.createStatement();) {
			if (sentencia.executeUpdate(query) > 0) {
				System.out.println("Registro actualizado");
			}else {
				System.out.println("Ningún registro cumple la condición");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
