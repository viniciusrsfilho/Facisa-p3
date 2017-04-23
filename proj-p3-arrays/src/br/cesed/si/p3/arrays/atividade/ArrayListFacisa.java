package br.cesed.si.p3.arrays.atividade;

/**
 * Class for my own implementation of ArrayList
 * 
 * @author Vinicius Ramos
 *
 */
public class ArrayListFacisa {
	
	private int posicao;
	private int tamanho;
	private Object[] arrayListFacisa;

	/**
	 * Constructor 
	 * 
	 * @param tamanho the initial size of ArrayList
	 */
	public ArrayListFacisa(int tamanho) {
		this.tamanho = tamanho;
		this.arrayListFacisa = new Object[this.tamanho];
	}
	
	/**
	 * Return the size of ArrayList.
	 * 
	 * @return
	 */
	public int size() {
		return posicao;
	}
	
	/**
	 * Add an object
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
	
		if(posicao >= arrayListFacisa.length){
			Object[] arrayMaior = new Object[arrayListFacisa.length*2];
			
			for (int i = 0; i < arrayListFacisa.length; i++) {
				arrayMaior[i] = arrayListFacisa[i];
			}
			arrayListFacisa = arrayMaior;
		}
		arrayListFacisa[posicao++] = obj;
	}	
	
	/**
	 * Remove an object
	 * 
	 * @param obj
	 */
	public void remove(Object obj) {
		
		int posicaoARemover = -1;
		
		for (int i = 0; i < arrayListFacisa.length; i++) {
			if(arrayListFacisa[i].equals(obj)){
				posicaoARemover = i;
				break;
			}
		}
		
		//posicao - 1, pois a ultima posição não poderá puxar o próximo elemento, pois não existe
		for (int i = posicaoARemover; i < posicao-1; i++) {
			arrayListFacisa[i] = arrayListFacisa[i+1];
		}
		posicao--;
	}
	
	/**
	 * Get the object by index.
	 * 
	 * For example, if I pass index as 0, this method will return the persisted value at first position of Array.
	 *  
	 * @param index index in Array
	 */
	public Object getByIndex(int index) {
		
		return arrayListFacisa[index];
	}

	/**
	 * Check the position of the informed object.
	 * 
	 * @param obj
	 * @return
	 */
	public int findPosition(Object obj) {
		
		for (int i = 0; i < arrayListFacisa.length; i++) {
			if(arrayListFacisa[i].equals(obj)){
				return i;
			}
		}
		return 0;
	}
	
	/**
	 * Print all array's elements
	 * 
	 */
	
	public void printAllElements() {
		
		for(int i = 0; i < posicao; i++) {
			System.out.println(arrayListFacisa[i]);
		}
	}
}
