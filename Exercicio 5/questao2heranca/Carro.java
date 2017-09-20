package questao2heranca;

public class Carro extends Veiculo {
	private int numPortas;
	private String placa;
	
	
	
	public Carro(int numPortas, String placa, String modelo, int numLugares,
					double comprimento, int ano, String cor) {
		super(modelo, numLugares, comprimento, ano, cor);
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
