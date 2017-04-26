package br.cesed.si.p3;

public class TesteDeque {
	
	public static void main(String[] args) {
		
		MeuDeque md = new MeuDeque(3);
		
		md.addFirst("A");
		md.addFirst("B");
		md.addFirst("C");
		md.addFirst("D");
		
		md.addLast("Y");
		md.addLast("Z");
		
		md.removeFirst();
		md.removeFirst();
		md.removeLast();
		md.removeLast();
		md.printAllElements();
	}
}
