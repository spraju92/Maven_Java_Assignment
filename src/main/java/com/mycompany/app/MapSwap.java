package com.mycompany.app;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Category: Collections

Write a method that accepts a Map object having key-value pairs of any size. The first value and the second value gets swapped. Similarly the next two should get interchange.  For example

If there are 5 keys and values like {"val1": "java", "val2": "c++",”val3”:”c#”,”val4”:”python”,”val5”:”php”}
 Then the output should be {"val1": "c++", "val2": "java",”val3”:”c#”,”val4”:”php”,”val5”:”python”}

Conditions
The size need not to be 5 it may be of any size.
It should swap the value of adjacent value.
If the size is odd then the value in the middle should not be swapped.*/

public class MapSwap {
	
	//Maptest1 is a method here to receive map objects
	  public Map<String, String> mapTest1(Map<String, String> map)   
	  {
		  
		 //Getting keys from map
		  Set<String> keys = map.keySet();
		  String[] keyarr=(String[]) keys.toArray(new String[0]);
		  Collection<String> st1= map.values();
		  String[] valarr=(String[]) st1.toArray(new String[0]);
		  boolean flag=false;
		  int count=0;
		  if(keyarr.length%2==1) {
			  flag=true;
			  count=keyarr.length/2+1;
			  //System.out.println(count);
		  }
		  System.out.println(keyarr.length);
		  for(int i=0;i<keyarr.length-1;) {
			  System.out.println(i);
			 if((flag && i==count-1)) {
				  
				  i=i+1;
			 }
			 else
			 {
				 map.replace(keyarr[i], valarr[i+1]);
				  map.replace(keyarr[i+1], valarr[i]);
				  i=i+2;
				 
			 }
				 
				  
			
		  }
		  System.out.println(map);
		  
		return map;
	   
	  }
	  public static void main(String[] args) {
		  MapSwap mp=new MapSwap();
		  Map<String,String> map=new HashMap<String,String>();  
		  map.put("v1", "man");
		  map.put("val2", "C++1");
		  map.put("val3","raju");
		  map.put("val4", "rummy5");
		  map.put("val5", "Naveen");
		  mp.mapTest1(map);
		  
	      
	  }
	
	
	}

