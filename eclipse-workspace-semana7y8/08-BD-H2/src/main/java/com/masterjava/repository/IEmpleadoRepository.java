package com.masterjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masterjava.model.Empleado;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
