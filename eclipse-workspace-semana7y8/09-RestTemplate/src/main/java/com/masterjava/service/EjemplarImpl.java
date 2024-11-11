package com.masterjava.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.masterjava.model.Ejemplar;

@Service
public class EjemplarImpl implements IEjemplar {
	@Autowired
	RestTemplate template;
	// MEJOR USAR CONSTANTE
	private final String URL = "http://localhost:8080/libros";

	@Override
	public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar) {
		template.postForLocation(URL, ejemplar);
		return Arrays.asList(template.getForObject(URL, Ejemplar[].class));
	}

}
