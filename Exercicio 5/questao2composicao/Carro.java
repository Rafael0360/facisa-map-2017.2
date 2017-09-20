package questao2composicao;

public class Carro {
	private int numPortas;
	private String placa;
	private Veiculo veiculo;
	
	public Carro(int numPortas, String placa,
			String modelo, int numLugares, double comprimento, int ano, String cor) {
		this.veiculo = new Veiculo(modelo, numLugares, comprimento, ano, cor);
		this.numPortas = numPortas;
		this.placa = placa;
	}
	
	
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
