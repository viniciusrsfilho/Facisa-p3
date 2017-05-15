package br.cesed.si.p3;

public class ListaEncadeada {
	
	private Conta inicio;
	private int inseridos;
	
	public void add(int agencia, int conta, String titular){
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
	
	public void remove(int conta){
		Conta atual = inicio;
		
		if(atual != null && atual.getConta() == conta && atual.proximaConta == null){
			inicio = null;
			
		} else if(atual != null && atual.getConta() == conta && atual.proximaConta != null){
			inicio = atual.proximaConta;
			
		} else{
				while(atual != null && atual.proximaConta != null){
					Conta atualProxima = atual.proximaConta;
			
					if(atualProxima.getConta() == conta){
						atual.proximaConta = atualProxima.proximaConta;
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
