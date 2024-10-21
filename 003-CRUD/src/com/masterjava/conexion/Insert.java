package com.masterjava.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		
		ConexionBD conexion = new ConexionBD();
		Connection con = conexion.conexion();
		String query = "INSERT INTO personas (nombre,apellido,edad) VALUES ('Rosa','Ndome',50)";
		
		if(con!=null) {
			try (Statement statement = con.createStatement()) {
				statement.executeUpdate(query);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
