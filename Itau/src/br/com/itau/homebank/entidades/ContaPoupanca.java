package br.com.itau.homebank.entidades;

public class ContaPoupanca extends Conta{
	
	private double juros;

	public ContaPoupanca(int agencia, int conta, String titular, double juros) {
		super(agencia, conta, titular);
		this.juros = juros;
	}
	
	public ContaPoupanca(int agencia, int conta, String titular, double saldo, double juros) {
		super(agencia, conta, titular, saldo);
		this.juros = juros;
	}
}
