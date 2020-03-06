package com.list.example;

import java.util.*; 

public class remove
{ 
	public static void main(String[] args) 
	{ 
		// Demonstrating remove on ArrayList 
		List<String> myAlist = new ArrayList<String>(); 
		myAlist.add("flash"); 
		myAlist.add("Practice"); 
		myAlist.add("Quiz"); 
		System.out.println("Original ArrayList : " + myAlist); 
		myAlist.remove("Quiz"); 
		System.out.println("Modified ArrayList : " + myAlist); 

		// Demonstrating remove on LinkedList 
		List<String> myLlist = new ArrayList<String>(); 
		myLlist.add("flash"); 
		myLlist.add("Practice"); 
		myLlist.add("Quiz"); 
		System.out.println("Original LinkedList : " + myLlist); 
		myLlist.remove(2); 
		System.out.println("Modified LinkedList : " + myLlist); 
	} 
} 
