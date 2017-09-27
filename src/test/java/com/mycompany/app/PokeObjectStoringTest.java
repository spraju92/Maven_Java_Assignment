package com.mycompany.app;

import junit.framework.TestCase;

public class PokeObjectStoringTest extends TestCase {

	public PokeObjectStoringTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void test() {
		Pokemon[] pokArr=new Pokemon[3];
		pokArr[0]=new Pokemon("Raju",23);
		pokArr[1]=new Pokemon("Nag",28);
		pokArr[2]=new Pokemon("Amar",28);
		
		Pokemon[] expected=new Pokemon[3];
		expected[0]=new Pokemon("Amar",28);
		expected[1]=new Pokemon("Nag",28);
		expected[2]=new Pokemon("Raju",23);
		
		System.out.println("Hi--------------------------------------------------");
		PokeObjectStoring ps=new PokeObjectStoring();
	
		Pokemon[] actual=ps.comparePokemon(pokArr);
		int exp=expected[0].power;
		int act=actual[0].power;
		
		
	
		assertEquals(exp, act);
		
	}

}
