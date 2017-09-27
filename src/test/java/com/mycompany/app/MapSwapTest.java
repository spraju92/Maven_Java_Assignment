package com.mycompany.app;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MapSwapTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MapSwap mp=new MapSwap();
		Map<String,String> map=new HashMap<String,String>();  
			map.put("v1", "man");
			 map.put("val2", "c++1");
			 map.put("val3","raju");
			  map.put("val4", "rummy5");
			  map.put("val5", "Naveen");
		  
		  Map<String,String> map1=new HashMap<String,String>();  
		map1.put("v1", "c++1");
		map1.put("val2", "man");
		 map1.put("val3","raju");
		  map1.put("val4", "Naveen");
		  map1.put("val5", "rummy5");
		  
		  Map actual=mp.mapTest1(map);
		  System.out.println("act"+actual);
		  System.out.println("exp"+map1);
		  
		  
		  
		 assertEquals(map1, actual);
	}

}
