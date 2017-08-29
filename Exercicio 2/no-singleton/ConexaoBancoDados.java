package br.cesed.si.poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {

	private Connection conexao;
	
	public ConexaoBancoDados() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		conexao = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		System.out.println("chegou aqui");
	}
	
	public Connection getConexao() throws ClassNotFoundException, SQLException {
		
		return conexao;
	}
	
	
}
