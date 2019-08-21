package serv.incluir;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Data.Users.supervisor;
import Local.DAO.Supervisor;

/**
 * Servlet implementation class login_supervisor
 */
@WebServlet("/login_supervisor")
public class login_supervisor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		supervisor sup = new supervisor();
		Supervisor supDAO = new Supervisor();
		sup.setMatricula(request.getParameter("matricula"));
		sup.setSenha(request.getParameter("senha"));
		
		boolean verifica = supDAO.pesquisarSupervisor(sup);
		if(verifica){
			HttpSession session = request.getSession();		
			session.setAttribute("matricula", sup.getMatricula());
			session.setAttribute("senha", sup.getSenha());
			RequestDispatcher view = request.getRequestDispatcher("/admin.html");
			view.forward(request, response);
		}else{
			RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
			view.forward(request, response);
		}
		
	}

}
