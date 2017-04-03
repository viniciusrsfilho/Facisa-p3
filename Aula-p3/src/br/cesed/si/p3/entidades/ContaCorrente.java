package br.cesed.si.p3.entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}

	public ContaCorrente(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
	}
}
