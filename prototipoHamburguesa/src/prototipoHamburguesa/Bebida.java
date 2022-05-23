package prototipoHamburguesa;

import java.util.ArrayList;
import java.util.Scanner;

public class Bebida extends Producto {

	//Atributos
	private static Scanner teclado = new Scanner(System.in);
	private String tipo;
	private boolean alcohol;
	
	//Constructor vacío
	public Bebida() {}
	
	//Constructor completo
	public Bebida(String nombre, float precio, String tipo, boolean alcohol) {
		super(nombre, precio);
		this.tipo = tipo;
		this.alcohol = alcohol;	
	}

	//toString
	@Override
	public String toString() {
		return "Bebida [tipo=" + tipo + ", alcohol=" + alcohol + "]";
	}

	//Getters & Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAlcohol() {
		return alcohol;
	}

	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}
	
	//Métodos
	public static void anadirBebida(ArrayList<Producto> listaProductos) {
		
		//Bebidas
		Bebida cocaCola = new Bebida("Coca-Cola", 2, "gaseosa", false);
		Bebida agua = new Bebida("Agua", 1.5f, "natural", false);
		Bebida fantaNaranja = new Bebida("Fanta Naranja", 2, "gaseosa", false);
		Bebida cerveza = new Bebida("Cerveza", 2.5f, "natural", true);
		
		System.out.println("Elige una bebida");
		System.out.println("1.-Coca-cola");
		System.out.println("2.-Agua");
		System.out.println("3.-Fanta Naranja");
		System.out.println("4.-Cerveza");
		
		String choice = teclado.nextLine();
		
		switch (choice) {
		case "1":
			listaProductos.add(cocaCola);
			break;
		case "2":
			listaProductos.add(agua);
			break;
		case "3":
			listaProductos.add(fantaNaranja);
			break;
		case "4":
			listaProductos.add(cerveza);
			break;
		}
	}
}
