package br.cesed.si.p3;

import br.cesed.si.p3.entidades.ContaCorrente;
import br.cesed.si.p3.entidades.ContaPoupanca;

public class Teste {
	
	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca(1, 1, "Vinicius", 0.5);
		cp.depositar(1500);
		cp.sacar(100);
		System.out.println(cp.obterSaldo());
		
		ContaCorrente cc = new ContaCorrente(1, 1, "Vinicius");
		cc.depositar(1500);
		cc.sacar(100);
		System.out.println(cc.obterSaldo());

	}

}
