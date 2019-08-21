package Local.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Data.Users.supervisor;
import Poo.Factory.conexao;

public class Supervisor {
	Connection comm = conexao.conectar();
	public boolean pesquisarSupervisor(supervisor sup){
		String sql = "select * from supervisor where matricula = ? and senha = ?";
		
		try {
			supervisor su = null;
			PreparedStatement pst = comm.prepareStatement(sql);
			pst.setString(1, sup.getMatricula());
			pst.setString(2, sup.getSenha());
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				su = new supervisor();
				su.setMatricula(rs.getString("matricula"));
				su.setSenha(rs.getString("senha"));
			}
			if(su != null){
				
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
	public void InserirSurpevisor(supervisor supervisor){
		String sql = "INSERT INTO SUPERVISOR(matricula,nome,senha,categoria,status) VALUES(?,?,?,'supervisor',0)";
		
		try {
			PreparedStatement stm = comm.prepareStatement(sql);
			stm.setString(1, supervisor.getMatricula());
			stm.setString(2, supervisor.getNome());
			stm.setString(3, supervisor.getSenha());
			
			stm.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}
