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
	
	public Cliente(String id, int edad, String usuario, String email, String contraseña) {
		super(id, edad);
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
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/DAWregistrar";
			Connection con = DriverManager.getConnection(url, "root", ""); //(url, usuario, contraseña)
			Statement st = con.createStatement();
			String query = "INSERT INTO cliente(id,edad,email,usuario,contraseña) VALUES ('"+super.getId()+"','"+super.getEdad()+"','"+this.getEmail()+"','"+this.getUsuario()+"','"+this.getContraseña()+"')";
			st.executeUpdate(query);  //executeQuery para cuando hacemos un select, executeUpdate para un Insert
		} catch (Exception e) {
			resultat = false;
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
