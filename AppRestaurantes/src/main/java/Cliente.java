import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Cliente extends Persona{
	private String usuario;
	private String email;
	private String contraseña;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int edad, String usuario, String email, String contraseña) {
		super(edad);
		this.setUsuario(usuario);
		this.setEmail(email);
		this.setContraseña(contraseña);
	}
	
	//Metodo
	public void iniciarPedido() {
		
	}
		
	@SuppressWarnings("finally")
	public boolean registrarCliente() {
		boolean  resultat = true;
		Persona persona = new Persona();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/publicclasshamburguesa";
			Connection con = DriverManager.getConnection(url, "root", "Namiki1223"); //(url, usuario, contraseña)
			Statement st = con.createStatement();
			String query = "INSERT INTO cliente(id,edad,email,usuario,contraseña) VALUES ('1','"+persona.getEdad()+"','"+this.getEmail()+"','"+this.getUsuario()+"','"+this.getContraseña()+"')";
			st.executeUpdate(query);  //executeQuery para cuando hacemos un select, executeUpdate para un Insert
		} catch (Exception e) {
			resultat = false;
			System.out.println(e.getMessage());
		} finally {
			return resultat;
		}
		
	}

	//Getters y Setters
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
