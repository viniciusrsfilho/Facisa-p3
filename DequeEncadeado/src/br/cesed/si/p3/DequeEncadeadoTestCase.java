package br.cesed.si.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class DequeEncadeadoTestCase {
		
	private DequeEncadeado de;
	
	@Test
	public void testAddFirst() {
		de = new DequeEncadeado();
		de.addFirst(1, 1, "A");
		assertEquals(1, de.size());
		de.addFirst(1, 2, "B");
		de.addFirst(1, 3, "C");
		de.addFirst(1, 4, "D");
		assertEquals(4, de.size());
	}
	
	@Test
	public void testAddLast() {
		de = new DequeEncadeado();
		de.addLast(1, 1, "A");
		assertEquals(1, de.size());
		de.addLast(1, 2, "B");
		de.addLast(1, 3, "C");
		de.addLast(1, 4, "D");
		assertEquals(4, de.size());
	}
	
	@Test
	public void testRemoveFirst(){
		de = new DequeEncadeado();
		de.addFirst(1, 1, "A");
		de.addLast(1, 2, "B");
		de.addLast(1, 3, "C");
		de.addLast(1, 4, "D");
		de.removeFirst();
		assertEquals(3, de.size());
		de.removeFirst();
		de.removeFirst();
		assertEquals(1, de.size());
	}
	
	@Test
	public void testRemoveLast(){
		de = new DequeEncadeado();
		de.addFirst(1, 1, "A");
		de.addLast(1, 2, "B");
		de.addLast(1, 3, "C");
		de.addLast(1, 4, "D");
		de.removeLast();
		assertEquals(3, de.size());
		de.removeLast();
		de.removeLast();
		assertEquals(1, de.size());
	}

}
