package com.masterjava.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		
		ConexionBD conexion = new ConexionBD();
		Connection con = conexion.conexion();
		String query = "DELETE FROM personas WHERE nombre = 'Rosa'";
		
		if(con!=null) {
			try (Statement statement = con.createStatement()) {
				statement.executeUpdate(query);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
