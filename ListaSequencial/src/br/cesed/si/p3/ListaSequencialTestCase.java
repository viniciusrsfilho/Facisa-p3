package br.cesed.si.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaSequencialTestCase {

	private ListaSequencial ls;
	
	@Test
	public void testAdd(){
		ls = new ListaSequencial(3);
		
		ls.add("A");
		assertEquals(1, ls.size());
		ls.add("B");
		ls.add("C");
		ls.add("D");
		assertEquals(4, ls.size());
		ls.add("E");
		assertEquals(5, ls.size());
	}
	
	@Test
	public void testRemove(){
		ls = new ListaSequencial(3);
		
		ls.add("A");
		ls.add("B");
		ls.add("C");
		ls.add("D");
		ls.remove("A");
		assertEquals(3, ls.size());
		
		ls.remove("C");
		assertEquals(2, ls.size());
		
		ls.remove("B");
		assertEquals(1, ls.size());
	}
	
	@Test
	public void testRemoveByIndex(){
		ls = new ListaSequencial(3);
		
		ls.add("A");
		ls.add("B");
		ls.add("C");
		ls.add("D");
		ls.removeByIndex(0);
		assertEquals(3, ls.size());
		
		ls.removeByIndex(1);
		assertEquals(2, ls.size());
		
		ls.removeByIndex(3);
		assertEquals(1, ls.size());
	}
	
	@Test
	public void testFindPosition(){
		ls = new ListaSequencial(3);
		
		ls.add("A");
		ls.add("B");
		ls.add("C");
		assertEquals(0, ls.findPosition("A"));
		assertEquals(1, ls.findPosition("B"));
		assertEquals(2, ls.findPosition("C"));

	}

}
