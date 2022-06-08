import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String resultado = "";
		try {
			resultado = Cliente.selectUsuario(request.getParameter("usuario"));
			
		} catch (Exception e) {
			System.out.println("Error al descargar datos");
			System.out.println(e.getMessage());
		}
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.getWriter().append(resultado);
		System.out.println("Voy a enviar esto: "+resultado);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
