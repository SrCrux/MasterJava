package com.masterjava.conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {

		ConexionBD conexion = new ConexionBD();
		Connection con = conexion.conexion();
		String query = "SELECT * FROM personas";

		try (Statement statement = con.createStatement()) {
			System.out.println("Conexión con la BD establecida");
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getString(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.println(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
