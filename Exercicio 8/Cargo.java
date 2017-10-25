
public enum Cargo implements Gratificacao{

	DESENVOLVEDOR {

		@Override
		 public double calcularGratificacao(Funcionario umFuncionario) {
            if (umFuncionario.getNivel() >= 2) {
                return umFuncionario.getSalarioBase() * 1.25;
            }
            return umFuncionario.getSalarioBase() * 1.15;
		}
		
	},
	LIDER {

		public double calcularGratificacao(Funcionario umFuncionario) {
            if (umFuncionario.getNivel() >= 2) {
                return umFuncionario.getSalarioBase() * 1.35;
            }
            return umFuncionario.getSalarioBase() * 1.25;
      }
		
	},
	
	GERENTE {
		
		public double calcularGratificacao(Funcionario umFuncionario) {
	        if (umFuncionario.getNivel() >= 2) {
	            return umFuncionario.getSalarioBase() * 2;
	        }
	        return umFuncionario.getSalarioBase() * 2;
	  }
	}
	
}
