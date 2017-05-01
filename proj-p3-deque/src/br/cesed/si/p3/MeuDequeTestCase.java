package br.cesed.si.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeuDequeTestCase {

	private MeuDeque md;
	
	@Test
	public void testAddLast() {
		md = new MeuDeque(3);
		
		md.addLast("A");
		assertEquals(1, md.size());
		md.addLast("B");
		md.addLast("C");
		assertEquals(3, md.size());
		md.addLast("D");
		assertEquals(4, md.size());
	}
	
	@Test
	public void testAddFirst(){
		md = new MeuDeque(3);
		
		md.addFirst("A");
		assertEquals(1, md.size());
		md.addFirst("B");
		md.addFirst("C");
		assertEquals(3, md.size());
		md.addFirst("D");
		assertEquals(4, md.size());
	}
	
	@Test
	public void testRemoveLast(){
		md = new MeuDeque(3);
		
		md.addFirst("A");
		md.addLast("B");
		md.addLast("C");
		md.removeLast();
		assertEquals(2, md.size());
		md.removeLast();
		assertEquals(1, md.size());
	}
	
	@Test
	public void testRemoveFirst(){
		md = new MeuDeque(3);
		
		md.addFirst("A");
		md.addLast("B");
		md.addLast("C");
		md.removeFirst();
		assertEquals(2, md.size());
		md.removeFirst();
		assertEquals(1, md.size());
		
	}

}
