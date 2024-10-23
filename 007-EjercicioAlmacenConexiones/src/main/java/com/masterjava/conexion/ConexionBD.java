package com.masterjava.conexion;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConexionBD {

	private DataSource ds;

	public Connection conectarBD() {
		Connection con = null;

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/MiDataSource");
			con = ds.getConnection();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
