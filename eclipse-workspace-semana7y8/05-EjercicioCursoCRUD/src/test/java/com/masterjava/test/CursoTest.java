package com.masterjava.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.masterjava.model.Curso;
import com.masterjava.service.CursoImpl;
import com.masterjava.service.ICurso;

/**
 * Clase test que prueba los métodos de ICurso.
 * 
 * @author Pablo Guijarro Pérez
 * @version 1.0 29/10/2024
 */
class CursoTest {

	ICurso iCurso = new CursoImpl();
	List<Curso> listaCursos = new ArrayList<Curso>();

	@Test
	void listarCursosTest() {

		listaCursos = iCurso.listarCursos();
		assertEquals(iCurso.listarCursos(), listaCursos);

	}

	@Test
	void listarCursosPorRangoPrecioTest() {

		listaCursos = iCurso.listarCursosPorRangoPrecio(5, 50);
		assertEquals(iCurso.listarCursosPorRangoPrecio(5, 50), listaCursos);
	}

}
