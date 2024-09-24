package com.ejerciciosclase.ejerciciovideoclub;

import java.time.LocalDate;
import java.util.ArrayList;

public class Videoclub {

	private ArrayList<Cliente> listaClientes;
	private ArrayList<Prestamo> listaPrestamos;
	private ArrayList<Pelicula> listaPeliculas;

	public Videoclub() {

		listaClientes = new ArrayList<Cliente>();
		listaPrestamos = new ArrayList<Prestamo>();
		listaPeliculas = new ArrayList<Pelicula>();

	}

	public void añadirCliente(Cliente cliente) {

		listaClientes.add(cliente);

	}

	public void añadirPelicula(Pelicula pelicula) {

		listaPeliculas.add(pelicula);

	}

	public void añadirPrestamo(Prestamo prestamo) {

		listaPrestamos.add(prestamo);

	}

	public Pelicula buscarPelicula(int codigo) {

		Pelicula pelicula = null;

		for (int i = 0; i < listaPeliculas.size(); i++) {

			if (listaPeliculas.get(i).getCodigo() == codigo) {

				pelicula = listaPeliculas.get(i);
				break;

			}

		}
		return pelicula;
	}

	public Cliente buscarCliente(int nCarnet) {

		Cliente cliente = null;

		for (int i = 0; i < listaClientes.size(); i++) {

			if (listaClientes.get(i).getnCarnet() == nCarnet) {

				cliente = listaClientes.get(i);
				break;

			}

		}
		return cliente;
	}

	public ArrayList<Prestamo> getPrestamos() {

		return listaPrestamos;

	}

	public ArrayList<Prestamo> getPrestamos(int nCarnet) {

		ArrayList<Prestamo> listaPrestamosCliente = new ArrayList<>();

		for (int i = 0; i < listaPrestamos.size(); i++) {

			if (listaPrestamos.get(i).getCliente().getnCarnet() == nCarnet) {

				listaPrestamosCliente.add(listaPrestamos.get(i));

			}

		}
		return listaPrestamosCliente;
	}

	public boolean isDevuelto(int codigoPelicula, int nCarnet) {

		for (int i = 0; i < listaPrestamos.size(); i++) {

			if (listaPrestamos.get(i).getFechaDevolucion().isAfter(LocalDate.now())) {

				return false;

			}

		}
		return true;
	}

	public ArrayList<Cliente> prestamoMorosos() {

		ArrayList<Cliente> listaMorosos = new ArrayList<>();

		for (int i = 0; i < listaPrestamos.size(); i++) {

			if (isDevuelto(listaPrestamos.get(i).getPelicula().getCodigo(),
					listaPrestamos.get(i).getCliente().getnCarnet()) == false) {

				listaMorosos.add(listaPrestamos.get(i).getCliente());

			}

		}
		return listaMorosos;
	}

}
