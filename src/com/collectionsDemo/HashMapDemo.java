
/*
 * Map(I) is implemented by HashMap (C)
 * HashMap is used when many search operations are involved
 * HashTable is the underlying Data structure for HashMap
 * Data is stored in each row as entry/pair having a Key and a value.
 * Insertion Order is not preserved
 * Duplicate keys are not allowed
 * Duplicate values are allowed
 * If the same key is used again, the earlier value of key is overwritten 
 * null as key is allowed once.
 * null as value is allowed multiple times.
 * 
 */
package com.collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		
		//HashMap<Integer,String>() m = new HashMap<>();
		HashMap<Object, Object> m = new HashMap<>();
		//put(Key,Value) -> add the kv pair to the hashmap
		
		m.put(12, "Hello");
		m.put("Hello", 12);
		m.put('C', 52);
		
		System.out.println(m);// note order not preserved
		
		HashMap<Integer,String> m1 = new HashMap<>();
		
		//put(KeyObject, ValueObject) -> add k,v pair to the hashmap 
		
		m1.put(101,"A");
		m1.put(102,"B");
		m1.put(103,"C");
		m1.put(104,"D");
		m1.put(102,"G");
		System.out.println(m1);// Duplicate key not allowed, here 102 value is updated as "G"
		m1.put(105, "G");
		System.out.println(m1);// Duplicate value allowed
		
		//Get value by specifying key
		
		System.out.println("Value of key 104 is = "+m1.get(104));
		
		//remove(key) -> to remove a key value pair from the map
		
		m1.remove(102);
		System.out.println(m1);
		
		//containskey(key) to check a specified key is in the hashmap
		System.out.println(m1.containsKey(101));
		System.out.println(m1.containsKey(102));
		
		//containsValue(value) to check a specified value is in the map
		System.out.println(m1.containsValue("A"));
		System.out.println(m1.containsValue("Z"));
		
		
		//isEmpty() to check if hashmap is empty?
		
		System.out.println(m1.isEmpty());
		
		//size() get size of the hashmap
		
		System.out.println(m1.size());
		
		//keySet() -> to get only all the keys from the hashmap in a set form
		System.out.println(m1.keySet());
		
		// to print keys one after another.
		
		for(Object i:m1.keySet()) {
			System.out.println(i);
		}
		
		//to get only all the values from the hashmap in a Collection form
		System.out.println(m1.values());
		
		//to print values one after another
		for(Object i:m1.values()) {
			System.out.println(i);
		}
		
		for(Object i:m1.keySet()) {
			System.out.println(i+"  "+m1.get(i));
		}
		
		//entrySet() -> to get the key,value pair as a entry frm the map in set form
		System.out.println(m1.entrySet());
		
		// to print key values as entry one after another.
		for(Object i:m1.entrySet()) {
			System.out.println(i);
		}
		
		//Entry Interface method
		
		for(Map.Entry entry:m1.entrySet()) {
			System.out.println(entry.getKey()+" | "+entry.getValue());
		}
		
		
		// Using Iterator method
		
		Set<Entry<Integer,String>> s = m1.entrySet();
		Iterator<Entry<Integer, String>> it = s.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<Integer, String> en = it.next();
			System.out.println(en.getKey()+"^"+en.getValue());
		
		}
		
	}

}
