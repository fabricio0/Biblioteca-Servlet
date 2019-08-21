package serv.incluir;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Data.Users.empresa;
import Local.DAO.Empresa;

/**
 * Servlet implementation class login_empresa
 */
@WebServlet("/login_empresa")
public class login_empresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Empresa EmpDAO = new Empresa();
		empresa empresa = new empresa();
		empresa.set(request.getParameter("matricula"));
		empresa.setsenha(request.getParameter("senha"));
		boolean verifica = EmpDAO.pesquisarEmpresa(empresa);
		
		if(verifica){
			HttpSession session = request.getSession();		
			session.setAttribute("matricula", empresa.getcnpj());
			session.setAttribute("senha", empresa.getsenha());
			RequestDispatcher view = request.getRequestDispatcher("/empresa.html");
			view.forward(request, response);
		}else{
			RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
			view.forward(request, response);
		}
	}

}
