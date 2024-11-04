package com.masterjava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masterjava.model.Curso;

public interface ICursoRepository extends JpaRepository<Curso, Integer> {
	@Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :precioMin AND :precioMax")
	List<Curso> listarCursosPorRangoPrecio(int precioMin, int precioMax);

}
