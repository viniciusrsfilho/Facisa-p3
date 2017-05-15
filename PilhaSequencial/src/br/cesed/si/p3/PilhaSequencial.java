package br.cesed.si.p3;

public class PilhaSequencial {
	
	private int tamanho;
	private int inseridos;
	private Object[] minhaPilha;
	
	public PilhaSequencial(int tamanho){
		this.tamanho = tamanho;
		minhaPilha = new Object[tamanho];
	}
	
	public int size(){
		return inseridos;
	}
	
	public void push(Object obj){
		if(minhaPilha.length == inseridos){
			Object[] novaPilha = new Object[minhaPilha.length*2];
			for (int i = 0; i < minhaPilha.length; i++) {
				novaPilha[i] = minhaPilha[i];
			}
			minhaPilha = novaPilha;
		}
		minhaPilha[inseridos++] = obj;
	}
	
	public void pop(){
		minhaPilha[inseridos-1] = null;
		inseridos--;
	}
	
	public Object top(){
		return minhaPilha[inseridos-1];
	}
}
