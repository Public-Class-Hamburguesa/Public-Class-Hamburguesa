package prototipoHamburguesa;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodMenu extends Producto {

	//Atributos
	private static Scanner teclado = new Scanner(System.in);
	private Bebida bebida = new Bebida();
	private Complemento complemento = new Complemento();
	private Postre postre = new Postre();
	private Salsa salsa = new Salsa();
	private Comida comida = new Comida();
	
	//Constructor vacío
	public FoodMenu() {

	}
		
	
	//Constructor completo
	public FoodMenu(String nombre, Bebida bebida, Complemento complemento, Postre postre, Salsa salsa, Comida comida) {
		super();
		super.setNombre(nombre);
		super.setPrecio(0.95f * (bebida.getPrecio() + complemento.getPrecio() + postre.getPrecio() + salsa.getPrecio() + comida.getPrecio()));
		this.bebida = bebida;
		this.complemento = complemento;
		this.postre = postre;
		this.salsa = salsa;
		this.comida = comida;
	}

	//toString
	@Override
	public String toString() {
		return "FoodMenu [bebida=" + bebida + ", complemento=" + complemento + ", postre=" + postre + ", salsa=" + salsa
				+ ", comida=" + comida + "]";
	}

	//Getters & Setters
	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public Complemento getComplemento() {
		return complemento;
	}

	public void setComplemento(Complemento complemento) {
		this.complemento = complemento;
	}

	public Postre getPostre() {
		return postre;
	}

	public void setPostre(Postre postre) {
		this.postre = postre;
	}

	public Salsa getSalsa() {
		return salsa;
	}

	public void setSalsa(Salsa salsa) {
		this.salsa = salsa;
	}

	public Comida getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		this.comida = comida;
	}
	
	//Métodos
	public static void anadirFoodMenu(ArrayList<Producto> listaProductos) {
		
		//Comidas
		Comida cheeseBurguer = new Comida("Cheese Burguer", "Hamburguesa", 6.5f);
		Comida staticBurguer = new Comida("Static Burguer", "Hamburguesa", 5);
		Comida abstractBurguer = new Comida("Abstract Burguer", "Hamburguesa", 5.5f);
		Comida voidSalad = new Comida("Void Salad", "Ensalada", 4.5f);
		
		//Bebidas
		Bebida cocaCola = new Bebida("Coca-Cola", 2, "gaseosa", false);
		Bebida agua = new Bebida("Agua", 1.5f, "natural", false);
		Bebida fantaNaranja = new Bebida("Fanta Naranja", 2, "gaseosa", false);
		Bebida cerveza = new Bebida("Cerveza", 2.5f, "natural", true);
		
		//Complementos
		Complemento frenchFries = new Complemento("Patatas fritas normales", 3, "frito");
		Complemento deluxeFries = new Complemento("Patatas deluxe", 3.5f, "frito");
		Complemento onionRings = new Complemento("Aros de cebolla", 3.5f, "frito");
		Complemento cheeseSticks = new Complemento("Cheese sticks", 4, "frito");
		
		//Salsas
		Salsa mielMostaza = new Salsa("Miel mostaza", 0.8f, false);
		Salsa barbacoa = new Salsa("Barbacoa", 0.8f, false);
		Salsa ranchera = new Salsa("Ranchera", 0.7f, false);
		Salsa sourCream = new Salsa("Sour cream", 0.8f, false);
		
		//Postres
		Postre chocolateCake = new Postre("Tarta de chocolate", 4, true);
		Postre cheeseCake = new Postre("Tarta de queso", 4.5f, true);
		Postre fruitSalad = new Postre("Variado de frutas", 3.5f, false);
		Postre vanillaIceCream = new Postre("Helado de vainilla", 2.5f, true);
		
		FoodMenu nuevoMenu = new FoodMenu();
		
		System.out.println("Elige una comida");
		System.out.println("1.-Cheese Burger");
		System.out.println("2.-Static Burguer");
		System.out.println("3.-Abstract Burguer");
		System.out.println("4.-Void Salad");
		
		String comidaChoice = teclado.nextLine();
		
		switch (comidaChoice) {
		case "1":
			nuevoMenu.setComida(cheeseBurguer);
			break;
		case "2":
			nuevoMenu.setComida(staticBurguer);
			break;
		case "3":
			nuevoMenu.setComida(abstractBurguer);
			break;
		case "4":
			nuevoMenu.setComida(voidSalad);
		}
		
		System.out.println("Elige una bebida");
		System.out.println("1.-Coca-cola");
		System.out.println("2.-Agua");
		System.out.println("3.-Fanta Naranja");
		System.out.println("4.-Cerveza");
		
		String bebidaChoice = teclado.nextLine();
		
		switch (bebidaChoice) {
		case "1":
			nuevoMenu.setBebida(cocaCola);
			break;
		case "2":
			nuevoMenu.setBebida(agua);
			break;
		case "3":
			nuevoMenu.setBebida(fantaNaranja);
			break;
		case "4":
			nuevoMenu.setBebida(cerveza);
			break;
		}
		
		System.out.println("Elige un complemento");
		System.out.println("1.-Patatas fritas normales");
		System.out.println("2.-Patatas deluxe");
		System.out.println("3.-Aros de cebolla");
		System.out.println("4.-Cheese sticks");
		
		String complementoChoice = teclado.nextLine();
		
		switch (complementoChoice) {
		case "1":
			nuevoMenu.setComplemento(frenchFries);
			break;
		case "2":
			nuevoMenu.setComplemento(deluxeFries);
			break;
		case "3":
			nuevoMenu.setComplemento(onionRings);
			break;
		case "4":
			nuevoMenu.setComplemento(cheeseSticks);
			break;
		}
		
		System.out.println("Elige una salsa");
		System.out.println("1.-Miel mostaza");
		System.out.println("2.-Barbacoa");
		System.out.println("3.-Ranchera");
		System.out.println("4.-Sour cream");
		
		String salsaChoice = teclado.nextLine();
		
		switch (salsaChoice) {
		case "1":
			nuevoMenu.setSalsa(mielMostaza);
			break;
		case "2":
			nuevoMenu.setSalsa(barbacoa);
			break;
		case "3":
			nuevoMenu.setSalsa(ranchera);
			break;
		case "4":
			nuevoMenu.setSalsa(sourCream);
			break;
		}
		
		System.out.println("Elige un postre");
		System.out.println("1.-Tarta de chocolate");
		System.out.println("2.-Tarta de queso");
		System.out.println("3.-Variado de frutas");
		System.out.println("4.-Helado de vainilla");
		
		String postreChoice = teclado.nextLine();
		
		switch (postreChoice) {
		case "1":
			nuevoMenu.setPostre(chocolateCake);
			break;
		case "2":
			nuevoMenu.setPostre(cheeseCake);
			break;
		case "3":
			nuevoMenu.setPostre(fruitSalad);
			break;
		case "4":
			nuevoMenu.setPostre(vanillaIceCream);
			break;
		}
		
		nuevoMenu.setNombre("Menú personalizado");
		nuevoMenu.setPrecio(0.95f * (nuevoMenu.bebida.getPrecio() + nuevoMenu.complemento.getPrecio() + nuevoMenu.postre.getPrecio() + nuevoMenu.salsa.getPrecio() + nuevoMenu.comida.getPrecio()));
		listaProductos.add(nuevoMenu);
				
	}
	
	
}
