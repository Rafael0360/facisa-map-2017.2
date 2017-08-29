No caso do projeto no-singleton, o java vai instaciar 3 vezes a classe ConexaoBancoDados.
Já no caso do projeto singleton, a classe teste irá apenas consultar o objeto connection na classe ConexaoBancoDados, não
	precisando instaciar a classe ou criar um novo objeto connection.
Esse procedimento vai resultar no melhor desempenho, visto que o java não precisará instanciar.