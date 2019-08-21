package Poo.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	private static String driverHsqldb = "org.hsqldb.jdbcDriver";
	private static String path = "C:\\Users\\fabricio\\Desktop\\hsqldb-2.4.1\\bd\\projetodw2";
	private static String local = "jdbc:hsqldb:file:" + path;
	private static String senha = "";
	private static String user = "SA";
	private static Connection comm ;
	
	public static Connection conectar(){
		if(comm == null){
		try {
			Class.forName(driverHsqldb);
			comm = DriverManager.getConnection(local, user, senha);
		}
		catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		return comm;
		
	}
	public static void fechar(Connection comm){
		try {
			comm.close();
			comm = null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
