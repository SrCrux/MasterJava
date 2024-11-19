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

import com.viewnext.model.Pedido;
import com.viewnext.service.PedidoImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	PedidoImpl service;

	@Operation(summary = "Listar Pedidos", description = "Endpoint que lista todos los pedidos de la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Lista generada correctamente."),
			@ApiResponse(responseCode = "204", description = "No se han encontrado datos para la lista consultada."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> listarPedidos() {
		return service.listarPedidos();
	}

	@Operation(summary = "Buscar Pedido", description = "Endpoint que busca un pedido por su ID en la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Consulta generada correctamente."),
			@ApiResponse(responseCode = "204", description = "No se han encontrado datos para el ID consultado."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@GetMapping(value = "{idPedido}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Pedido buscarPedido(@PathVariable int idPedido) {
		return service.buscarPedido(idPedido);
	}

	@Operation(summary = "Alta de pedido", description = "Endpoint que añade un nuevo pedido a la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Pedido dado de alta correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaPedido(@RequestBody Pedido pedido) {
		service.altaPedido(pedido);
	}

	@Operation(summary = "Modificación de pedido", description = "Endpoint que modifica un pedido de la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Pedido modificado correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void modificarPedido(@RequestBody Pedido pedido) {
		service.modificarPedido(pedido);
	}

	@Operation(summary = "Baja de pedido", description = "Endpoint que elimina un pedido de la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Pedido dado de baja correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@DeleteMapping(value = "{idPedido}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> bajaPedido(@PathVariable int idPedido) {
		return service.bajaPedido(idPedido);
	}

	@Operation(summary = "Beneficio de la tienda", description = "Endpoint que muestra el beneficio total de la tienda")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Consulta generada correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@GetMapping(value = "beneficio", produces = MediaType.APPLICATION_JSON_VALUE)
	public double beneficioTotalTienda() {
		return service.beneficioTotalTienda();
	}
}
