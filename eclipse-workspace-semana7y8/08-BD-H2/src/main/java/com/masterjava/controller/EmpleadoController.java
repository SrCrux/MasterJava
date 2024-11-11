package com.masterjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masterjava.model.Empleado;
import com.masterjava.service.IEmpleado;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
	@Autowired
	IEmpleado iEmpleado;

	@Operation(summary = "Listar empleados", description = "Ver todos los empleados de la BD", responses = {
			@ApiResponse(responseCode = "201", description = "Muestra empleados con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida") })

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> listarEmpleados() {
		return iEmpleado.listarEmpleados();
	}

	@Operation(summary = "Añadir empleado", description = "Añadir empleado a la BD", responses = {
			@ApiResponse(responseCode = "201", description = "Empleado añadido con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: el empleado ya existe") })
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaEmpleado(
			@Parameter(description = "Empleado a crear", required = true) @RequestBody Empleado empleado) {
		iEmpleado.altaEmpleado(empleado);
	}

	@Operation(summary = "Modificar empleado", description = "Modificar empleado de la BD", responses = {
			@ApiResponse(responseCode = "201", description = "Empleado modificado con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida") })
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void modificarEmpleado(
			@Parameter(description = "Empleado a modificar", required = true) @RequestBody Empleado empleado) {
		iEmpleado.modificarEmpleado(empleado);
	}

	@Operation(summary = "Eliminar empleado", description = "Eliminar empleado de la BD", responses = {
			@ApiResponse(responseCode = "201", description = "Empleado eliminado con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: el empleado no existe") })
	@DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> eliminarEmpleado(
			@Parameter(description = "Id del empleado a eliminar", required = true) @PathVariable int id) {
		return iEmpleado.eliminarEmpleado(id);
	}
}
