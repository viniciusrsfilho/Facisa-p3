package br.cesed.si.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PilhaEncadeadaTestCase {
	
	private PilhaEncadeada pe;

	@Test
	public void testPush() {
		pe = new PilhaEncadeada();
		pe.push(1, 1, "A");
		assertEquals(1, pe.size());
		pe.push(1, 2, "B");
		pe.push(1, 3, "C");
		pe.push(1, 4, "D");
		assertEquals(4, pe.size());
	}
	
	@Test
	public void testPop(){
		pe = new PilhaEncadeada();
		pe.push(1, 1, "A");
		pe.push(1, 2, "B");
		pe.push(1, 3, "C");
		pe.push(1, 4, "D");
		pe.pop();
		assertEquals(3, pe.size());
		pe.pop();
		assertEquals(2, pe.size());
		pe.pop();
		assertEquals(1, pe.size());
		pe.pop();
		assertEquals(0, pe.size());
	}

}
