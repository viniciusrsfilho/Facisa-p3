package br.com.itau.homebank;

import br.com.itau.homebank.entidades.Conta;
import br.com.itau.homebank.entidades.ContaCorrente;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente(1,1,"Daniel",1.2);
		System.out.println(c1);
		
		Conta c2 = new ContaCorrente(10, 1234, "Daniel",3.2);
		System.out.println(c2);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
	}

}
