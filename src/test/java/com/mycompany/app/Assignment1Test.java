package com.mycompany.app;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Assignment1Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	Assignment1 as=new Assignment1(); 
	private String input;
	private String expectedOutput;
	
	public Assignment1Test(String input,String expectedOutput) {
		this.input=input;
		this.expectedOutput=expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> testconditions() {
		String expectedoutput[][]= {{"8","Tom and Jerry"},{"26","Jerry"},{"5","Tom"}};
		
		return Arrays.asList(expectedoutput);
		
	}


	@Test
	public void test() {
		assertEquals(expectedOutput, as.condition(input));
	}

}
