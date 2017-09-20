package questao2heranca;

public class Aviao extends Veiculo{
	private String prefixo;
	private int numTurbinas;
	
	
	
	public Aviao(String prefixo, int numTurbinas, String modelo, int numLugares,
			double comprimento, int ano, String cor) {
		super(modelo, numLugares, comprimento, ano, cor);
		this.prefixo = prefixo;
		this.numTurbinas = numTurbinas;
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
