package com.mycompany.app;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrinterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Printer p=new Printer();
		Integer[] intEle= {20,13,15,90,45,89};
		Integer[] expected= {20,13,15,90,45,89};
		Integer[] actual=p.printer(intEle);
		
		assertArrayEquals(expected, actual);
		
	}

}
