public class LineaComanda {
	private String id;
	private int precio;
	private int cantidad;
	private Producto producto;
	
	public LineaComanda(String id, int precio, int cantidad, Producto producto) {
		this.setId(id);
		this.setPrecio(precio);
		this.setCantidad(cantidad);
		this.setProducto(producto);
		
	}
	
	public LineaComanda() {
		this("",0,0, null);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
