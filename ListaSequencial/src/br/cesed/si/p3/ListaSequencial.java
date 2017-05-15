package br.cesed.si.p3;

public class ListaSequencial {

	private int tamanho;
	private int inseridos;
	private Object[] minhaLista;
	
	public ListaSequencial(int tamanho){
		this.tamanho = tamanho;
		minhaLista = new Object[tamanho];
	}
	
	public int size(){
		return inseridos;
	}
	
	public void add(Object obj){
		if(minhaLista.length == inseridos){
			Object[] novaLista = new Object[minhaLista.length*2];
			for (int i = 0; i < minhaLista.length; i++) {
				novaLista[i] = minhaLista[i];
			}
			minhaLista = novaLista;
		}
		minhaLista[inseridos++] = obj;
	}
	
	public void remove(Object obj){
		int posicaoRemover = 0;
		
		for (int i = 0; i < minhaLista.length; i++) {
			if(minhaLista[i].equals(obj)){
				posicaoRemover = i;
				break;
			}
		}	
		for (int i = posicaoRemover; i < inseridos-1; i++) {
			minhaLista[i] = minhaLista[i+1];
		}
		inseridos--;
	}
	
	public void removeByIndex(int index){
		if(minhaLista.length > index){
			for (int i = index; i < inseridos-1; i++) {
				minhaLista[i] = minhaLista[i+1];
			}
		}
		inseridos--;
	}
	
	public int findPosition(Object obj){

		for (int i = 0; i < minhaLista.length; i++) {
			if(minhaLista[i].equals(obj)){
				return i;
			}
		}
		return 0;
	}
}
