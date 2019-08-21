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
                <h1>IFSP C�mpus S�o Carlos</h1>
                <h2>Minist�ro da Educa��o</h2>
            </div>
        </nav>
    </header>
    <section class="sub-nav-bg">
            <div class="sub-nav">
                <ul>
                    <li><a href="#">Contato e Localiza��o</a></li>
                    <li><a data-refs="#login">Login</a></li>
                    <li><a data-refs="#cadastro">Cadastro </a></li>
                    <li><a href="http://www2.ifsp.edu.br/acessoainformacao//" target="_blank" rel="noopener noreferrer">Acesso � Informa��o</a></li>
                    <li><a href="http://www2.ifsp.edu.br/ouvidoria/" target="_blank" rel="noopener noreferrer">Ouvidoria</a></li>
                </ul>
            </div>
        </section>


        <section class="contato">
            <div>
            <h2>Contato e Localiza��o</h2>
            <h3>IFSP S�o Carlos</h3>
            <p>Endere�o do c�mpus: Estrada Municipal Paulo Eduardo de Almeida Prado - S�o Carlos - SP - CEP: 13.565-820</p>
            <p><span class="contato-acesso">Acesse</span> o <a href="#">Mapa.</a></p>
            <p>Endere�o para correspond�ncia: Rodovia Washington Lu�s, km 235 - Bairro Monjolinho - S�o Carlos - SP - CEP 13.565-905.</p>
            <h3 class="lista-contato">CONTATOS:</h3>
            <p>Dire��o Geral - Sala B213 - direcao.scl@ifsp.edu.br - <a href="tel:+551635091585">(16) 3509-1585</a></p>
            <p>Diretoria Adjunta Educacional (DAE) - Sala B101 - dae.scl@ifsp.edu.br -<a href="tel:+551635091568">(16) 3509-1568</a></p>
            <p>Coordenadoria de Registros Acad�micos (CRA) - Sala B102 - cra.scl@ifsp.edu.br -<a href="tel:+551633519458">(16) 3351-9458</a></p>
            <p>Coordenadoria de Apoio ao Ensino (CAE) - Sala B110 e B111 - cae.scl@ifsp.edu.br -<a href="tel:+551635091572">(16) 3509-1572</a></p>
            <p>Coordenadoria do Sociopedag�gico (CSP) - Sala B104 e B108 - csp.scl@ifsp.edu.br - <a href="tel:+551635091560">(16) 3509-1560 / (16) 3306-6872</a></p>
            <p> Diretoria Adjunta de Administra��o (DAA) - Sala B212 - daa.scl@ifsp.edu.br - <a href="tel:+551633519608">(16) 3351-9608</a></p>
            <p>Coordenadoria de Gest�o de Pessoas (CGP) - Sala B212 - cgp.scl@ifsp.edu.br -<a href="tel:+551635091557">(16) 3509-1557</a></p>
            <p>Coordenadoria de Manuten��o, Almoxarifado e Patrimonio (CAP) - Sala B103 - cap.scl@ifsp.edu.br -<a href="tel:+551635091552">(16) 3509-1552</a></p>
            <p>Coordenadoria de Contabilidade e Finan�as (CCF) - Sala B212 - ccf.scl@ifsp.edu.br -<a href="tel:+551633519608">(16) 3351-9608</a></p>
            <p>Coordenadoria de Licita��es e Contratos (CLT) - Sala B212 - clt.scl@ifsp.edu.br <a href="tel:+551633519608">(16) 3351-9608</a></p>
            <p> Coordenadoria de Apoio � Dire��o (CDI) - Sala B213 - cdi.scl@ifsp.edu.br -<a href="tel:+551635091585">(16) 3509-1585</a></p>
            <p>Coordenadoria de Biblioteca (CBI) - Sala C108 - bib.scl@ifsp.edu.br -<a href="tel:+551635091559">(16) 3509-1559</a></p>
            <p>Coordenadoria de Extens�o - Sala B205 - cex.scl@ifsp.edu.br -<a href="tel:+551635091577">(16) 3509-1577</a></p>
            <p>Coordenadoria de Tecnologia da Informa��o (CTI) - Sala C101 - cti.scl@ifsp.edu.br -<a href="tel:+551635091584">(16) 3509-1584</a></p>
            <p>T�cnicos de Laborat�rio - Mec�nica - Bloco A (Laborat�rios e hangar) -<a href="tel:+551635091599">(16) 3509-1599</a></p>
            </div>
        </section>



         <section class="login-bg" id="login">
        <h1>Login</h1>
        <div class="login-flex">
            
            <div class="formulario-info">
                <div class="form-info-grid">
                        <p>administrador</p>
                </div>
                <div class="form-info-grid">
                        <p>empresa</p>
                </div>
                <div class="form-info-grid">
                        <p>supervisor</p>
                </div>
                <div class="form-info-grid">
                        <p>usu�rio</p>
                </div>
            </div>
            <div class="formulario">
            <form action="loginadm" method="POST">
                <h3>Login administrador</h3>
                <label for="usuario">Usu�rio:</label>
                <input name="matricula" type="text" id="usuario">
                <label for="senha">Senha:</label>
                <input name="senha" type="password" id="senha">
                <button>entrar</button>
              </form>
            </div>
            <div class="formulario inativo">
                <h3>Login Empresa</h3>
                <form action="loginemp" method="POST">
                <label for="usuario">Usuario:</label>
                <input name="matricula" type="text" id="usuario">
                <label for="senha">Senha:</label>
                <input name="senha" type="password" id="senha">
                <button>entrar</button>
                </form>
            </div>
            <div class="formulario inativo">
                <h3>Login Supervisor</h3>
                 <form action="loginsup" method="POST">
                <label for="usuario">Usuario:</label>
                <input name="matricula" type="text" id="usuario">
                <label for="senha">Senha:</label>
                <input name="senha" type="password" id="senha">
                <button>entrar</button>
                </form>
            </div>
            <div class="formulario inativo">
                <h3>Login Usu�rio</h3>
                <form action="loginusu" method="POST">
                <label for="usuario">Usuario:</label>
                <input name="matricula" type="text" id="usuario">
                <label for="senha">Senha:</label>
                <input name="senha" type="password" id="senha">
                <button>entrar</button>
                </form>
            </div>
    </div>
    </section>

     <section class="cadastro-bg" id="cadastro">
        <h1>Cadastro</h1>

        <div class="cadastro-flex">
            <div class="formulario-info">
                <div class="form-info-grid-cadastro">
                        <p>administrador</p>
                </div>
                <div class="form-info-grid-cadastro">
                        <p>empresa</p>
                </div>
                <div class="form-info-grid-cadastro">
                        <p>supervisor</p>
                </div>
                <div class="form-info-grid-cadastro">
                        <p>usu�rio</p>
                </div>
            </div>
            <div class="formulario-cad">
            <form action="administrador" method="POST">
                <h3>Cadastro Administrador</h3>
                <label for="adm-nome">Nome:</label>
                <input type="text" id="adm-nome" name="nome">
                <label for="adm-matricula">Matr�cula:</label>
                <input type="text" id="adm-matricula" name="matricula">
                <label for="senha">senha:</label>
                <input type="password" id="senha" name="senha">
                <label for="confirmar-senha">Confirmar:</label>
                <input type="password" id="confirmar-senha" name="confirmarSenha">
                <button type="SUBMIT">Cadastrat</button>
            </form>
            </div>
            <div class="formulario-cad inativo">
                <h3>Cadastro Empresa</h3>
                <form action="empresa" method="POST">
                <label for="nome-empresa">Nome Fantasia:</label>
                <input name="fantasia" type="text" id="nome-fantasia">
                <label for="cnpj">CNPJ:</label>
                <input name="cnpj" type="text" id="cnpj">
                <label for="email">email Corporativo:</label>
                <input name="email" type="email" id="email">
                <label for="razao-social">Raz�o Social:</label>
                <input name="social" type="text" id="razao-social">
                <label for="func-respon-cad">Respons�vel Cadastro:</label>
                <input name="responsavel" type="text" id="func-respon-cad">
                <label for="func-cargo">Cargo:</label>
                <input name="cargo" type="text" id="func-cargo">
                <label for="cep-empresa">CEP:</label>
                <input name="cep" type="text" id="cep-empresa">
                <label for="cidade">Cidade:</label>
                <input name="cidade" type="text" id="cidade">
                <label for="estado">Estado:</label>
                <input name="estado" type="text" id="estado">
                <label for="endereco">Endere�o:</label>
                <input name="endereco" type="text" id="endereco">
                <label for="numero-empresa">N�mero:</label>
                <input name="numero" type="text" id="bairro">
                <label for="bairro">Bairro:</label>
                <input name="bairro" type="text" id="bairro">
                <label for="telefone">Telefone:</label>
                <input name="telefone" type="text" id="telefone">
                <label for="senha">senha:</label>
                <input name="senha" type="password" id="senha">
                <label for="confirmar-senha">Confirmar:</label>
                <input name="senha_cfm" type="password" id="confirmar-senha">
                <button>entrar</button>
                </form>
            </div>
            <div class="formulario-cad inativo">
                <h3>Cadastro Supervisor</h3>
                <form action="supervisor" method="POST">
                <label for="nome-supervisor">Nome:</label>
                <input name="nome" type="text" id="nome-supervisor">
                <label for="matricula-supervisor">Matr�cula:</label>
                <input name="matricula" type="text" id="matricula-supervisor">
                <label for="senha">senha:</label>
                <input name="senha" type="password" id="senha">
                <label for="confirmar-senha">Confirmar:</label>
                <input name="senha_cfm" type="password" id="confirmar-senha">
                <button>entrar</button>
                </form>
            </div>
            <div class="formulario-cad inativo">
                <h3>Cadastro Usu�rio</h3>
                <form action="usuario" method="POST">
                <label for="nome-usuario-cad">Nome:</label>
                <input name="nome" type="text" id="nome-usuario-cad">
                <label for="matricula-usuario-cad">Matr�cula:</label>
                <input name="matricula" type="text" id="matr�cula-usuario-cad">
                <label for="curso-usuario-cad">Curso:</label>
                <input name="curso" type="text" id="curso-usuario-cad">
                <label for="fone-usuario-cad">Fone:</label>
                <input name="fone" type="text" id="fone-usuario-cad">
                <label for="email-usuario-cad">email:</label>
                <input name="email" type="email" id="email-usuario-cad">
                <label for="senha">senha:</label>
                <input name="senha" type="password" id="senha">
                <label for="confirmar-senha">Confirmar:</label>
                <input name="senha_cfm" type="password" id="confirmar-senha">
                <button>entrar</button>
                </form>
            </div>
        </div>

        
    </section>

           


   
<script type="text/javascript" src="js/script.js"></script>
</body>

</html>