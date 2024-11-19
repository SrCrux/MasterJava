package com.viewnext.service;

import java.util.List;

import com.viewnext.model.AnimalPedido;

public interface IAnimalPedido {

	List<AnimalPedido> obtenerAnimalesPorPedido(int idPedido);

	void eliminarAnimalPedido(int idPedidoAnimal);

	void crearAnimalPedido(int idPedido, List<Integer> idAnimales);

}
