package Local.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Data.Users.empresa;
import Poo.Factory.conexao;

public class Empresa {
	Connection comm = conexao.conectar();
	public boolean pesquisarEmpresa(empresa emp){
		String sql = "select * from empresa where cnpj = ? and senha = ?";
		try {
			PreparedStatement pst = comm.prepareStatement(sql);
			pst.setString(1, emp.getcnpj());
			pst.setString(2, emp.getsenha());
			empresa em = null;
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				em = new empresa();
				em.set(rs.getString("cnpj"));
				em.setsenha(rs.getString("senha"));
			}
			if(em != null){
				return true;
			}else{
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
	
	public void InserirEmpresa(empresa empresa){
		String sql = "INSERT INTO empresa(nome,cnpj,email,r_social,responsavel,"
				+ "cargo,cep,cidade,estado,endereco,numero,bairro,telefone,senha,categoria,status) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,'empresa',0)";
		try {
			PreparedStatement stm = comm.prepareStatement(sql);
			stm.setString(1, empresa.getnomeFantasia());
			stm.setString(2, empresa.getcnpj());
			stm.setString(3, empresa.getemailCorporativo());
			stm.setString(4, empresa.getrazaoSocial());
			stm.setString(5, empresa.getresponsavel());
			stm.setString(6, empresa.getcargo());
			stm.setString(7, empresa.getcep());
			stm.setString(8, empresa.getcidade());
			stm.setString(9,empresa.getestado());
			stm.setString(10,empresa.getendereco());
			stm.setString(11,empresa.getnumero());
			stm.setString(12,empresa.getbairro());
			stm.setString(13,empresa.gettelefone());
			stm.setString(14,empresa.getsenha());
			
			stm.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
