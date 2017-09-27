package com.mycompany.app;

import java.util.Scanner;

/*Category: Conditional Statements

Create a program that accepts a single character letter and prints whether it is a consonant or vowel.
Condition: 
Print an error message for an if the input is not a letter
If the input having more than one letter, print the required output (Vowel or Consonant) for each letter

If input is:
‘p’
Expected Output is:
Consonant

If input is:
 ‘ap’
Expected Output is:
Vowel Consonant
*/
public class CharConsVowel {
	public static void main(String args[]) {
		//Reading input from user through scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		String str=sc.nextLine().toLowerCase();
		boolean b=Character.isLetter(str.charAt(0));
		if(b==true) {
			String[] strArray = str.split("");
			
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					strArray[i]="Vowel";
				}
				else {
					strArray[i]="Consonant";
				}
				System.out.print(strArray[i]+" ");
			}
			
		}
		else {
			System.out.println("Input is not a letter");
		}
		
		
		
	}

}
