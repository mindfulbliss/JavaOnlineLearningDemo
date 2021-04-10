/*
 * Collection (I) is inherited by List(I) and LinkedList (C) implements the
 * List(I). LinkedList is a class present under 	java.util
 * Use arraylist when we have more data retrieving operations, as it has index
 * USe Linkedlist if you have more insertion and deletion operations.
 * LinkedList accepts null.

*/


package com.collectionsDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		//declaration
		//LinkedList<Object> ll = new LinkedList<>();
		//LinkedList<Integer> ll = new LinkedList<>();
		
		List<Object> ll = new LinkedList<>();
		
		// add(object) => add element to the ll
		ll.add("Scosceress");
		ll.add("HeMan");
		ll.add("Cranger");
		ll.add("Skeletor");
		ll.add("Evelyn");
		ll.add(null);
		
		System.out.println(ll);
		System.out.println("ll size = "+ll.size());
		
		// remove(object)
		ll.remove("Cranger");
		System.out.println("ll After removing object ll = "+ll);
		//remove(index)
		ll.remove(ll.size() - 1); // removing last element of the ll
		System.out.println("ll After removing element based on index ll = "+ll);
		
		
		// ll.add(index, element) => insert add  elemtn in the middle of list
		ll.add(2,"Grayskull");
		
		System.out.println(ll);
		
		//retriving object/value
		
		System.out.println(ll.get(0)); //get value at index 0
		
		//set/ udpate a value
		ll.set(4, "BeastMan");
		System.out.println("ll after updating value at index 4 = "+ll);
		
		//contains(object) -> search returns true or false
		
		System.out.println(ll.contains("HeMan"));
		System.out.println(ll.contains("Cranger"));
		
		// is.Empty()
		
		System.out.println("Is ll empty ? "+ll.isEmpty());
		
		//retrieving elements from the list
		
		System.out.println(ll.get(0)); //get object at zero index
		
		System.out.println("*******");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("*******");
		for(Object e: ll) {
			System.out.println(e);
		}
		
		System.out.println("*******");
		
		Iterator<Object> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// addAll(Collection)
		
		LinkedList<Integer> marks = new LinkedList<>();
		
		marks.add(58);
		marks.add(5);
		marks.add(98);
		marks.add(7);
		
		System.out.println("Marks"+marks);
		
		LinkedList<Integer> marks2 = new LinkedList<>();
		marks2.addAll(marks);
		
		System.out.println("marks2"+marks2);
		
		//removeAll(collection)
		
		marks2.removeAll(marks);
		System.out.println("Marks2 after remove all "+marks2);
		
		//sort the linkedlist
		System.out.println("Marks before sort"+marks);
		Collections.sort(marks,Collections.reverseOrder());
		System.out.println("Marks after reverse"+marks);
		Collections.sort(marks);
		System.out.println("Marks after sort"+marks);
		//reverse
		Collections.sort(marks,Collections.reverseOrder());
		System.out.println("Marks after reverse"+marks);
		//shuffle
		Collections.shuffle(marks);
		System.out.println("Marks after shuffle"+marks);
		
		//Methods in Linked List for Stack and Queue Operation
		//Stack principle for data retrieval = LIFO or FILO
		//Queue principle for data retrieval = LILO or FIFO
		
		LinkedList<String> animals = new LinkedList<>();
		
		animals.add("Ox");
		animals.add("Cat");
		animals.add("Armadilo");
		animals.add("Badger");
		animals.add("Donkey");
		System.out.println("Animals = "+animals);
		
		//Add first and Add Last
		
		animals.addFirst("Tiger");
		animals.addLast("Horse");
		
		System.out.println("Animals = "+animals);
		
	
		
		//get first and get last
		System.out.println("Get first = "+animals.getFirst());
		System.out.println("Get last = "+animals.getFirst());
		
		//remove first remove last
		animals.add("Armadilo");		
		animals.removeFirst();
		System.out.println(animals);
		animals.removeFirstOccurrence("Armadilo");
		System.out.println(animals);
		animals.removeLast();
		System.out.println(animals);
		animals.add("Cat");
		System.out.println(animals);
		animals.removeLastOccurrence("Cat");
		System.out.println(animals);
		System.out.println();
		
	
		
	}

}
