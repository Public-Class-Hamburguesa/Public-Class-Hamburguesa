package prototipoHamburguesa;

import java.util.ArrayList;
import java.util.Scanner;

import funciones.Funciones;

public class Comanda {

	// Atributos
	private static Scanner teclado = new Scanner(System.in);
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	private String nombreCliente;
	private int id;
	private static int contador = 1;
	private String lineasComanda = "----COMANDA----\n\n";
	private float precioTotal;

	// Constructor vac�o
	public Comanda() {
		this.id = contador++;
	}

	// Constructor completo
	public Comanda(ArrayList<Producto> listaProductos, String nombreCliente, int id, String lineasComanda) {
		this.listaProductos = listaProductos;
		this.nombreCliente = nombreCliente;
		this.id = contador++;
		this.lineasComanda = lineasComanda;
	}

	// toString
	@Override
	public String toString() {
		return "Comanda [listaProductos=" + listaProductos + ", nombreCliente=" + nombreCliente + ", id=" + id
				+ ", lineasComanda=" + lineasComanda + ", precioTotal=" + precioTotal + "]";
	}

	// Getters & Setters
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Comanda.contador = contador;
	}

	public String getLineasComanda() {
		return lineasComanda;
	}

	public void setLineasComanda(String lineasComanda) {
		this.lineasComanda = lineasComanda;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}
	
	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	// M�todos


	public static void anadirComanda(ArrayList<Comanda> lista) {

		Comanda nuevaComanda = new Comanda();
		boolean salir = false;

		while (!salir) {

			System.out.println("1.-A�adir men�");
			System.out.println("2.-A�adir bebida");
			System.out.println("3.-A�adir comida");
			System.out.println("4.-A�adir salsa");
			System.out.println("5.-A�adir complemento");
			System.out.println("6.-A�adir postre");
			System.out.println("7.-Terminar comanda");

			String choice = teclado.nextLine();

			switch (choice) {
			case "1":
				FoodMenu.anadirFoodMenu(nuevaComanda.getListaProductos());
				break;
			case "2":
				Bebida.anadirBebida(nuevaComanda.getListaProductos());
				break;
			case "3":
				Comida.anadirComida(nuevaComanda.getListaProductos());
				break;
			case "4":
				Salsa.anadirSalsa(nuevaComanda.getListaProductos());
				break;
			case "5":
				Complemento.anadirComplemento(nuevaComanda.getListaProductos());
				break;
			case "6":
				Postre.anadirPostre(nuevaComanda.getListaProductos());
				break;
			case "7":
				salir = true;
				break;
			}
		}
			nuevaComanda.setPrecioTotal(Funciones.precioComanda(nuevaComanda.listaProductos));
			lista.add(nuevaComanda);
		
	}
	
	

}
