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
	public boolean registrarCliente()  {
		boolean  resultat = true;
		try {
			if (!existirUsuario(usuario)) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3306/publicclasshamburguesa";
					Connection con = DriverManager.getConnection(url, "root", "Namiki1223"); //(url, usuario, contraseña)
					Statement st = con.createStatement();
					String query = "INSERT INTO cliente(edad,usuario,contraseña,email) VALUES ('"+super.getEdad()+"','"+this.getUsuario()+"','"+this.getContraseña()+"','"+this.getEmail()+"')";
					System.out.println(query);
					st.executeUpdate(query);  //executeQuery para cuando hacemos un select, executeUpdate para un Insert
					
				} catch (Exception e) {
					resultat = false;
					System.out.println(e.getMessage());
				} finally {
					return resultat;
				}
			}else {
				resultat = false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return resultat;
		
		
	}
	
	
	public static String selectUsuario(String usuario) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/publicClassHamburguesa";
		Connection con = DriverManager.getConnection(url, "root", "Namiki1223"); //(url, usuario, contraseña)
		Statement st = con.createStatement();
		
		String query = "SELECT usuario, contraseña FROM cliente WHERE usuario='"+usuario+"'"; // ?
		System.out.println(query);
		ResultSet rs = st.executeQuery(query);
		String resultat = "<p>Usuario</p>";
		
		while (rs.next()) {
			resultat = resultat 
						+"<p>"+rs.getString("usuario")+"</p>";
		}
		return resultat;
	}
	
	public static boolean existirUsuario(String usuario) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/publicClassHamburguesa";
		Connection con = DriverManager.getConnection(url, "root", "Namiki1223"); //(url, usuario, contraseña)
		Statement st = con.createStatement();
		
		String query = "SELECT usuario FROM cliente WHERE usuario='"+usuario+"'"; // ?
		System.out.println(query);
		ResultSet rs = st.executeQuery(query);
		
		String resultat ="";
		while (rs.next()) {
			resultat = rs.getString("usuario");
			
		}
		System.out.print(resultat.equals(usuario));
		if(resultat.equals(usuario)) {
			return true;
		}else {
			return false;
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
