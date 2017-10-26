public abstract class CapitalStrategy{

    public abstract double capital(Loan loan);

    public  double duration(Loan loan){
        return 1.0;
    }

    public  double riskFactorFor(Loan loan){
        return 1.0;
    }

    public void templateMethod(){
		calculate(capital(loan));
	}

    private void calculate(double capital) {	
	}
	
	

}