package br.cesed.si.p3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinhaPilhaTestCase {

	private MinhaPilha mp;
	
	@Test
	public void testPush() {
		mp = new MinhaPilha(3);
		
		mp.push("A");
		assertEquals("A", mp.top());
		mp.push("B");
		assertEquals("B", mp.top());
		mp.push("C");
		assertEquals("C", mp.top());
		mp.push("D");
		assertEquals("D", mp.top());
	}
	
	@Test
	public void testPop(){
		mp = new MinhaPilha(3);
		
		mp.push("A");
		mp.push("B");
		mp.push("C");
		mp.pop();
		assertEquals("B", mp.top());
		
		mp.pop();
		assertEquals("A", mp.top());
		
	}

}
