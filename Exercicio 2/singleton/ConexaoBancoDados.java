package br.cesed.si.poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {

	private static Connection conexao;
	
	public static Connection getConexao() throws ClassNotFoundException, SQLException {
		
		if(conexao == null) {
			System.out.println("chegou aqui");
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		}
		
		return conexao;
	}
	
	
}
