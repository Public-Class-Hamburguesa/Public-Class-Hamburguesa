package PublicClassHamburgerPrueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
	//Atributos
		private int edad;
		
		protected Scanner teclat = new Scanner(System.in);
		
		//Constructores
		public Persona (int edad) {
			this.setEdad(edad);
		}
		
		public Persona() {
			this(0);
		}

		public Persona(Persona persona) {
			this.edad = persona.getEdad();
		}

		//Getters y Setters
		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			Scanner teclat = new Scanner(System.in);
			boolean resultat=false;
				if(edad >= 18) {
					resultat=true;
					this.edad = edad;
				}else {
					System.out.println("Eres menor de edad, no puedes pedir alcohol");
				}
			
		}
		
		//Otros métodos
		public static void anyadirPersona(ArrayList<Persona> listaPersonas) {
			Scanner teclat = new Scanner (System.in);
			Persona persona = new Persona();
			
			System.out.println("Introduce tu edad: ");
			persona.setEdad(teclat.nextInt());
			teclat.nextLine();
			
			listaPersonas.add(persona);
		}
		
		public static void eliminarPersona(ArrayList<Persona> listaPersonas) {
//			Scanner teclat = new Scanner(System.in);
//			String nif = new String();
//			System.out.println("Introduce el NIF de la persona que quieres eliminar: ");
//			nif = teclat.nextLine();
			Boolean reserva = false;
			if(buscarPersonaId(listaPersonas) > -1 && reserva){
				listaPersonas.remove(buscarPersonaId(listaPersonas));
				System.out.println("Se ha eiminado la Persona");
			}else{
				System.out.println("Persona no encontrada");
			 }
			
		}
		
		public static int buscarPersonaId (ArrayList<Persona> listaPersonas) {
			Scanner teclat = new Scanner(System.in);
			String id = new String();
			System.out.println("Introduce el Id a buscar: ");
			id = teclat.nextLine();
			
			int posicion = -1;
			
			int i = 0;
			boolean encontrar = false;
			while(!encontrar && i < listaPersonas.size()) {
				if (listaPersonas.get(i).getId().equals(id)) {
					encontrar = true;
					posicion = i;
				}
				i = i + 1;
			}
			return posicion;
		}
		
		public void solicitarDatos() {
			Scanner teclat = new Scanner(System.in);
			String text = new String();
			int edad = 0;
			
			System.out.print("Edad: ");
			text = teclat.nextLine();
			this.setEdad(edad);
			
			teclat.close();
		}
		
		public void mostrarDatos() {
			System.out.println(this.getEdad());
		}
}
