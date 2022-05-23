package funciones;
import java.util.ArrayList;

import prototipoHamburguesa.Comanda;
import prototipoHamburguesa.Producto;

public class Funciones {

	//Métodos
	public static float precioComanda(ArrayList<Producto> listaProductos) {
		float precioTotal = 0;
		
		for (int i = 0; i < listaProductos.size(); i++) {
			precioTotal += listaProductos.get(i).getPrecio();
		}
		
		return precioTotal;
	}
	
}
