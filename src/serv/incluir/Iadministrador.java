package serv.incluir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.Users.administrador;
import Local.DAO.Administrador;

@SuppressWarnings("serial")
public class Iadministrador extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException
	{
		administrador adm = new administrador();
		adm.setNome((request.getParameter("nome")));
		adm.setMatricula(request.getParameter("matricula"));
		adm.setSenha(request.getParameter("senha"));
		
		Administrador admInsere = new Administrador();
		admInsere.InserirAdministrador(adm);
		
		RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
		view.forward(request, response);
		
		
	}

}