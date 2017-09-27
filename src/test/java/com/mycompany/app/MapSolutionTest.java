package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

public class MapSolutionTest extends TestCase {

	public MapSolutionTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void test() {
		MapSolution mp=new MapSolution();
		Map<String,String> map=new HashMap<String,String>();  
		  map.put("v1", "man");
		  map.put("val2", "C++");
		  
		  Map<String,String> map2=new HashMap<String,String>();  
		  map2.put("v1", "");
		  map2.put("val2", "man");
		  
		  
		  Map actual=mp.mapTest(map);
		  assertEquals(map2, actual);
	}


}
