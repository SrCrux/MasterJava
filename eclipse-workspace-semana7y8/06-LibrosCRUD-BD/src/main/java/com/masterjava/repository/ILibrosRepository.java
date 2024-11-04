package com.masterjava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masterjava.model.Libro;

public interface ILibrosRepository extends JpaRepository<Libro, Integer> {
@Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
List<Libro> buscarPorTitulo(String titulo);
}
