
interface Numero {
	
	public void montar();
}

class NumeroBase implements Numero {

	@Override
	public void montar() {
		System.out.print("1");
	}
	
}

class NumeroDecorator implements Numero {

	Numero numero;
	
	public NumeroDecorator(Numero numero) {
		this.numero = numero;
	}
	
	@Override
	public void montar() {
		this.numero.montar();
	}
	
}

class NumeroParentese extends NumeroDecorator {

	public NumeroParentese(Numero numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	public void montar() {
		System.out.print("(");
		this.numero.montar();
		System.out.print(")");
	}
}

	
class NumeroChave extends NumeroDecorator {

	public NumeroChave(Numero numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	public void montar() {
		System.out.print("{");
		this.numero.montar();
		System.out.print("}");
	}
	
}



class Main{
	public static void main(String [] args) {
		
		Numero n = new NumeroBase();
		n = new NumeroParentese(n);
		n.montar();
		
	}
}

