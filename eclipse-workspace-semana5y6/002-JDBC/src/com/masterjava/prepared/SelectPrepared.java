package com.masterjava.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPrepared {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/bdcurso";
		String user = "root";
		String password = "root";
		String query = "SELECT * FROM personas WHERE edad < ?";
		int valor = 60;

		try (Connection conexion = DriverManager.getConnection(URL, user, password);
				PreparedStatement statement = conexion.prepareStatement(query);) {
			System.out.println("Conexión con la BD establecida");
			statement.setInt(1,valor);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
