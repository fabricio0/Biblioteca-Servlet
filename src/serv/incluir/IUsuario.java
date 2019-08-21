package serv.incluir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.Users.usuario;
import Local.DAO.Usuario;

/**
 * Servlet implementation class IUsuario
 */
@WebServlet("/IUsuario")
public class IUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		usuario user = new usuario();
		user.setCurso(request.getParameter("curso"));
		user.setMatricula(request.getParameter("matricula"));
		user.setEmail(request.getParameter("email"));
		user.setFone(request.getParameter("fone"));
		user.setNome(request.getParameter("nome"));
		user.setSenha(request.getParameter("senha"));
		
		Usuario userDAO = new Usuario();
		userDAO.InserirUsuario(user);
		
		
		RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
		view.forward(request, response);
	}

}
