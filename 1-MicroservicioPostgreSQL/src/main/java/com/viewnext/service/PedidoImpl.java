package com.viewnext.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.model.Animal;
import com.viewnext.model.AnimalPedido;
import com.viewnext.model.EEstado;
import com.viewnext.model.Pedido;
import com.viewnext.repository.IPedidoRepo;

@Service
public class PedidoImpl implements IPedido {

	@Autowired
	IPedidoRepo pedidoRepository;
	@Autowired
	IAnimalPedido animalPedidoService;

	@Override
	public List<Pedido> listarPedidos() {
		return pedidoRepository.findAll();
	}

	@Override
	public Pedido buscarPedido(int idPedido) {
		return pedidoRepository.findById(idPedido).orElse(null);
	}

	@Override
	public void altaPedido(Pedido pedido) {
		pedido.setFechaPedido(LocalDate.now());
		pedido.setEstado(EEstado.PENDIENTE);
		pedidoRepository.save(pedido);
	}

	@Override
	public void modificarPedido(Pedido pedido) {
		pedidoRepository.save(pedido);
	}

	@Override
	public List<Pedido> bajaPedido(int idPedido) {
		pedidoRepository.deleteById(idPedido);
		return pedidoRepository.findAll();
	}

	@Override
	public double beneficioTotalTienda() {
		List<Pedido> listaPedidos = pedidoRepository.findAll();
		double beneficioTotal = 0;

		for (Pedido pedido : listaPedidos) {
			List<AnimalPedido> listaAnimalesPorPedido = animalPedidoService
					.obtenerAnimalesPorPedido(pedido.getIdPedido());

			for (AnimalPedido animalPedido : listaAnimalesPorPedido) {
				Animal animal = animalPedido.getAnimal();
				double beneficioAnimal = animal.getPrecioVenta() - animal.getPrecioCompra();
				beneficioTotal += beneficioAnimal;
			}
		}
		return beneficioTotal;
	}

}
