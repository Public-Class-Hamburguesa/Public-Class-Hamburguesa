package prototipoHamburguesa;

import java.util.ArrayList;
import java.util.Scanner;

public class Postre extends Producto {

	//Atributos
	private static Scanner teclado = new Scanner(System.in);
	private boolean gluten;
	
	//Constructor vacío
	public Postre() {}
	
	//Constructor completo
	public Postre(String nombre, float precio, boolean gluten) {
		super(nombre, precio);
		this.gluten = gluten;
	}

	//toString
	@Override
	public String toString() {
		return "Postre [gluten=" + gluten + "]";
	}

	//Getters & Setters
	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	//Métodos
	public static void anadirPostre(ArrayList<Producto> listaProductos) {
		
		//Postres
		Postre chocolateCake = new Postre("Tarta de chocolate", 4, true);
		Postre cheeseCake = new Postre("Tarta de queso", 4.5f, true);
		Postre fruitSalad = new Postre("Variado de frutas", 3.5f, false);
		Postre vanillaIceCream = new Postre("Helado de vainilla", 2.5f, true);
		
		System.out.println("Elige un postre");
		System.out.println("1.-Tarta de chocolate");
		System.out.println("2.-Tarta de queso");
		System.out.println("3.-Variado de frutas");
		System.out.println("4.-Helado de vainilla");
		
		String choice = teclado.nextLine();
		
		switch (choice) {
		case "1":
			listaProductos.add(chocolateCake);
			break;
		case "2":
			listaProductos.add(cheeseCake);
			break;
		case "3":
			listaProductos.add(fruitSalad);
			break;
		case "4":
			listaProductos.add(vanillaIceCream);
		}
	}
	

}
