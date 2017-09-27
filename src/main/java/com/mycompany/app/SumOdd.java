package com.mycompany.app;
import java.util.Arrays;

import java.util.Collection;
/*Category: Generic

Write a generic method to get the sum value of odd elements in a collection.*/
class SumOddVal {
	 public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
		 	int count=0;
	        for (T elem : c)
	       count=count+p.test(elem);
	        
			return count;
	     
	}
}
//Here UnaryPredicate is a interface
interface UnaryPredicate<T> {
    public int test(T obj);
}
//Here implementing interface
class OddPredicate implements UnaryPredicate<Integer> {
	
    public int test(Integer i) { 
    	
    	if(i % 2 != 0)
    	{
    		return i;
    	}
		return 0;
    	
    	}
}
public class SumOdd {

	public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3,5, 4,7);
        int count=SumOddVal.countIf(ci, new OddPredicate());
        System.out.println("Sum of odd integers = " + count );
    }
}
