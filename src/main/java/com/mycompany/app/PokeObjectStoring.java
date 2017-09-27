package com.mycompany.app;

import java.util.Arrays;
import java.util.Comparator;

/*Category: Comparator

Consider the following Pokemon class:

class Pokemon{
    String name;
    int power;
    
    Pokemon(String name, int power){
        this.name = name;
        this.power = power;
    }
}

Create a PokemonComparator class with a comparePokemon() method that accepts an array of Pokemon objects.  The comparator should sorts the pokemons in order of decreasing score. If two pokemons have the same score, sort them alphabetically by name. 

You need to use the Comparator class in your implementation.*/

//Bean class to define properties
class Pokemon{
    String name;
    int power;
    
    public String getName() {
    	return name;
    }
    public int getPower() {
    	return power;
    }
    Pokemon(String name, int power){
        this.name = name;
        this.power = power;
    }

	public String toString() {
        return "[power=" + this.power + ", name=" + this.name + "]";
    }

	
	
	
}
//Using Comparator interface
class ComparePokemon implements Comparator<Pokemon> {

	
	public int compare(Pokemon o1, Pokemon o2) {
		int count=o1.getPower()-o1.getPower();
		if(count==0)count=o1.getName().compareTo(o2.getName());
	
		return count;	
	}

}
public class PokeObjectStoring{
	public static Pokemon[] comparePokemon(Pokemon[] pokArr)
	{
		Arrays.sort(pokArr,new ComparePokemon());
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(pokArr));
		
		return pokArr;
	
	}	
	public static void main(String args[])
	{
		
		Pokemon[] pokArr=new Pokemon[3];
		pokArr[0]=new Pokemon("Raju",23);
		pokArr[1]=new Pokemon("Nag",28);
		pokArr[2]=new Pokemon("Amar",28);
		
		PokeObjectStoring.comparePokemon(pokArr);
		
	}
}

