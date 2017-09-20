package questao2composicao;

public class Lancha {
	private int numMotores;
	private Veiculo veiculo;
	
	
	
	public Lancha(int numMotores, Veiculo veiculo, String modelo,
			int numLugares, double comprimento, int ano, String cor) {
		super();
		this.numMotores = numMotores;
		this.veiculo = veiculo;
		this.veiculo = new Veiculo(modelo, numLugares, comprimento, ano, cor);
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}
	
	
}
