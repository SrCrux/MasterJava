package com.masterjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masterjava.model.Empleado;
import com.masterjava.repository.IEmpleadoRepository;

@Service
public class EmpleadoImpl implements IEmpleado {
	@Autowired
	IEmpleadoRepository repository;

	@Override
	public List<Empleado> listarEmpleados() {
		return repository.findAll();
	}

	@Override
	public void altaEmpleado(Empleado empleado) {
		if (!repository.equals(empleado)) {
			repository.save(empleado);
		}
	}

	@Override
	public void modificarEmpleado(Empleado empleado) {
		repository.save(empleado);
	}

	@Override
	public List<Empleado> eliminarEmpleado(int id) {
		repository.deleteById(id);
		return repository.findAll();
	}

}
