package com.viewnext.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.model.Animal;
import com.viewnext.model.AnimalPedido;
import com.viewnext.model.EEstado;
import com.viewnext.model.Pedido;
import com.viewnext.repository.IAnimalPedidoRepo;
import com.viewnext.repository.IAnimalRepo;
import com.viewnext.repository.IPedidoRepo;

@Service
public class AnimalPedidoImpl implements IAnimalPedido {

	@Autowired
	IAnimalPedidoRepo repository;

	@Autowired
	IPedidoRepo pedidoRepository;

	@Autowired
	IAnimalRepo animalRepository;

	@Override
	public void crearAnimalPedido(int idPedido, List<Integer> idAnimales) {
		Pedido pedido = pedidoRepository.findById(idPedido).orElse(null);
		List<Animal> listaAnimales = animalRepository.findAllById(idAnimales);
		for (Animal animal : listaAnimales) {
			AnimalPedido animalPedido = new AnimalPedido();
			animalPedido.setPedido(pedido);
			animalPedido.setAnimal(animal);
			repository.save(animalPedido);
			animal.setEstado(EEstado.VENDIDO);
			animalRepository.save(animal);
		}

		calcularPrecioPedido(idPedido);
		pedido.setEstado(EEstado.ENVIADO);
		pedidoRepository.save(pedido);
	}

	@Override
	public List<AnimalPedido> obtenerAnimalesPorPedido(int idPedido) {
		List<AnimalPedido> listaAnimalPedido = repository.findAll();
		List<AnimalPedido> listaAnimalesPorPedido = new ArrayList<>();

		for (AnimalPedido animalPedido : listaAnimalPedido) {
			if (animalPedido.getPedido() != null && animalPedido.getPedido().getIdPedido() == idPedido) {
				listaAnimalesPorPedido.add(animalPedido);
			}
		}
		return listaAnimalesPorPedido;
	}

	@Override
	public void eliminarAnimalPedido(int idPedidoAnimal) {
		AnimalPedido animalPedido = repository.findById(idPedidoAnimal).orElse(null);
		Pedido pedido = animalPedido.getPedido();
		Animal animal = animalPedido.getAnimal();
		animal.setEstado(EEstado.DEVUELTO);
		animalRepository.save(animal);
		repository.deleteById(idPedidoAnimal);
		calcularPrecioPedido(pedido.getIdPedido());
		pedidoRepository.save(pedido);

	}

	private void calcularPrecioPedido(int idPedido) {
		Pedido pedido = pedidoRepository.findById(idPedido).orElse(null);
		List<AnimalPedido> listaAnimales = repository.findAll();
		double precioTotal = 0;
		for (AnimalPedido animalPedido : listaAnimales) {
			if (animalPedido.getPedido().getIdPedido() == pedido.getIdPedido()) {
				precioTotal += animalPedido.getAnimal().getPrecioVenta();
			}
		}
		pedido.setPrecioTotal(precioTotal);
		pedidoRepository.save(pedido);
	}

}
