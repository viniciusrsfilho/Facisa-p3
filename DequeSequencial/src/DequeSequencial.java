/**
 * Class for my own implementation of deque
 * 
 * @author Vinicius Ramos
 *
 */

public class DequeSequencial {

	private int tamanho;
	private int inseridos;
	private Object[] dequeSequencial;
	
	public DequeSequencial(int tamanho){
		this.tamanho = tamanho;
		dequeSequencial = new Object[tamanho];
	}
	
	/**
	 * Returns the deque's size
	 * 
	 * @return the deque's size
	 */
	public int size(){
		return inseridos;
	}
	
	/**
	 * Adds an object in the last position
	 * 
	 * @param obj
	 */
	public void addLast(Object obj){
		
		if(inseridos == dequeSequencial.length){
			Object[] novoDeque = new Object[dequeSequencial.length*2];
			
			for (int i = 0; i < dequeSequencial.length; i++) {
				novoDeque[i] = dequeSequencial[i];
			}
			dequeSequencial = novoDeque;
		}
		
		dequeSequencial[inseridos++] = obj;
	}
	
	/**
	 * adds an object in the first position
	 * 
	 * @param obj
	 */
	public void addFirst(Object obj){
		if(inseridos == dequeSequencial.length){
			Object[] novoDeque = new Object[dequeSequencial.length*2];
			
			for (int i = 0; i < dequeSequencial.length; i++) {
				novoDeque[i] = dequeSequencial[i];
			}
			dequeSequencial = novoDeque;
		}
		
		if(dequeSequencial[0] != null){
			
			Object[] novoDeque = new Object[dequeSequencial.length];
			
			for (int i = 0; i < dequeSequencial.length-1; i++) {
				novoDeque[i+1] = dequeSequencial[i];
			}
			
			dequeSequencial = novoDeque;
			
		}
	
		dequeSequencial[0] = obj;
		inseridos++;
	}
	
	/**
	 * removes the last object
	 * 
	 */
	public void removeLast(){
		dequeSequencial[inseridos-1] = null;
		inseridos--;
	}
	
	/**
	 * removes the first object
	 * 
	 */
	public void removeFirst(){
		
		Object[] novoDeque = new Object[dequeSequencial.length];
		for (int i = 0; i < inseridos-1; i++) {
			novoDeque[i] = dequeSequencial[i+1];
		}
		dequeSequencial = novoDeque;
		inseridos--;
	}
}
