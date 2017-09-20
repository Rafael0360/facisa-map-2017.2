package questao2composicao;

public class Veiculo {
	private String modelo;
	private int numLugares;
	private double comprimento;
	private int ano;
	private String cor;
	
	
	
	public Veiculo(String modelo, int numLugares, double comprimento, int ano, String cor) {
		super();
		this.modelo = modelo;
		this.numLugares = numLugares;
		this.comprimento = comprimento;
		this.ano = ano;
		this.cor = cor;
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
