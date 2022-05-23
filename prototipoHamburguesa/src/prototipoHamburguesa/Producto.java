package prototipoHamburguesa;

public abstract class Producto {

	//Atributos
	private String nombre;
	private float precio;
	
	//Constructor vacío
	public Producto() {}
	
	//Constructor completo
	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	//toString
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
