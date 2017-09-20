package questao2heranca;

public class Lancha extends Veiculo {
	private int numMotores;

	
	
	
	public Lancha(int numMotores, String modelo, int numLugares,
			double comprimento, int ano, String cor) {
		super(modelo, numLugares, comprimento, ano, cor);
		this.numMotores = numMotores;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}
	
	
}
