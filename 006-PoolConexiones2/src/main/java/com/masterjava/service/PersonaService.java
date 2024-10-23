package com.masterjava.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.masterjava.modelo.Persona;

public class PersonaService {
	private DataSource ds;

	public PersonaService() {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/MiDataSource");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public void insertarDatos(String nombre, String apellido, int edad) {
		String query = "INSERT INTO personas (nombre,apellido,edad) VALUES (?,?,?)";
		try (Connection conexion = ds.getConnection();
				PreparedStatement statement = conexion.prepareStatement(query);) {
			statement.setString(1, nombre);
			statement.setString(2, apellido);
			statement.setInt(3, edad);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Persona> mostrarDatos() {
		List<Persona> personas = new ArrayList<Persona>();
		String query = "SELECT * FROM personas";
		try (Connection conexion = ds.getConnection();
				PreparedStatement statement = conexion.prepareStatement(query);
				ResultSet rs = statement.executeQuery(query);) {
			
			while (rs.next()) {
				String nombre = rs.getString(1);
				String apellido = rs.getString(2);
				int edad = rs.getInt(3);
				Persona persona = new Persona(nombre, apellido, edad);
				personas.add(persona);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return personas;
	}
	
}
