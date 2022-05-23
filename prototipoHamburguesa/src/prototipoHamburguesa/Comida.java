package prototipoHamburguesa;

import java.util.ArrayList;
import java.util.Scanner;

public class Comida extends Producto {

	//Atributos
	private static Scanner teclado = new Scanner(System.in);
	private String tipo;

	
	//Constructor vacío
	public Comida() {}
	
	//Constructor completo
	public Comida(String nombre, String tipo, float precio) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Comida [tipo=" + tipo + "]";
	}

	//Getter & Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Métodos
	public static void anadirComida(ArrayList<Producto> listaProductos) {
		
		//Comidas
		Comida cheeseBurguer = new Comida("Cheese Burguer", "Hamburguesa", 6.5f);
		Comida staticBurguer = new Comida("Static Burguer", "Hamburguesa", 5);
		Comida abstractBurguer = new Comida("Abstract Burguer", "Hamburguesa", 5.5f);
		Comida voidSalad = new Comida("Void Salad", "Ensalada", 4.5f);
		
		System.out.println("Elige una comida");
		System.out.println("1.-Cheese Burger");
		System.out.println("2.-Static Burguer");
		System.out.println("3.-Abstract Burguer");
		System.out.println("4.-Void Salad");
		
		String choice = teclado.nextLine();
		
		switch (choice) {
		case "1":
			listaProductos.add(cheeseBurguer);
			break;
		case "2":
			listaProductos.add(staticBurguer);
			break;
		case "3":
			listaProductos.add(abstractBurguer);
			break;
		case "4":
			listaProductos.add(voidSalad);
			break;
		}
	}

}
