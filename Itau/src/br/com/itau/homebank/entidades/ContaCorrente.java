package br.com.itau.homebank.entidades;

public class ContaCorrente extends Conta {

	
	private double investimento;

	public ContaCorrente(int agencia, int conta, String titular, double investimento) {
		super(agencia, conta, titular);
		this.investimento = investimento;
	}

	public ContaCorrente(int agencia, int conta, String titular, double saldo, double investimento) {
		super(agencia, conta, titular, saldo);
		this.investimento = investimento;
	}

	public double getInvestimento() {
		return investimento;
	}

	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}

	public String toString() {
		
//		return "Cc ag = " + super.getAgencia() + " c = " + super.getConta() + " investimento = " + investimento;	
		return super.toString() + " investimento=" + investimento;
	}

	

}
