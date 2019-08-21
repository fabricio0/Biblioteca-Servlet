package Local.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Data.Users.curriculo;
import Data.Users.empresaCRL;
import Data.Users.usuario;
import Poo.Factory.conexao;

public class Usuario {
	Connection conn =  conexao.conectar();

	public List<empresaCRL> pesquisarCurriculo(){
		String sql = "select emp.nome, emp.obrigatorio, emp.desejavel, emp.descricao from empresacrl emp";
		List<empresaCRL> cur = new ArrayList<empresaCRL>();
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			empresaCRL empcrl = new empresaCRL();
			while(rs.next()){
				empcrl.setNome(rs.getNString(1));
				empcrl.setObrigatorio(rs.getString(2));
				empcrl.setDesejavel(rs.getString(3));
				empcrl.setDescricao(rs.getNString(4));
				cur.add(empcrl);
			}
			return cur;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cur;
		
	}
	
	
	public boolean pesquisarSupervisor(usuario user){
		String sql = "select * from usuario where matricula = ? and senha = ?";
		
		try {
			usuario us = null;
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, user.getMatricula());
			stm.setString(2, user.getSenha());
			
			ResultSet rs = stm.executeQuery();
			while(rs.next()){
				us = new usuario();
				us.setMatricula(rs.getString("matricula"));
				us.setSenha(rs.getString("senha"));
			}
			if(us != null){
				
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
	
	public void InserirUsuario(usuario user){
		
		
		
		String sql = "INSERT INTO USUARIO(nome,matricula,curso,fone,email,senha,categoria,status) VALUES(?,?,?,?,?,?,'usuario',0)";
		
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			
			stm.setString(1, user.getNome());
			stm.setString(2, user.getMatricula());
			stm.setString(3, user.getCurso());
			stm.setString(4, user.getFone());
			stm.setString(5, user.getEmail());
			stm.setString(6, user.getSenha());
			
			stm.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
