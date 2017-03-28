package br.edu.facisa.si;

import java.util.ArrayList;

/**
 * Classe para criar e manusear um array
 * 
 * @author Vinicius Ramos
 *
 */

public class ArrayVinicius {
	
	private int pos = 0;
	private String[] nomes;

	/**
	 * M�todo construtor que serve para criar o array com um tamanho qualquer
	 * @param tamanho
	 */
	public ArrayVinicius(int tamanho) throws InvalidSizeException{
		if(tamanho <= 0){
			throw new InvalidSizeException("Invalid size");
		}
		else{
			this.nomes = new String[tamanho];
		}
	}
	
	/**
	 * M�toto utilizado para aumentar o tamanho do array quando o mesmo estiver cheio
	 * Tamanho duplica e soma com o valor equivalente da letra "v"
	 */
	private void duplicaTamanho(){
		String nomesDuplicado[] = nomes;
		nomes = new String[(nomes.length*2)+22];
		int posOd = 0;
		for (String objetos : nomesDuplicado) {
			this.nomes[posOd ++] = objetos;
		}
	}
	
	/**
	 * M�todo respons�vel por organizar os elementos, para evitar ter alguma posi��o
	 * null quando remover algum elemento 
	 */
	private void organizarElementos(){
		String[] nomesOrg = new String[this.nomes.length];
		int posNome = 0;
		for(String nome : this.nomes){
			if(nome != null){
				nomesOrg[posNome++] = nome;
			}
		}
		this.nomes = nomesOrg;
	}
	
	/**
	 * M�todo utilizado para adicionar um nome dentro do array
	 * @param nome
	 */
	public void adicionarNome(String nome) throws NullValueException{
		if(nome == null){
			throw new NullValueException("Invalid name");
		}
		else{
			if(this.nomes.length == pos){
				duplicaTamanho();
			}
		}
		this.nomes[pos++] = nome;
	}
	
	/**
	 * M�todo utilizado para remover um nome de dentro do array
	 * @param nome
	 */
	public void removerNome(String nome) throws NullValueException{
		
		int posElemento = 0;
		
		if(nome == null){
			throw new NullValueException("Invalid name");
		}
		
		else{
			for (String elemento : nomes) {
				if(elemento.equals(nome)){
					nomes[posElemento] = null;
					break;
				}
			posElemento ++;						
			}
			organizarElementos();
		}
	}
	
	/**
	 * M�todo utilizado para remover um nome de dentro do array pela sua posi��o
	 * @param posicao
	 */
	public void removerNomePelaPosicao(int posicao) throws InvalidPositionException{
		if(posicao < 0){
			throw new InvalidPositionException("Invalid position");
		}
		else{
			this.nomes[posicao] = null;
		}
		organizarElementos();
	}
	
	/**
	 * M�todo que retorna o tamanho do array
	 * @return
	 */
	public int tamanho(){
		
		int tamanho = 0;
		
		for (String elemento : nomes) {
			if(elemento != null){
				tamanho ++;
			}
		}
		return tamanho;
	}
	
	/**
	 * Retorna um ArrayList com todos os objetos do array
	 * @return
	 */
	public ArrayList listar(){
		ArrayList listaArray = new ArrayList();
		for (String nome : nomes) {
			if(nome != null){
				listaArray.add(nome);
			}
		}
		return listaArray;
		
	}
	
	public String[] toArray(){
		return nomes;
	}
}
