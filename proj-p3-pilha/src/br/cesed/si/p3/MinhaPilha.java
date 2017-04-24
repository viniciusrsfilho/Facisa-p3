package br.cesed.si.p3;

/**
 * class for my own implementation of stack
 * 
 * @author Vinicius Ramos
 *
 */

public class MinhaPilha {
	
	private int posicao;
	private int tamanho;
	private Object[] minhaPilha;
	
	/**
	 * constructor 
	 * 
	 * @param tamanho
	 */
	
	public MinhaPilha(int tamanho) {
		this.tamanho = tamanho;
		this.minhaPilha = new Object[tamanho];
	}
	
	/**
	 * Add an object
	 * 
	 * @param obj
	 */
	
	public void push(Object obj){
		if(posicao == minhaPilha.length){
			
			Object[] novaPilha = new Object[minhaPilha.length*2];
			
			for (int i = 0; i < minhaPilha.length; i++) {
				novaPilha[i] = minhaPilha[i];
			}
			minhaPilha = novaPilha;
		}
		minhaPilha[posicao++] = obj;
	}
	
	/**
	 * remove the last element
	 */
	public void pop(){
		
		for (int i = posicao-1; i > 0; i--) {
			if(minhaPilha[i] != null){
				minhaPilha[i] = null;
				posicao--;
				break;
			}
		}
	}
	
	/**
	 * return the last element
	 * 
	 * @return
	 */
	public Object top(){
		return minhaPilha[posicao-1];
	}
}