package com.mycompany.app;
import java.util.*;

/*1. Write a method that given an integer num, it performs the following conditional actions:
Print Tom if num is odd
Print Jerry, if  num is even and > 2 but < 9
Print Tom, if  num >=  6 but <= 20,
print Jerry, if num is even and  > 25 */
public class Assignment1 {
	public String condition(String str) {
		//converting string to integer
		int n=Integer.parseInt(str);
		 String ans="";
	         
	         //Complete the code
	      if((n%2!=0) ||(n>=6 && n<20))
	      {
	      	ans="Tom";
	      	if(n==6 || n==8)
	      	{
	      		ans="Tom and Jerry";
	      	}
	      }
	      else if(((n%2==0) && (n>2&&n<9))||(n>25))
	      {
	      	ans="Jerry";
	      }
	      System.out.println(ans);
			return ans;
	}
		//main method
        public static void main(String[] args) {
        	
        	String inp;
			do {
        		  Assignment1 ass=new Assignment1();
        		  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter a number");
                  String n=sc.nextLine();
                  ass.condition(n);
                  System.out.println("Do you want to repeat it??..Then type yes");
                  inp=sc.nextLine();
        		
        	}while(inp.equalsIgnoreCase("Yes")); 
            
        }
    }
