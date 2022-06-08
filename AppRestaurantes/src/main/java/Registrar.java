import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hello
 */
@WebServlet("/Registrar")
public class Registrar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	// http://localhost:8080/AppRestaurantes/hello

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet");
		Cliente cliente = new Cliente(Integer.valueOf(request.getParameter("edad")), request.getParameter("usuario"), request.getParameter("contrasenya"), request.getParameter("email"));
		response.addHeader("Access-Control-Allow-Origin", "*");
		if(cliente.registrarCliente()) {
			response.getWriter().append("Usuari Resgistrat correctament");
			System.out.println("Servlet good");
		}else {
			response.getWriter().append("Error: Usuari no resgistrat, nom de usuari ja existeix");
			System.out.println("Servlet bad");
		}
	}

}
