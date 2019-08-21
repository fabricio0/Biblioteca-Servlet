package serv.incluir;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Data.Users.administrador;
import Local.DAO.Administrador;

/**
 * Servlet implementation class login_admin
 */
@WebServlet("/login_admin")
public class login_admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Administrador adms = new Administrador();
		administrador adm  = new administrador();
		adm.setMatricula(request.getParameter("matricula"));
		adm.setSenha(request.getParameter("senha"));
		
		
		boolean verifica = adms.pesquisarAdministrador(adm);
		if(verifica){
			HttpSession session = request.getSession();		
			session.setAttribute("matricula", adm.getMatricula());
			session.setAttribute("senha", adm.getSenha());
			RequestDispatcher view = request.getRequestDispatcher("/admin.html");
			view.forward(request, response);
		}else{
			RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
			view.forward(request, response);
		}
	}

}
