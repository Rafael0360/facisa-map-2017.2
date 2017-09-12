
import java.util.ArrayList;

public abstract class PizzaBuild {
	Pizza pizza = new Pizza();
	
	public abstract void buildTamanho(TamPizza tamanho);
	public abstract void buildMolho(MolhoPizza molho);
	public abstract void buildMassa(MassaPizza massa);
	public abstract void buildCobertura(ArrayList<CoberturaPizza> coberturas);
	public Pizza getPizza() {
		return pizza;
	}
}

class Pizza{
	
	public TamPizza tamanho;
	public MolhoPizza molho;
	public MassaPizza massa;
	public ArrayList<CoberturaPizza> coberturas;
	
}


class PizzariaRafael extends PizzaBuild {
	
	@Override
	public void buildTamanho(TamPizza tamanho) {
		pizza.tamanho = tamanho;
	}

	@Override
	public void buildMolho(MolhoPizza molho) {
		pizza.molho = molho;
		
	}

	@Override
	public void buildMassa(MassaPizza massa) {
		pizza.massa = massa;
		
		
	}

	@Override
	public void buildCobertura(ArrayList<CoberturaPizza> coberturas) {
		pizza.coberturas = coberturas;
		
	}
}

class PizzaAmericana{
	public PizzariaRafael pizzaria;
	ArrayList<CoberturaPizza> coberturas = new ArrayList<CoberturaPizza>();
	
	public PizzaAmericana(PizzariaRafael pr) {
		this.pizzaria = pr;
		coberturas.add(CoberturaPizza.CALABRESA);
		coberturas.add(CoberturaPizza.CEBOLA);
		coberturas.add(CoberturaPizza.FRANGO);
	}
	
	public void montarPizza() {
		pizzaria.buildMassa(MassaPizza.ITALIANA);
		pizzaria.buildMolho(MolhoPizza.TOMATE);
		pizzaria.buildTamanho(TamPizza.FAMILIA);
		pizzaria.buildCobertura(coberturas);
	}
	
	public PizzariaRafael getPizza() {
		return pizzaria;
	}
	
	
}


enum MassaPizza{
	TRADICIONAL,
	ITALIANA
}

enum CoberturaPizza{
	CALABRESA,
	CEBOLA,
	CARNE,
	FRANGO
}

enum MolhoPizza{
	TOMATE,
	BRANCO
}

enum TamPizza{
	PEQUENA,
	MEDIA,
	FAMILIA,
	
}
