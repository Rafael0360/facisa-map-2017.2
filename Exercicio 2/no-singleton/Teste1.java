package br.cesed.si.poo;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ConexaoBancoDados conexao1 = new ConexaoBancoDados();
		ConexaoBancoDados conexao2 = new ConexaoBancoDados();
		ConexaoBancoDados conexao3 = new ConexaoBancoDados();
		conexao1.getConexao();
		conexao2.getConexao();
		conexao3.getConexao();

	}
}
