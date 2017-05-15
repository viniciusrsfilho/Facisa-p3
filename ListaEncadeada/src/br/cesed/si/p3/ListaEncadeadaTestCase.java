package br.cesed.si.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaEncadeadaTestCase {

	private ListaEncadeada le;
	
	@Test
	public void testAdd() {
		le = new ListaEncadeada();
		le.add(1, 1, "A");
		assertEquals(1, le.size());
		le.add(1, 2, "B");
		le.add(1, 3, "C");
		le.add(1, 4, "D");
		assertEquals(4, le.size());
	}
	
	@Test
	public void testRemove(){
		le = new ListaEncadeada();
		le.add(1, 1, "A");
		le.add(1, 2, "B");
		le.add(1, 3, "C");
		le.add(1, 4, "D");
		le.remove(1);
		assertEquals(3, le.size());
		le.remove(2);
		assertEquals(2, le.size());
		le.remove(4);
		assertEquals(1, le.size());
		
	}

}
