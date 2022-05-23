package prototipoHamburguesa;

import java.util.ArrayList;
import java.util.Scanner;

public class Salsa extends Producto {

	//Atributos
	private static Scanner teclado = new Scanner(System.in);
	private boolean picante;
	
	//Constructor vacío
	public Salsa() {}
	
	//Constructor completo
	public Salsa(String nombre, float precio, boolean picante) {
		super(nombre, precio);
		this.picante = picante;
	}

	//toString
	@Override
	public String toString() {
		return "Salsa [picante=" + picante + "]";
	}

	//Getters & Setters
	public boolean isPicante() {
		return picante;
	}

	public void setPicante(boolean picante) {
		this.picante = picante;
	}
	
	//Métodos
	public static void anadirSalsa(ArrayList<Producto> listaProductos) {
		
		//Salsas
		Salsa mielMostaza = new Salsa("Miel mostaza", 0.8f, false);
		Salsa barbacoa = new Salsa("Barbacoa", 0.8f, false);
		Salsa ranchera = new Salsa("Ranchera", 0.7f, false);
		Salsa sourCream = new Salsa("Sour cream", 0.8f, false);
		
		System.out.println("Elige una salsa");
		System.out.println("1.-Miel mostaza");
		System.out.println("2.-Barbacoa");
		System.out.println("3.-Ranchera");
		System.out.println("4.-Sour cream");
		
		String choice = teclado.nextLine();
		
		switch (choice) {
		case "1":
			listaProductos.add(mielMostaza);
			break;
		case "2":
			listaProductos.add(barbacoa);
			break;
		case "3":
			listaProductos.add(ranchera);
			break;
		case "4":
			listaProductos.add(sourCream);
			break;
		}
	}
	
	
	
}
