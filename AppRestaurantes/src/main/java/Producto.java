public class Producto {
	private String id;
	private String nombre;
	private int precio;
	private int stock;
	
	public Producto (String id, String nombre, int precio, int stock) {
		this.setId(id);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setStock(stock);
	}
	
	public Producto() {
		this("","",0,0);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
