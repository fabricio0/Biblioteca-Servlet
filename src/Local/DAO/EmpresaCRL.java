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


public class EmpresaCRL {
	
	private Connection comm = conexao.conectar();
	public void inserirCurriculo(empresaCRL empresacrl,String cnpj){
		String sql = "insert into empresaCRL(numero,nome,obrigatorio,desejavel,descricao,cnpj,status) values(?,?,?,?,?,?,0)";
		
		try {
			PreparedStatement pst = comm.prepareStatement(sql);
			pst.setString(1, empresacrl.getNumero());
			pst.setString(2, empresacrl.getNome());
			pst.setString(3, empresacrl.getObrigatorio());
			pst.setString(4, empresacrl.getDesejavel());
			pst.setString(5, empresacrl.getDescricao());
			pst.setString(6, cnpj);
			
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public List<curriculo> pesquisarCurriculo(){
		String sql = "select us.curso, us.fone,cu.nome,cu.formacao, cu.experiencia from curriculo as cu join usuario us on cu.mataluno = us.matricula ";
		List<curriculo> cur = new ArrayList<curriculo>();
		try {
			PreparedStatement stm = comm.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			curriculo crl = new curriculo();
			while(rs.next()){
				crl.setExperiencia(rs.getNString(5));
				crl.setFormacao(rs.getString(4));
				crl.setNome(rs.getString(3));
				crl.us = new usuario();
				crl.us.setCurso(rs.getString(1));
				crl.us.setFone(rs.getString(2));
				cur.add(crl);
			}
			return cur;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cur;
		
	}

}
