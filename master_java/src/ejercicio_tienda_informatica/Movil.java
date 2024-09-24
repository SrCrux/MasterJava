package ejercicio_tienda_informatica;

public class Movil extends TiendaInformatica{

	private String operador;

	public Movil(int productoID, String modelo, double precio, int stock, String operador) {
		super(productoID, modelo, precio, stock);
		this.operador = operador;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}
	
}
