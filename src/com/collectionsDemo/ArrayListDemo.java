/*
 * Collection (I) is inherited by List(I) and ArrayList (C) implements the
 * List(I). ArrayList is a class present under 	java.util
 * Use arraylist when we have more data retrieving operations, as it has index
 * USe Linkedlist if you have more insertion and deletion operations.
 * Accepts null

*/
package com.collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		//Declare arraylist
		//ArrayList<Integer> il = new ArrayList<>();
		//ArrayList<Object> al = new ArrayList<>();
		List<Object> li = new ArrayList<>();
		
		//add(Object) -> adds to the end of the list
		li.add("Storm");
		li.add('a');
		li.add(52.36);
		li.add(528);
		li.add(true);
		li.add(null);
		
		
		System.out.println(li);
		
		//add(index, Object) -> insert the Object at specified index.
		li.add(2,"Alpha");
		
		System.out.println(li);
		for(Object e:li) {
			System.out.println(e);
		}
		//remove(Object) -> removes specified object from the list.
		li.remove(true);
		System.out.println(li);
		li.add(false);
		System.out.println(li);
		//remove(index) -> removes object from the specified index.
		li.remove(3);
		System.out.println(li);
		
		//retrieve specific element from the list
		//li.get(index) ,-> gets object from specified index.
		
		System.out.println(li.get(3));
		
		//change/update element at particular index
		//li.set(index, object)
		li.set(0, "Happy");
		System.out.println(li);
		
		// search element 
		//li.contains(object) returns true or false
		
		System.out.println(li.contains("Alpha"));
		System.out.println(li.contains("Beta"));
		
		//isEmpty -> to check if array list is empty
		System.out.println(li.isEmpty());
		
		
		//read data from arraylist
		//1 for loop
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		System.out.println("***************");
		
		//2 foreach loop
		for(Object e:li) {
			System.out.println(e);
		}
		
		System.out.println("***************");
		
		//3 iterator
		
		Iterator<Object> it = li.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("***************");
		List<Object> li1 = new ArrayList<>();
		li1.add("Hello");
		li1.add("it's");
		li1.add("me");
		
		System.out.println(li1);
		System.out.println("***************");
		
		List<Object> li2 = new ArrayList<>();
		// addAll(Collection) -> add all elements to the list
		li.addAll(li1);
		System.out.println(li);
		li2.addAll(li1);
		System.out.println(li2);
		System.out.println("***************");
		//removeAll(collection) -> removes the elements that match the collection passed
		
		li.removeAll(li1);
		System.out.println(li);
		li2.removeAll(li1);
		System.out.println(li2);
		
		// SORTING ARRAY LIST
		
		List<Integer> marks = new ArrayList<>();
		marks.add(12);
		marks.add(72);
		marks.add(05);
		marks.add(41);
		
		System.out.println("Marks before sort"+marks);
		Collections.sort(marks);
		System.out.println("Marks after sort"+marks);
		Collections.sort(marks,Collections.reverseOrder());
		System.out.println("Marks after reverse order"+marks);
		Collections.shuffle(marks);
		System.out.println("Marks after shuffle"+marks);
		
		
		
		String[] animals = {"Lion","Hippo","Zebra","Giraffe","Penguins"};
		System.out.println("***************");
		
		for(String name:animals) {
			System.out.println(name);
		}
		
		// converting a String array to a array list
		List<String> animal_names = new ArrayList<>(Arrays.asList(animals));
		
		
		System.out.println("***************");
		Iterator it1 = animal_names.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
			
		}
		
		
	}

}
