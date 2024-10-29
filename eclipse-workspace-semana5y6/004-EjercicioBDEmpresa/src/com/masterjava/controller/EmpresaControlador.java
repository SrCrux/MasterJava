package com.masterjava.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masterjava.conexion.ConexionBD;
import com.masterjava.modelo.Empleado;

/**
 * Clase controladora que implementa los métodos necesarios para interactuar con
 * una base de datos básica.
 * 
 * @author Pablo Guijarro Pérez 21/10/2024
 * @version 1.0
 */
public class EmpresaControlador {

	ConexionBD conexion = new ConexionBD();
	Connection con = conexion.conexion();

	/**
	 * Método que crea un nuevo objeto en la tabla de la base de datos.
	 * 
	 * @param Empleado empleado que se quiere insertar en la base de datos.
	 * @return retorna 1 si la inserción es correcta. Retorna 0 si devuelve nada.
	 */
	public int altaEmpleado(Empleado empleado) {
		String query = "INSERT INTO empleados (nombre, primerapellido, segundoapellido, fechanacimiento, salario) VALUES (?,?,?,?,?)";
		if (con != null) {
			try (PreparedStatement statement = con.prepareStatement(query)) {
				statement.setString(1, empleado.getNombre());
				statement.setString(2, empleado.getApellido1());
				statement.setString(3, empleado.getApellido2());
				statement.setString(4, empleado.getFechaNacimiento());
				statement.setDouble(5, empleado.getSueldo());
				return statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	/**
	 * Método que modifica un objeto de la base de datos
	 * 
	 * @param id       - ID del empleado que se desea modificar.
	 * @param empleado - Empleado que se desea modificar.
	 * @return retorna 1 si la modificación es correcta. Retorna 0 si devuelve nada.
	 */
	public int modificarEmpleado(int id, Empleado empleado) {
		String query = "UPDATE empleados SET nombre=?,primerapellido=?,segundoapellido=?,fechanacimiento=?,salario=? WHERE id=?";
		if (con != null) {
			try (PreparedStatement statement = con.prepareStatement(query)) {
				statement.setString(1, empleado.getNombre());
				statement.setString(2, empleado.getApellido1());
				statement.setString(3, empleado.getApellido2());
				statement.setString(4, empleado.getFechaNacimiento());
				statement.setDouble(5, empleado.getSueldo());
				statement.setInt(6, id);
				return statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	/**
	 * Método que modifica el nombre de un objeto de la base de datos.
	 * 
	 * @param id-    ID del objeto que se desea modificar.
	 * @param nombre - El nuevo nombre del objeto.
	 * @return retorna 1 si la modificación es correcta. Retorna 0 si devuelve nada.
	 */
	public int modificarNombreEmpleado(int id, String nombre) {
		String query = "UPDATE empleados SET nombre=? WHERE id=?";
		if (con != null) {
			try (PreparedStatement statement = con.prepareStatement(query)) {
				statement.setString(1, nombre);
				statement.setInt(2, id);
				return statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	/**
	 * Método que modifica los apellidos de un objeto de la base de datos.
	 * 
	 * @param id        - ID del objeto que se desea modificar.
	 * @param apellido1 - El nuevo primer apellido del objeto.
	 * @param apellido2 - El nuevo segundo apellido del objeto.
	 * @return retorna 1 si la modificación es correcta. Retorna 0 si devuelve nada.
	 */
	public int modificarApellidosEmpleado(int id, String apellido1, String apellido2) {
		String query = "UPDATE empleados SET primerapellido=?, segundoapellido=? WHERE id=?";
		if (con != null) {
			try (PreparedStatement statement = con.prepareStatement(query)) {
				statement.setString(1, apellido1);
				statement.setString(2, apellido2);
				statement.setInt(3, id);
				return statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	/**
	 * Método que modifica la fecha de nacimiento de un objeto de la base de datos.
	 * 
	 * @param id    - ID del objeto que se desea modificar.
	 * @param fecha - La nueva fecha de nacimiento del objeto.
	 * @return retorna 1 si la modificación es correcta. Retorna 0 si devuelve nada.
	 */
	public int modificarFechaNacimientoEmpleado(int id, String fecha) {
		String query = "UPDATE empleados SET fechanacimiento=? WHERE id=?";
		if (con != null) {
			try (PreparedStatement statement = con.prepareStatement(query)) {
				statement.setString(1, fecha);
				statement.setInt(2, id);
				return statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	/**
	 * Método que modifica el salario de un objeto de la base de datos.
	 * 
	 * @param id      - ID del objeto que se desea modificar.
	 * @param salario - El nuevo salario del objeto.
	 * @return retorna 1 si la modificación es correcta. Retorna 0 si devuelve nada.
	 */
	public int modificarSalarioEmpleado(int id, double salario) {
		String query = "UPDATE empleados SET salario=? WHERE id=?";
		if (con != null) {
			try (PreparedStatement statement = con.prepareStatement(query)) {
				statement.setDouble(1, salario);
				statement.setInt(2, id);
				return statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	/**
	 * Método que muestra todos los empleados de la base de datos.
	 */
	public void verEmpleados() {
		String query = "SELECT * FROM empleados";

		try (PreparedStatement statement = con.prepareStatement(query)) {
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				System.out.println("ID:" + rs.getString(1));
				System.out.println("Nombre: " + rs.getString(2));
				System.out.print("Apellidos: " + rs.getString(3) + " ");
				System.out.println(rs.getString(4));
				System.out.println("Fecha de nacimiento: " + rs.getString(5));
				System.out.println("Sueldo: " + rs.getString(6) + "€");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método que busca un objeto en la base de datos por su apellido.
	 * 
	 * @param apellido - Apellido del objeto que desea buscar.
	 */
	public void buscarEmpleado(String apellido) {
		String query = "SELECT * FROM empleados WHERE primerapellido=?";

		try (PreparedStatement statement = con.prepareStatement(query)) {
			statement.setString(1, apellido);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				System.out.println("ID:" + rs.getString(1));
				System.out.println("Nombre: " + rs.getString(2));
				System.out.print("Apellidos: " + rs.getString(3) + " ");
				System.out.println(rs.getString(4));
				System.out.println("Fecha de nacimiento: " + rs.getString(5));
				System.out.println("Sueldo: " + rs.getString(6) + "€");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método que muestra el salario medio de todos los objetos de la base de datos.
	 */
	public void salarioMedio() {
		String query = "SELECT AVG(salario) FROM empleados";

		try (PreparedStatement statement = con.prepareStatement(query)) {
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				System.out.println("Salario medio: " + rs.getDouble(1));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método que elimina un objeto de la base de datos.
	 * 
	 * @param id - Id del objeto que desea eliminar.
	 * @return retorna 1 si la eliminación es correcta. Retorna 0 si devuelve nada.
	 */
	public int bajaEmpleado(int id) {
		String query = "DELETE FROM empleados WHERE id = ?";

		if (con != null) {
			try (PreparedStatement statement = con.prepareStatement(query)) {
				statement.setInt(1, id);
				return statement.executeUpdate();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return 0;
	}

	/**
	 * Método que aumenta el salario porcentualmente de un objeto de la base de
	 * datos.
	 * 
	 * @param id         - ID del objeto que se desea modificar.
	 * @param porcentaje - El porcentaje de aumento de sueldo.
	 * @return retorna 1 si la modificación es correcta. Retorna 0 si devuelve nada.
	 */
	public int aumentoPorcentualSalario(int id, double porcentaje) {
		String query = "UPDATE empleados SET salario=(salario+(?/100)*salario) WHERE id=?";
		if (con != null) {
			try (PreparedStatement statement = con.prepareStatement(query)) {
				statement.setDouble(1, porcentaje);
				statement.setInt(2, id);
				return statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	/**
	 * Método que disminuye el salario porcentualmente de un objeto de la base de
	 * datos.
	 * 
	 * @param id         - ID del objeto que se desea modificar.
	 * @param porcentaje - El porcentaje de disminución de sueldo.
	 * @return retorna 1 si la modificación es correcta. Retorna 0 si devuelve nada.
	 */
	public int disminucionPorcentualSalario(int id, double porcentaje) {
		String query = "UPDATE empleados SET salario=(salario-(?/100)*salario) WHERE id=?";
		if (con != null) {
			try (PreparedStatement statement = con.prepareStatement(query)) {
				statement.setDouble(1, porcentaje);
				statement.setInt(2, id);
				return statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

}
