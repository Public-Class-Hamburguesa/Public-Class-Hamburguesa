package PublicClassHamburgerPrueba;

import java.util.ArrayList;

public class Comanda {
	private String id;
	private float precio;
	private ArrayList<LineaComanda> lineasComanda = new ArrayList<LineaComanda>();
	
	public Comanda() {
		
	}
	
	public Comanda(String id, float precio, ArrayList<LineaComanda> lineasComanda) {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public ArrayList<LineaComanda> getLineasComanda() {
		return lineasComanda;
	}

	public void setLineasComanda(ArrayList<LineaComanda> lineasComanda) {
		this.lineasComanda = lineasComanda;
	}
}
