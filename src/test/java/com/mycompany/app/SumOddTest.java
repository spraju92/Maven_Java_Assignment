package com.mycompany.app;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestCase;

public class SumOddTest extends TestCase {

	public SumOddTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void test() {
		SumOddVal sm=new SumOddVal();
		Collection<Integer> ci = Arrays.asList(1, 2, 3,5, 4,7);
		int actual=sm.countIf(ci, new OddPredicate());
		int expected=16;
		assertEquals(expected, actual);
	}

}
