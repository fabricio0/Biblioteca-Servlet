package serv.incluir;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Data.Users.usuario;
import Local.DAO.Usuario;

/**
 * Servlet implementation class login_usuario
 */
@WebServlet("/login_usuario")
public class login_usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		usuario usuario = new usuario();
		Usuario userDAO = new Usuario();
		usuario.setMatricula(request.getParameter("matricula"));
		usuario.setSenha(request.getParameter("senha"));
		
		boolean verifica = userDAO.pesquisarSupervisor(usuario);
		if(verifica){
			HttpSession session = request.getSession();		
			session.setAttribute("matricula", usuario.getMatricula());
			session.setAttribute("senha", usuario.getSenha());
			RequestDispatcher view = request.getRequestDispatcher("/aluno.html");
			view.forward(request, response);
			
		}else{
			RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
			view.forward(request, response);
		}
	}

}
