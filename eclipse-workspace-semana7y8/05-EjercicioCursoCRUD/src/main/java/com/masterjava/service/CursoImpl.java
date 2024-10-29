package com.masterjava.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.masterjava.model.Curso;

@Service
/**
 * Clase Impl que implementa los métodos de la interfaz ICurso.
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 29/10/2024
 */
public class CursoImpl implements ICurso {

	private List<Curso> listaCursos;

	public CursoImpl() {
		listaCursos = new ArrayList<Curso>(List.of(new Curso(1, "Jardineria", 120, 150),
				new Curso(2, "Bricolaje", 60, 0), new Curso(3, "Programación Java", 170, 699.99),
				new Curso(4, "Diseño gráfico", 60, 300), new Curso(5, "Yoga", 25, 59.99)));
	}

	@Override
	public List<Curso> listarCursos() {
		return listaCursos;
	}

	@Override
	public List<Curso> altaCurso(Curso curso) {
		if (!listaCursos.contains(curso)) {
			listaCursos.add(curso);
		}
		return listaCursos;
	}

	@Override
	public List<Curso> bajaCurso(int codCurso) {
		for (int i = 0; i < listaCursos.size(); i++) {
			if (listaCursos.get(i).getCodCurso() == codCurso) {
				listaCursos.remove(i);
			}
		}
		return listaCursos;
	}

	@Override
	public void actualizarDuracion(int codCurso, int duracion) {
		for (int i = 0; i < listaCursos.size(); i++) {
			if (listaCursos.get(i).getCodCurso() == codCurso) {
				if (duracion > 0) {
					listaCursos.get(i).setDuracion(duracion);
				}
			}
		}
	}

	@Override
	public Curso buscarCurso(int codCurso) {
		for (int i = 0; i < listaCursos.size(); i++) {
			if (listaCursos.get(i).getCodCurso() == codCurso) {
				return listaCursos.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Curso> listarCursosPorRangoPrecio(int precioMin, int precioMax) {
		List<Curso> listaCursosPrecio = new ArrayList<Curso>();
		for (int i = 0; i < listaCursos.size(); i++) {
			if (listaCursos.get(i).getPrecio() >= precioMin && listaCursos.get(i).getPrecio() <= precioMax) {
				listaCursosPrecio.add(listaCursos.get(i));
			}
		}
		return listaCursosPrecio;
	}

}
