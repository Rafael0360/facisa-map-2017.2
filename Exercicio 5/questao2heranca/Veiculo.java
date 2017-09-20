package questao2heranca;

public abstract class Veiculo {
	private String modelo;
	private int numLugares;
	private double comprimento;
	private int ano;
	private String cor;
	
	public Veiculo(String modelo2, int numLugares2, double comprimento2, int ano2, String cor2) {
		// TODO Auto-generated constructor stub
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumLugares() {
		return numLugares;
	}
	public void setNumLugares(int numLugares) {
		this.numLugares = numLugares;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
