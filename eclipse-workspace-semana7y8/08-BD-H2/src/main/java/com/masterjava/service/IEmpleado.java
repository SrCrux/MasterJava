package com.masterjava.service;

import java.util.List;

import com.masterjava.model.Empleado;

public interface IEmpleado {

	public List<Empleado> listarEmpleados();

	public void altaEmpleado(Empleado empleado);

	public void modificarEmpleado(Empleado empleado);

	public List<Empleado> eliminarEmpleado(int id);

}
