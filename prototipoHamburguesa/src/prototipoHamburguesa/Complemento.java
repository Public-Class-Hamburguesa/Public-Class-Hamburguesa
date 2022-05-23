package prototipoHamburguesa;

import java.util.ArrayList;
import java.util.Scanner;

public class Complemento extends Producto {

	//Atributos
	private static Scanner teclado = new Scanner(System.in);
	private String tipo;
	
	//Constructor vacío
	public Complemento() {}
	
	//Constructor completo
	public Complemento(String nombre, float precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	//toString
	@Override
	public String toString() {
		return "Complemento [tipo=" + tipo + "]";
	}

	//Getters & Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Métodos
	public static void anadirComplemento(ArrayList<Producto> listaProductos) {
		
		//Complementos
		Complemento frenchFries = new Complemento("Patatas fritas normales", 3, "frito");
		Complemento deluxeFries = new Complemento("Patatas deluxe", 3.5f, "frito");
		Complemento onionRings = new Complemento("Aros de cebolla", 3.5f, "frito");
		Complemento cheeseSticks = new Complemento("Cheese sticks", 4, "frito");
		
		System.out.println("Elige un complemento");
		System.out.println("1.-Patatas fritas normales");
		System.out.println("2.-Patatas deluxe");
		System.out.println("3.-Aros de cebolla");
		System.out.println("4.-Cheese sticks");
		
		String choice = teclado.nextLine();
		
		switch (choice) {
		case "1":
			listaProductos.add(frenchFries);
			break;
		case "2":
			listaProductos.add(deluxeFries);
			break;
		case "3":
			listaProductos.add(onionRings);
			break;
		case "4":
			listaProductos.add(cheeseSticks);
		}
	}

}
