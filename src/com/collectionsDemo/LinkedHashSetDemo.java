/*
 * LinkedHashSet does not allow duplicates but it preserves the 
 * insertion order.
 * 
 * LinkedHashSet underlying data structure is HashTable+LinkedList
 */


package com.collectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		//Declaration
		//LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		
		System.out.println("HashSet : "+hs);
		LinkedHashSet<Integer> lset = new LinkedHashSet<>();
		lset.add(10);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		lset.add(50);
		
		System.out.println("LinkedHashSet : "+lset);
		
		
	}

}
