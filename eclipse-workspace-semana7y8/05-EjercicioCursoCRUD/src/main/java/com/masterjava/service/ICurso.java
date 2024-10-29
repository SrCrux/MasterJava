package com.masterjava.service;

import java.util.List;

import com.masterjava.model.Curso;

/**
 * Interfaz que implementa métodos CRUD para la clase Curso.
 * 
 * @author Pablo Guijarro Pérez
 * @version 1.0 29/10/2024
 */
public interface ICurso {

	/**
	 * Método que muestra todos los cursos disponibles.
	 * 
	 * @return lista de todos los cursos.
	 */
	public List<Curso> listarCursos();

	/**
	 * Método que da de alta un nuevo curso.
	 * 
	 * @param curso El curso que va a ser dado de alta.
	 * @return lista de todos los cursos incluido el nuevo.
	 */
	public List<Curso> altaCurso(Curso curso);

	/**
	 * Método que elimina un curso.
	 * 
	 * @param codCurso el codigo del curso que va a ser eliminado.
	 * @return lista de todos los cursos sin el curso eliminado.
	 */
	public List<Curso> bajaCurso(int codCurso);

	/**
	 * Método que cambia la duración de un curso.
	 * 
	 * @param codCurso el código del curso que va a ser actualizado
	 * @param duracion la nueva duración del curso
	 */
	public void actualizarDuracion(int codCurso, int duracion);

	/**
	 * Método que busca un curso de la lista de cursos.
	 * 
	 * @param codCurso el código del curso que solicita.
	 * @return los datos del curso buscado.
	 */
	public Curso buscarCurso(int codCurso);

	/**
	 * Método que lista cursos entre un rango de precios.
	 * 
	 * @param precioMin el precio mínimo del rango
	 * @param precioMax el precio máximo del rango.
	 * @return lista de cursos entre el rango de precios especificados.
	 */
	public List<Curso> listarCursosPorRangoPrecio(int precioMin, int precioMax);

}
