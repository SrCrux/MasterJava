package com.masterjava.test;

import com.masterjava.controller.EmpresaControlador;
import com.masterjava.modelo.Empleado;

public class Test {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Pablo", "Guijarro", "Pérez", "1997-04-03", 120000);
		Empleado e2 = new Empleado("Ruth", "Hernández", "Regalado", "1997-10-16", 250000);
		EmpresaControlador controlador = new EmpresaControlador();

		controlador.altaEmpleado(e1);
		controlador.altaEmpleado(e2);
		e1.setSueldo(250000);
		controlador.modificarEmpleado(1, e1);
		controlador.verEmpleados();
		controlador.aumentoPorcentualSalario(1, 25);
		controlador.disminucionPorcentualSalario(2, 10);
		controlador.buscarEmpleado("Guijarro");
		controlador.modificarFechaNacimientoEmpleado(2, "1936-02-25");
		controlador.buscarEmpleado("Nieves");
		controlador.salarioMedio();

	}

}
