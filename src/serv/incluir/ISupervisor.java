package serv.incluir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.Users.supervisor;
import Local.DAO.Supervisor;


/**
 * Servlet implementation class ISupervisor
 */
@WebServlet("/ISupervisor")
public class ISupervisor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		supervisor supervisor = new supervisor();
		supervisor.setMatricula(request.getParameter("matricula"));
		supervisor.setNome(request.getParameter("nome"));
		supervisor.setSenha(request.getParameter("senha"));
		
		Supervisor supervis = new Supervisor();
		supervis.InserirSurpevisor(supervisor);
		
		RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
		view.forward(request, response);
		
	
	}

}
