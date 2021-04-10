/*
 * HashSet is used where Duplicates are not allowed
 * and the insertion order is not preserved as it has no indexing
 * all elements are arranged in the random order.
 * It used HashCode to store the elements. Hetrogenous data and null suprted
 * default/ initialise size is 16 locations and had a load factor/fill ratio
 * default load factor is 0.75
 * when a arraylist is created by default 10 location are filled. When 11th
 * element is added, a new array of 11 locations is created and the 
 * earlier 10 elements and new one are copied to the 11 locations.
 * The old array list is available for garbage collection. 
 * Incase of hashset a new hashset is created as soon as the loadfactor is 
 * filled (i.e 75% are filled)
 */
package com.collectionsDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		
		//declaration
		//HashSet<String> hs = new HashSet<>();
		
		//HashSet<String> hs = new HashSet<>(100,(float)0.50); //default cap =100, load factor=0.50
		HashSet<Object> hs = new HashSet<>();
		
		hs.add("String");
		hs.add(24234325);
		hs.add('A');
		hs.add(true);
		hs.add(12.454);
		// duplicated not allowed.
		hs.add('A');
		hs.add("String");
		hs.add(24234325);
		
		System.out.println(hs);
		// order not preserved in output and duplicates not allowed
	
		//loop through the hashset
		
		for(Object e:hs) {
			System.out.println(e);
		}
		
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//remove(Object) to remove the specified object
		hs.remove("String");
		
		//contains(Object) to search a object.
		System.out.println(hs.contains(true));
		
		//addAll(Collection)
		
		HashSet<String> hss = new HashSet<>();
		hss.add("A");
		hss.add("B");
		hss.add("C");
		hss.add("D");
		hss.add("E");
		
		System.out.println(hss);
		
		HashSet<String> hss1 = new HashSet<>();
		hss1.addAll(hss);
		hss1.add("F");
		System.out.println(hss1);
		
		//removeAll(Collection)
		hss1.removeAll(hss);
		System.out.println(hss1);
		
		
		// Union ,Intersection, Difference in HashSet
		//UnionAll contains duplicated and HashSet does not allow it.
		//So in hashset only Union is there and not unionall.
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		System.out.println("Set1 : "+set1);
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(7);
		set2.add(6);
		set2.add(5);
		set2.add(4);
		
		System.out.println("Set2 : "+set2);
		
		//UNION is unqiue elements of set 1 and set2
		set1.addAll(set2);
		System.out.println("Union of Set1 and Set2 :"+ set1);
		
		
		//Intersection is common elements of set 1 and set2
		//retainAll(Collection) -> retains elemtns of passed collection 
		HashSet<Integer> set3 = new HashSet<>();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		
		System.out.println("Set3 : "+set3);
		
		HashSet<Integer> set4 = new HashSet<>();
		set4.add(7);
		set4.add(6);
		set4.add(5);
		set4.add(4);
		
		System.out.println("Set4 : "+set4);
		
		set3.retainAll(set4);
		System.out.println("Intersection of Set3 and Set4 :"+ set3);
		
		//Difference is the diff between the two sets
		HashSet<Integer> set5 = new HashSet<>();
		set5.add(1);
		set5.add(2);
		set5.add(3);
		set5.add(4);
		
		System.out.println("Set5 : "+set5);
		
		HashSet<Integer> set6 = new HashSet<>();		
		set6.add(4);
		set6.add(3);
		
		System.out.println("Set6 : "+set6);
		
		set5.removeAll(set6);
		System.out.println("Intersection of Set5 and Set6 :"+ set5);
		
		// Subset to check if a given set is subset of other set
		HashSet<Integer> set7 = new HashSet<>();
		set7.add(1);
		set7.add(2);
		set7.add(3);
		set7.add(4);
		
		System.out.println("Set7 : "+set7);
		
		HashSet<Integer> set8 = new HashSet<>();		
		set8.add(4);
		set8.add(3);
		
		System.out.println("Set8 : "+set8);
		
		System.out.println(set7.containsAll(set8));// true if its a subset
		
		
	
	}
	

}
