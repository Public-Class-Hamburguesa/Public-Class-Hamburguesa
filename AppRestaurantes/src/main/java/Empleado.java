package PublicClassHamburgerPrueba;

public class Empleado extends Persona{
	private String nombre;
	public Empleado() {
		super();
	}
	
	public Empleado(String id, int edad, String nombre) {
		super(id, edad);
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
