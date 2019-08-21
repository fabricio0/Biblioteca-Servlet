package Local.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Data.Users.curriculo;
import Poo.Factory.conexao;

public class Curriculo {
	Connection comm = conexao.conectar();
	
	public void inserirCurriculo(curriculo crl, String matricula){
		String sql = "insert into curriculo(nome,formacao,experiencia,matAluno,status) values(?,?,?,?,0)";
		
		try {
			PreparedStatement pst = comm.prepareStatement(sql);
			pst.setString(1, crl.getNome());
			pst.setString(2, crl.getFormacao());
			pst.setString(3, crl.getExperiencia());
			pst.setString(4, matricula);
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
