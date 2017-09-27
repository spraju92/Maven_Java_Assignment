package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Category: Collections

From a given set of list, get the string values to be displayed in the order of the high number of vowels to the least number of vowels from the given string values. If the number of vowels are same then it should check for the length and display the minimum one first.
Example: if the values are length, adata, lost then the output should be as adata, lost, llength.*/
class SortVowel{
	public List sorting(List<String> val){
		//Converting List to string array
		String[] listarr=val.toArray(new String[val.size()]);
		for(int i=0;i<listarr.length;i++) {
			for(int j=i+1;j<listarr.length;j++) {
				 int countI = getVowelCount(listarr[i]);
		         int countJ = getVowelCount(listarr[j]);
		         if(countI < countJ){
		                String tppp = listarr[i];
		                listarr[i] = listarr[j];
		                listarr[j] = tppp;
		            }
		         else if(countI==countJ) {
		        	 int s1=listarr[i].length();
		        	 int s2=listarr[j].length();
		        	 if(s1>s2) {
		        		 String tppp = listarr[i];
			                listarr[i] = listarr[j];
			                listarr[j] = tppp;
		        	 }
		         }
			}
		}
		//Converting String arrays to List
		List list = (List) Arrays.asList(listarr);
		System.out.println(Arrays.toString(listarr));
		return list;
		
	}

	private int getVowelCount(String input) {
		// TODO Auto-generated method stub
		int count = 0;
	    for (int j = 0; j < input.length(); j++) {
	        char c =input.toLowerCase().charAt(j);
	        if(c=='a')
	            count++;
	        else if(c=='e')
	            count++;
	        else if(c=='i')
	            count++;
	        else if(c=='o')
	            count++;
	        else if(c=='u')
	            count++;
	    }
	    return count;
	}
	
}
public class HighVowels {
	public static void main(String args[]) {
		List<String> val=new ArrayList<String>();
		val.add("Raju");
		val.add("Raaiu");
		val.add("Raj");
		val.add("au");
		SortVowel sv=new SortVowel();
		sv.sorting(val);
	}
}
