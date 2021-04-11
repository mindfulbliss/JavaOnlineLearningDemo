/*
 * Hashtable are synchronized thread safe and thus their performance is poor compared to
 * HashMap which is not thread safe 
 * Hashtable does not allow null in key or value
 * Hashtable insertion orser is not preserved.
 * Hashtable default capacity is 11 and load factor is 0.75
 * 
 */


package com.collectionsDemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		//Hashtable<Integer, String> ht = new HashTable<>(initialCapacity, fillratio);
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(101, "A");
		ht.put(101, "B");// samekey specified overwrites the earlier value
		ht.put(103, "C");
		ht.put(104, "D");
		ht.put(105, "A");
		//ht.put(null, null); null pointer exception
		System.out.println(ht);
		
		
		//get(key) to fectch value as per key
		
		System.out.println(ht.get(105));
		
		//remove(key) to remove key value from the table
		ht.remove(105);
		System.out.println(ht);
		
		// containsKey(Key) to check if key is in table
		
		System.out.println(ht.containsKey(101));
		
		//cotnainsValue(value) to check if value is in table
		System.out.println(ht.containsValue("G"));
		System.out.println(ht.containsValue("D"));
		
		//isEmpty() to check if table is empty
		
		System.out.println(ht.isEmpty());
		
		//keySet() to get all the keys from table as a Set 
		
		System.out.println(ht.keySet());
		
		//values() to get all the values from table as a Collection
		System.out.println(ht.values());
		
		
		// looping through the table
		
		for(int k : ht.keySet()) {
			System.out.println(k+" | "+ht.get(k));
		}
		
		//Entry specific methods
		
		for(Map.Entry entry:ht.entrySet()) {
			System.out.println(entry.getKey()+" " +entry.getValue());
		}
		
		//iterator
		
		Set<Entry<Integer,String>> s = ht.entrySet();
		Iterator<Entry<Integer,String>> it = s.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> en = it.next();
			System.out.println(en.getKey()+" # "+en.getValue());
		}
	}

}
