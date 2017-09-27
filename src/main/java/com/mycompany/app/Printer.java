package com.mycompany.app;
/*Category: Generic
Create a Printer class with a printArray() single method (No method overloading) that accept a 
single argument that can be String or integer array, and prints the array elements.*/
public class Printer {
	//Using generics to take input from main method
	public static <E>  E[] printer(E[] elements) {
		for(E element: elements) {
			System.out.println(element);
		}
		return elements;
	}
	public static void main(String args[]) {
		Integer[] intEle= {20,13,15,90,45,89};
		System.out.println("Printing integer elements");
		Printer.printer(intEle);
		Character[] chaEle= {'d','r','p','x','s'};
		System.out.println("printing character elements");
		printer(chaEle);
	}

}
