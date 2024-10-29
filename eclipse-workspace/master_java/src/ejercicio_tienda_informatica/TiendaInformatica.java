package ejercicio_tienda_informatica;

public abstract class TiendaInformatica {
	
	private final int productoID;
	private String modelo;
	private double precio;
	private int stock;
	
	public TiendaInformatica(int productoID, String modelo, double precio, int stock) {
		super();
		this.productoID = productoID;
		this.modelo = modelo;
		this.precio = precio;
		this.stock = stock;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getProductoID() {
		return productoID;
	}

	
}
