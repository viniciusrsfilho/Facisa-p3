package br.cesed.si.p3.entidades;

public abstract class Conta {
	
	private int agencia;
	private int conta;
	private String titular;
	private double saldo;
	
	public Conta(int agencia, int conta, String titular) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}

	public Conta(int agencia, int conta, String titular, double saldo) {
		this(agencia, conta, titular);
		this.saldo = saldo;
	}
	
	public void sacar(double valor){
		if(saldo >= valor){
			saldo -= valor;
		}
	}
	
	public void depositar(double valor){
		if(valor > 0){
			saldo += valor;
		}
	}
	
	public double obterSaldo(){
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
