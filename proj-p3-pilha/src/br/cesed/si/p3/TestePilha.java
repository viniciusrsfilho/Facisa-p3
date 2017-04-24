package br.cesed.si.p3;

public class TestePilha {
	
	public static void main(String[] args) {
		
		MinhaPilha mp = new MinhaPilha(3);
		
		mp.push("Objeto 1");
		System.out.println(mp.top());
		
		mp.push("Objeto 2");
		System.out.println(mp.top());
		
		mp.push("Objeto 3");
		System.out.println(mp.top());
		
		mp.push("Objeto 4");
		System.out.println(mp.top());
		
		mp.pop();
		System.out.println(mp.top());
		
		mp.pop();
		System.out.println(mp.top());
	
	}

}
