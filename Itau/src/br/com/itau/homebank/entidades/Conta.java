package br.com.itau.homebank.entidades;

public abstract class Conta {

	private int agencia;
	private int conta;
	private String titular;
	private double saldo;
	
	public Conta(int agencia, int conta, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}

	public Conta(int agencia, int conta, String titular, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
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
	
	public void sacar(double valor){
		if(saldo >= valor){
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor){
		if(valor > 0){
			saldo += valor;
		}
	}
	
	public double obterSaldo(){
		return this.saldo;
	}

	@Override
	public String toString() {
		return "Conta: agencia = " + agencia + ", conta = " + conta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + conta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (conta != other.conta)
			return false;
		return true;
	}	
}
