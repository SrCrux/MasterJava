package com.masterjava.test;

import java.sql.Connection;

import com.masterjava.conexion.ConexionBD;

public class Test {

	public static void main(String[] args) {

		ConexionBD conexion = new ConexionBD();
		Connection con = conexion.conexion();

		if (con != null) {
			System.out.println("Conectado a la BD");
		} else {
			System.out.println("Fallo al conectar a la BD");
		}

	}

}
