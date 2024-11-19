package com.viewnext.controller;

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

import com.viewnext.model.Cliente;
import com.viewnext.service.ClienteImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteImpl service;

	@Operation(summary = "Listar Clientes", description = "Endpoint que lista todos los clientes de la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Lista generada correctamente."),
			@ApiResponse(responseCode = "204", description = "No se han encontrado datos para la lista consultada."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cliente> listarClientes() {
		return service.listarClientes();
	}

	@Operation(summary = "Buscar Cliente", description = "Endpoint que busca un cliente por su ID en la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Consulta generada correctamente."),
			@ApiResponse(responseCode = "204", description = "No se han encontrado datos para el ID consultado."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@GetMapping(value = "{idCliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente buscarCliente(@PathVariable int idCliente) {
		return service.buscarCliente(idCliente);
	}

	@Operation(summary = "Alta de cliente", description = "Endpoint que añade un nuevo cliente a la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Cliente dado de alta correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaCliente(@RequestBody Cliente cliente) {
		service.altaCliente(cliente);
	}

	@Operation(summary = "Modificación de cliente", description = "Endpoint que modifica un cliente de la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Cliente modificado correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void modificarCliente(@RequestBody Cliente cliente) {
		service.modificarCliente(cliente);
	}

	@Operation(summary = "Baja de cliente", description = "Endpoint que elimina un cliente de la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Cliente dado de baja correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@DeleteMapping(value = "{idCliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cliente> bajaCliente(@PathVariable int idCliente) {
		return service.bajaCliente(idCliente);
	}
}
