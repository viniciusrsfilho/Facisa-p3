package br.cesed.si.p3;

/**
 * Class for my own implementation of linked stack
 * 
 * @author Vinicius Ramos
 *
 */
public class PilhaEncadeada {
	
	private Conta inicio;
	private int inseridos;
	
	/**
	 * Adds an Object in the stack
	 * 
	 * @param agencia
	 * @param conta
	 * @param titular
	 */
	public void push(int agencia, int conta, String titular){
		if(inicio == null){
			inicio  = new Conta(agencia, conta, titular);
		
		} else{
			Conta atual = inicio;
			
			while(atual.proximaConta != null){
				atual = atual.proximaConta;
			}
			atual.proximaConta = new Conta(agencia, conta, titular);
		}
		inseridos++;
	}
	
	/**
	 * Removes the top object from the stack
	 * and gets the removed object 
	 * 
	 * @return the removed object
	 */
	public Conta pop(){
		Conta atual = inicio;
		
		if(atual.proximaConta == null){
			inicio = null;
		} else {
			while(atual != null && atual.proximaConta != null){
				Conta atualProxima = atual.proximaConta;
				if(atualProxima.proximaConta == null){
					atual.proximaConta = null;
					inseridos--;
					return atualProxima;
				}
				atual = atual.proximaConta;
			}
		}
		inseridos--;
		return atual;
	}
	
	/**
	 * Returns the top object from the stack
	 * 
	 * @return the top object from the stack
	 */
	public Conta top(){
		Conta atual = inicio;
		
		while(atual != null && atual.proximaConta != null){
			atual = atual.proximaConta;
		}
		return atual;		
				
	}
	
	/**
	 * Returns the stack´s size
	 * 
	 * @return the stack's size
	 */
	public int size(){
		return inseridos;
	}
	
	/**
	 * Method used for printing all stack objects
	 * 
	 */
	public void printAllElements(){
		Conta atual = inicio;
		
		while(atual != null){
			System.out.println(atual);
			atual = atual.proximaConta;
		}
	}
}
