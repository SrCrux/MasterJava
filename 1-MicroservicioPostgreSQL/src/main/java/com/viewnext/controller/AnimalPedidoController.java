package com.viewnext.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.model.AnimalPedido;
import com.viewnext.model.AnimalPedidoDTO;
import com.viewnext.service.AnimalPedidoImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/animalpedido")
public class AnimalPedidoController {

	@Autowired
	AnimalPedidoImpl service;

	@Operation(summary = "Listar animales por pedido", description = "Endpoint que lista todos los animales que se han comprado en un pedido específico")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Lista generada correctamente."),
			@ApiResponse(responseCode = "204", description = "No se han encontrado datos para la lista consultada."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@GetMapping(value = "{idPedido}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AnimalPedido> obtenerAnimalesPorPedido(@PathVariable int idPedido) {
		return service.obtenerAnimalesPorPedido(idPedido);
	}

	@Operation(summary = "Alta de animal-pedido", description = "Endpoint que añade animales a un pedido, obtiene el precio total del pedido y actualiza los estados")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Consulta dada de alta correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void crearAnimalPedido(@RequestBody AnimalPedidoDTO animalPedido) {
		service.crearAnimalPedido(animalPedido.getIdPedido(), animalPedido.getIdAnimales());
	}

	@Operation(summary = "Baja de animal-pedido", description = "Endpoint que elimina un animal del pedido, actualiza el precio total  y los estados")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Consulta dada de baja correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@DeleteMapping(value = "{idPedidoAnimal}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void eliminarAnimalPedido(@PathVariable int idPedidoAnimal) {
		service.eliminarAnimalPedido(idPedidoAnimal);
	}

}
