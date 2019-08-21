<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/estilo.css">
    <title>Document</title>
    <link href="https://fonts.googleapis.com/css?family=Oranienbaum|Playfair+Display" rel="stylesheet">
</head>

<body>

    <header class="nav-bg">
        <nav class="menu-nav">
            <img src="img\LogoIfsp.png" alt="logo ifsp">
            <div class="menu-nav-topico">
                <h1>IFSP Câmpus São Carlos</h1>
                <h2>Ministéro da Educação</h2>
            </div>
        </nav>
    </header>
    <section class="sub-nav-bg">
            <div class="sub-nav">
                <ul>
                    <li><a href="#">Contato e Localização</a></li>
                    <li><a data-refs="#login">Login</a></li>
                    <li><a data-refs="#cadastro">Cadastro </a></li>
                    <li><a href="http://www2.ifsp.edu.br/acessoainformacao//" target="_blank" rel="noopener noreferrer">Acesso à Informação</a></li>
                    <li><a href="http://www2.ifsp.edu.br/ouvidoria/" target="_blank" rel="noopener noreferrer">Ouvidoria</a></li>
                </ul>
            </div>
    </section>
    <%@ page import="java.util.*"%>
    <%@ page import="Data.Users.empresaCRL" %>
    <%@ page import="Local.DAO.EmpresaCRL,Poo.Factory.conexao,Data.Users.curriculo" %>
    <%! EmpresaCRL emp = new EmpresaCRL();
    List<curriculo> crl = emp.pesquisarCurriculo(); %>
    <% Iterator it = crl.iterator();
   for(curriculo its : crl){%>
    <label>nome: <%= its.getNome() %></label>
     <br />
    <label>experiencia: <%= its.getExperiencia() %></label>
     <br />
    <label>formação: <%= its.getFormacao() %></label>
    <br />
    <label>telefone: <%= its.us.getFone() %></label>
    <br />
    <br />
    <br />
   
    
    <% } %>
    

</body>
</html>