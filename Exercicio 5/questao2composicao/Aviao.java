package questao2composicao;

public class Aviao {
	private String prefixo;
	private int numTurbinas;
	private Veiculo veiculo;
	
	
	public Aviao(String prefixo, int numTurbinas, Veiculo veiculo,
			String modelo, int numLugares, double comprimento, int ano, String cor) {
		super();
		this.prefixo = prefixo;
		this.numTurbinas = numTurbinas;
		this.veiculo = new Veiculo(modelo, numLugares, comprimento, ano, cor);
	}
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public int getNumTurbinas() {
		return numTurbinas;
	}
	public void setNumTurbinas(int numTurbinas) {
		this.numTurbinas = numTurbinas;
	}
	
	
}
