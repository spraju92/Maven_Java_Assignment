package com.mycompany.app;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Category: Collections

Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.  Modify and return the given map as follows:

If the key "val1" has a value, set the key "val2" to have that value, and
Set the key "val1" to have the value "" (empty string). 


For example 1: The map {"val1": "java", "val2": "c++"} should return {"val1": "", "val2": "java"}
For example 2: The map {"val1": "mars", "val2": "saturn"} should return {"val1": "", "val2": "mars"}*/
public class MapSolution {
		//MapTest method will receive map from main method
	  public Map<String, String> mapTest(Map<String, String> map)   
	  {
		  
		 //Getting keys from map
		  Set<String> keys = map.keySet();
		  String[] keyarr=(String[]) keys.toArray(new String[0]);
		  //Getting values from Map
		  Collection<String> st1= map.values();
		  String[] valarr=(String[]) st1.toArray(new String[0]);
		  if(keyarr[0]!=null) {
			  map.replace(keyarr[1], "");
			  map.replace(keyarr[0], valarr[1]);
		  }
		  System.out.println(map);
		  
		return map;
	   
	  }
	  public static void main(String[] args) {
		  MapSolution mp=new MapSolution();
		  Map<String,String> map=new HashMap<String,String>();  
		  map.put("v1", "man");
		  map.put("val2", "C++");
		  mp.mapTest(map);
		  
	      
	  }
	
	
	}

