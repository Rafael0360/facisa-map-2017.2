package br.cesed.si.poo;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conexao1 = ConexaoBancoDados.getConexao();
		Connection conexao2 = ConexaoBancoDados.getConexao();
		Connection conexao3 = ConexaoBancoDados.getConexao();
		Connection conexao4 = ConexaoBancoDados.getConexao();
		Connection conexao5 = ConexaoBancoDados.getConexao();
	}

}
