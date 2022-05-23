package menu;

import java.util.ArrayList;
import java.util.Scanner;

import prototipoHamburguesa.Bebida;
import prototipoHamburguesa.Comanda;
import prototipoHamburguesa.Comida;

public class Menu {

	// Atributos
	private static Scanner teclado = new Scanner(System.in);
	private ArrayList<Comanda> listaComandas = new ArrayList<Comanda>();

	// Métodos
	public void verComandas() {
		for (int i = 0; i < this.listaComandas.size(); i++) {
			System.out.println(this.listaComandas.get(i).toString());
		}
	}

	public static void main(String[] args) {

		Menu menu1 = new Menu();

		boolean salir = false;

		while (!salir) {

			System.out.println("1.-Crear comanda");
			System.out.println("2.-Ver todas las comandas");
			System.out.println("3.-Salir");

			String choice = teclado.nextLine();

			switch (choice) {
			case "1":
				Comanda.anadirComanda(menu1.listaComandas);
				break;
			case "2":
				menu1.verComandas();
				break;
			case "3":
				salir = true;
				break;
			}
		}

	}

}
