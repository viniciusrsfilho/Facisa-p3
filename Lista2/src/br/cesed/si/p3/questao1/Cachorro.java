package br.cesed.si.p3.questao1;

public class Cachorro extends Animal{
	
	private String raca;

	public Cachorro(String nome, double peso, String raca) {
		super(nome, peso);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return super.toString() + ", raça = " + raca;
	}
	
	

}
