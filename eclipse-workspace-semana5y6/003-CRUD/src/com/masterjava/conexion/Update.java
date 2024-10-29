package com.masterjava.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		
		ConexionBD conexion = new ConexionBD();
		Connection con = conexion.conexion();
		String query = "UPDATE personas SET edad =60 WHERE nombre='Rosa'";
		
		if(con!=null) {
			try (Statement statement = con.createStatement()) {
				statement.executeUpdate(query);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
