package serv.incluir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Data.Users.empresaCRL;
import Local.DAO.EmpresaCRL;

/**
 * Servlet implementation class empresa_crl
 */
@WebServlet("/empresa_crl")
public class empresa_crl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String matricula = (String) session.getAttribute("matricula"); 
		empresaCRL empresacrl = new empresaCRL();
		empresacrl.setNumero(request.getParameter("numero"));
		empresacrl.setNome(request.getParameter("nome"));
		empresacrl.setDescricao(request.getParameter("descricao"));
		empresacrl.setObrigatorio(request.getParameter("obrigatorio"));
		empresacrl.setDesejavel(request.getParameter("desejavel"));
		empresacrl.setCNPJ(request.getParameter(matricula));
		
		EmpresaCRL empresa = new EmpresaCRL();
		empresa.inserirCurriculo(empresacrl, matricula);
		
		PrintWriter out = response.getWriter();
		out.println("ok curriculo empresa");
	}

}
