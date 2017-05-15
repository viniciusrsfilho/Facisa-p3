package br.cesed.si.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PilhaSequencialTestCase {

	private PilhaSequencial mp;
	
	@Test
	public void testPush() {
		mp = new PilhaSequencial(3);
		
		mp.push("A");
		assertEquals("A", mp.top());
		mp.push("B");
		assertEquals("B", mp.top());
		mp.push("C");
		assertEquals("C", mp.top());
		mp.push("D");
		assertEquals("D", mp.top());
		assertEquals(4, mp.size());
	}
	
	@Test
	public void testPop(){
		mp = new PilhaSequencial(3);
		
		mp.push("A");
		mp.push("B");
		mp.push("C");
		mp.push("D");
		mp.pop();
		assertEquals("C", mp.top());
		mp.pop();
		assertEquals("B", mp.top());
		assertEquals(2, mp.size());
		
	}

}
