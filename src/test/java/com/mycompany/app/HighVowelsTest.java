package com.mycompany.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class HighVowelsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		SortVowel sv=new SortVowel();
		List<String> val=new ArrayList<String>();
		val.add("Raju");
		val.add("Raaiu");
		val.add("Raj");
		val.add("au");
		
		List<String> val1=new ArrayList<String>();
		val1.add("Raaiu");
		val1.add("au");
		val1.add("Raju");
		val1.add("Raj");
		
		List actual=sv.sorting(val);
		
		assertEquals(val1, actual);
	}

}
