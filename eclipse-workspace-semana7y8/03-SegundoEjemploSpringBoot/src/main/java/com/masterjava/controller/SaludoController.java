package com.masterjava.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masterjava.model.Info;

@RestController
public class SaludoController {

	@GetMapping(value = "saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar() {
		return "Hola desde Spring Boot";
	}

	@GetMapping(value = "saludo/{nombre}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludarPersona(@PathVariable String nombre) {
		return "Hola desde Spring Boot " + nombre;
	}

	@GetMapping(value = "saludo2", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar(@RequestParam String nombre, @RequestParam int edad) {
		return "Hola " + nombre + " tienes " + edad + " años.";
	}

	@GetMapping(value = "infoCliente", produces = MediaType.APPLICATION_JSON_VALUE)
	public Info informacion() {
		return new Info("Pablo", 27, "pablo@gmail.com");
	}
}
