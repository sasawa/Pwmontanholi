package Controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Generico.FuncoesGenericas;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double v1 = Double.parseDouble(request.getParameter("valor1"));
		double v2 = Double.parseDouble(request.getParameter("valor2"));
		String resposta = FuncoesGenericas.doubleToStr(v1+v2);
		
		
		response.getWriter()
		.append("<html>")
		.append("<head>")
		.append("<title>Resposta</title>")
		.append("</head>")
		.append("<body>")
		.append("A Resposta é " + resposta)
		.append("</body>")
		.append("</html>");
		//doGet(request, response);
	}

}
