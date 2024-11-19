package com.viewnext.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "animal_pedido")
public class AnimalPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido_animal")
	private int idPedidoAnimal;

	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name = "id_animal")
	private Animal animal;

	public AnimalPedido() {
	}

	public AnimalPedido(int idPedidoAnimal, Pedido pedido, Animal animal) {
		this.idPedidoAnimal = idPedidoAnimal;
		this.pedido = pedido;
		this.animal = animal;
	}

	public int getIdPedidoAnimal() {
		return idPedidoAnimal;
	}

	public void setIdPedidoAnimal(int idPedidoAnimal) {
		this.idPedidoAnimal = idPedidoAnimal;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
