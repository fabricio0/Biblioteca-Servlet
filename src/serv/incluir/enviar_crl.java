package serv.incluir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Data.Users.curriculo;
import Local.DAO.Curriculo;

/**
 * Servlet implementation class enviar_crl
 */
@WebServlet("/enviar_crl")
public class enviar_crl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String matricula = (String) session.getAttribute("matricula");
		curriculo crl = new curriculo();
		crl.setExperiencia(request.getParameter("experiencia"));
		crl.setFormacao(request.getParameter("formacao"));
		crl.setNome(request.getParameter("nome"));
		Curriculo cur = new Curriculo();
		cur.inserirCurriculo(crl, matricula);
		
		
		PrintWriter out = response.getWriter();
		out.println("ok curriculo user");
	}

}
