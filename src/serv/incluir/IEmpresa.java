package serv.incluir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Data.Users.empresa;
import Local.DAO.Empresa;

/**
 * Servlet implementation class IEmpresa
 */
@WebServlet("/IEmpresa")
public class IEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		empresa empresa = new empresa();
		empresa.setnomeFantasia(request.getParameter("fantasia"));
	    empresa.set(request.getParameter("cnpj"));
	    empresa.setemailCorporativo(request.getParameter("email"));
	    empresa.setrazaoSocial(request.getParameter("social"));
		empresa.setresponsavel(request.getParameter("responsavel"));
		empresa.setcargo(request.getParameter("cargo"));
		empresa.setcep(request.getParameter("cep"));
		empresa.setcidade(request.getParameter("cidade"));
		empresa.setestado(request.getParameter("estado"));
		empresa.setendereco(request.getParameter("endereco"));
		empresa.setnumero(request.getParameter("numero"));
		empresa.setbairro(request.getParameter("bairro"));
		empresa.settelefone(request.getParameter("telefone"));
		empresa.setsenha(request.getParameter("senha"));
	
		Empresa empresaDAO = new Empresa();
		empresaDAO.InserirEmpresa(empresa);
		
		RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
		view.forward(request, response);
		
	}

}
