
package com.list.example;
import java.io.*; 
import java.util.*; 

public class adding { 
	public static void main(String args[]) 
	{ 

		// creating an empty LinkedList 
		Collection<String> list = new LinkedList<String>(); 

		// use add() method to add elements in the list 
		list.add("lets"); 
		list.add("talk"); 
		list.add("about"); 

		// Output the present list 
		System.out.println("The list is: " + list); 

		// Adding new elements to the end 
		list.add("adding"); 
		list.add("list"); 

		// printing the new list 
		System.out.println("The new List is: " + list); 
	} 
} 

