public class Funcionario {
	public static final int DESENVOLVEDOR = 1;
	public static final int GERENTE = 2;
	public static final int LIDER = 3;
	protected double salarioBase;
	protected Cargo cargo;
    protected int nivel;



	public Funcionario(int cargo, double salarioBase, int nivel) {
		this.salarioBase = salarioBase;
		this.nivel = nivel;
		switch (cargo) {
		case DESENVOLVEDOR:
			this.cargo = Cargo.DESENVOLVEDOR;
			break;
		case GERENTE:
			this.cargo = Cargo.GERENTE;
			break;
		case LIDER:
			this.cargo = Cargo.LIDER;
			break;
		default:
			throw new RuntimeException("Cargo não encontrado :/");
		}
	}

	public double calcularGratificacao() {
		return this.cargo.calcularGratificacao(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
  
  	public int getNivel() {
		return nivel;
	}
}