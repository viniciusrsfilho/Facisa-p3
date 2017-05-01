package br.cesed.si.p3.arrays.atividade;

import junit.framework.TestCase;

public class ArrayListFacisaTestCase extends TestCase {
	
	private ArrayListFacisa al;
	
	public void testAdd(){
		al = new ArrayListFacisa(3);
		
		al.add("A");
		assertEquals(1, al.size());
		
		al.add("B");
		al.add("C");
		al.add("D");
		assertEquals(4, al.size());
	}
	
	public void testRemove(){
		al = new ArrayListFacisa(3);
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.remove("A");
		assertEquals(2, al.size());
		
		al.add("D");
		al.remove("C");
		assertEquals(2, al.size());
		
		al.add("E");
		al.remove("E");
		assertEquals(2, al.size());
	}
	
	public void testGetByIndex(){
		al = new ArrayListFacisa(3);
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		assertEquals("A", al.getByIndex(0));
		assertEquals("B", al.getByIndex(1));
		assertEquals("D", al.getByIndex(3));
	}
	
	public void testFindPosition(){
		al = new ArrayListFacisa(3);
		
		al.add("A");
		al.add("B");
		al.add("C");
		assertEquals(0, al.findPosition("A"));
		assertEquals(1, al.findPosition("B"));
		assertEquals(2, al.findPosition("C"));
		
	}

}
