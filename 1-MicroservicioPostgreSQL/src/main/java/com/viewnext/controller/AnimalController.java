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

import com.viewnext.model.Animal;
import com.viewnext.service.AnimalImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/animales")
public class AnimalController {

	@Autowired
	AnimalImpl service;

	@Operation(summary = "Listar Animales", description = "Endpoint que lista todos los animales de la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Lista generada correctamente."),
			@ApiResponse(responseCode = "204", description = "No se han encontrado datos para la lista consultada."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Animal> listarAnimales() {
		return service.listarAnimales();
	}

	@Operation(summary = "Buscar Animal", description = "Endpoint que busca un animal por su ID en la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Consulta generada correctamente."),
			@ApiResponse(responseCode = "204", description = "No se han encontrado datos para el ID consultado."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@GetMapping(value = "{idAnimal}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Animal buscarAnimal(@PathVariable int idAnimal) {
		return service.buscarAnimal(idAnimal);
	}

	@Operation(summary = "Alta de animal", description = "Endpoint que añade un nuevo animal a la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Animal dado de alta orrectamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaAnimal(@RequestBody Animal animal) {
		service.altaAnimal(animal);
	}

	@Operation(summary = "Modificación de animal", description = "Endpoint que modifica un animal de la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Animal modificado correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void modificarAnimal(@RequestBody Animal animal) {
		service.modificarAnimal(animal);
	}

	@Operation(summary = "Baja de animal", description = "Endpoint que elimina un animal de la base de datos")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Animal dado de baja correctamente."),
			@ApiResponse(responseCode = "500", description = "Error en la consulta") })
	@DeleteMapping(value = "{idAnimal}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Animal> bajaAnimal(@PathVariable int idAnimal) {
		return service.bajaAnimal(idAnimal);
	}

}
