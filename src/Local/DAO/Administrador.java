package Local.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Data.Users.administrador;
import Poo.Factory.conexao;

public class Administrador {
	Connection comm = conexao.conectar();
	
	public void InserirAdministrador(administrador supervisor){
		String sql = "INSERT INTO administrador (nome,matricula,senha,tipo) values(?,?,?,?)";
		try {
			PreparedStatement stm = comm.prepareStatement(sql);
			stm.setString(1, supervisor.getNome());
			stm.setString(2, supervisor.getMatricula());
			stm.setString(3, supervisor.getSenha());
			stm.setString(4, "administrador");
			stm.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conexao.fechar(comm);

}
	public boolean pesquisarAdministrador(administrador adm){
		String sql = "select * from administrador where matricula = ? and senha = ?";
		
		try {
			PreparedStatement stm = comm.prepareStatement(sql);
			stm.setString(1, adm.getMatricula());
			stm.setString(2, adm.getSenha());
			administrador ad = null;
			ResultSet rs = stm.executeQuery();
			while(rs.next()){
				ad = new administrador();
				ad.setMatricula(rs.getNString("matricula"));
				ad.setSenha(rs.getString("senha"));
			}
			if(ad != null){
				
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
}
