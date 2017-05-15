package br.cesed.si.p3;

public class DequeEncadeado {
	
	private Conta inicio;
	private int inseridos;
	
	public void addFirst(int agencia, int conta, String titular){
		if(inicio == null){
			inicio = new Conta(agencia, conta, titular);
		} else{
			Conta atual = inicio;
			inicio = new Conta(agencia, conta, titular);
			inicio.proximaConta = atual;
		}
		inseridos++;
	}
	
	public void addLast(int agencia, int conta, String titular){
		if(inicio == null){
			inicio = new Conta(agencia, conta, titular);
		} else{
			Conta atual = inicio;
			while(atual.proximaConta != null){
				atual = atual.proximaConta;
			}
			atual.proximaConta = new Conta(agencia, conta, titular);
		}
		inseridos++;
	}
	
	public void removeFirst(){
		Conta atual = inicio;
		
		if(atual != null && atual.proximaConta == null){
			inicio = null;
		} else {
			inicio = atual.proximaConta;
		}
		inseridos--;
	}
	
	public void removeLast(){
		Conta atual = inicio;
		
		if(atual.proximaConta == null){
			inicio = null;
		} else {
			while(atual != null && atual.proximaConta != null){
				Conta atualProxima = atual.proximaConta;
				if(atualProxima.proximaConta == null){
					atual.proximaConta = null;
				}
				atual = atual.proximaConta;
			}
		}
		inseridos--;
	}
	
	public int size(){
		return inseridos;
	}
	
	public void printAllElements(){
		Conta atual = inicio;
		while(atual != null){
			System.out.println(atual);
			atual = atual.proximaConta;
		}
	}

}
