package br.cesed.si.p3;

/**
 * Class for my own implementation of deque
 * 
 * @author Vinicius Ramos
 *
 */
public class MeuDeque {
	
	private int inseridos;
	private int tamanho;
	private Object[] objetos;
	
	/**
	 * Constructor
	 *
	 * @param tamanho
	 */
	public MeuDeque(int tamanho){
		this.tamanho = tamanho;
		objetos = new Object[tamanho];
	}
	
	public int size(){
		return inseridos;
	}
	
	/**
	 * Add an object in last position
	 * 
	 * @param obj
	 */
	public void addLast(Object obj){
		
		if(inseridos == objetos.length){
			Object[] novoDeque = new Object[objetos.length*2];
			
			for (int i = 0; i < objetos.length; i++) {
				novoDeque[i] = objetos[i];
			}
			objetos = novoDeque;
		}
		
		objetos[inseridos++] = obj;
	}
	
	/**
	 * add an object in first position
	 * 
	 * @param obj
	 */
	public void addFirst(Object obj){
		if(inseridos == objetos.length){
			Object[] novoDeque = new Object[objetos.length*2];
			
			for (int i = 0; i < objetos.length; i++) {
				novoDeque[i] = objetos[i];
			}
			objetos = novoDeque;
		}
		
		if(objetos[0] != null){
			
			Object[] novoDeque = new Object[objetos.length];
			
			for (int i = 0; i < objetos.length-1; i++) {
				novoDeque[i+1] = objetos[i];
			}
			
			objetos = novoDeque;
			
		}
	
		objetos[0] = obj;
		inseridos++;
	}
	
	/**
	 * remove the last object
	 * 
	 */
	public void removeLast(){
		objetos[inseridos-1] = null;
		inseridos--;
	}
	
	/**
	 * remove the first object
	 * 
	 */
	//BUG
	public void removeFirst(){
		
		Object[] novoDeque = new Object[objetos.length];
		for (int i = 0; i < inseridos-1; i++) {
			novoDeque[i] = objetos[i+1];
		}
		objetos = novoDeque;
		inseridos--;
	}
	
	public void printAllElements(){
		for (int i = 0; i < objetos.length; i++) {
			System.out.println(objetos[i]);
		}
	}
}
