package ejercicio_tienda_informatica;

public class Ordenador extends TiendaInformatica{
	
	private String procesador;
	private int memoria;
	private int capacidad;
	
	public Ordenador(int productoID, String modelo, double precio, int stock, String procesador, int memoria,
			int capacidad) {
		super(productoID, modelo, precio, stock);
		this.procesador = procesador;
		this.memoria = memoria;
		this.capacidad = capacidad;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

}
