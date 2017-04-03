package br.cesed.si.p3.entidades;

public class ContaPoupanca extends Conta {
	
	private double juros;

	public ContaPoupanca(int agencia, int conta, String titular, double juros) {
		super(agencia, conta, titular);
		this.juros = juros;
	}

	public ContaPoupanca(int agencia, int conta, String titular, double saldo, double juros) {
		super(agencia, conta, titular, saldo);
		this.juros = juros;
	}
	
	public void sacar(double valor){
		double juros = (valor/100) * this.juros;
		double valorSacado = valor + juros;
		
		super.sacar(valorSacado);
	}
	
	public void depositar(double valor){
		super.depositar(valor);
	}
	
	public double obterSaldo(){
		return super.obterSaldo();
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
}
