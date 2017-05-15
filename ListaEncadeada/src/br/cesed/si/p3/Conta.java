package br.cesed.si.p3;

public class Conta {
	
	private int agencia;
	private int conta;
	private String titular;
	private double saldo;
	protected Conta proximaConta;
	
	public Conta(int agencia, int conta, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
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

	public Conta getProximaConta() {
		return proximaConta;
	}

	public void setProximaConta(Conta proximaConta) {
		this.proximaConta = proximaConta;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", conta=" + conta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
}

