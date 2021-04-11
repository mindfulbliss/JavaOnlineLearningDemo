/*
 * Collection(I) is inherited by Queue(I) and Queue is inherited by 
 * Dequeue(I) BlockingQueue(I) and BlockingDequeue(I).
 * Also PriorityQueue(C) and LinkedList(C) implement Queue(I).
 * 
 * Elements are added to the queue at end (TAIL) and 
 * first element from the queue (HEAD) get processed. FIFO 
 * 
 * Both  in LinkedList and Priority Queue insertion order is preserved
 * and duplicates are allowed. But LinkedList supports Hetrogenous data
 * (Object) whereas priority queue supports homogenous data. 
 * 
 */

package com.collectionsDemo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<>();
		
		// add(Object) -> add a object at the tail of the queue and return True
		// if not able to queue throws exception.
		
		System.out.println(q.add(243543645));
		
		System.out.println(q);
		
		// offer(Object) -> add a object at the tail and return true
		//if successful else return false.
		
		System.out.println(q.offer(524));		
		
		System.out.println(q);
		
		//element() -> get/return the element at the head of the queue
		// if successful else throw NoSuchElementException
		
		System.out.println(q.element());
		
		//peek() -> get/return the element at the head of the queue
		//if successful else returns null
		
		System.out.println(q.peek()); 
		
		//remove() -> get and remove the element at the head of the queue
		//if successful  else throw NoSuchElementException
		System.out.println(q.remove());
		
		//poll() -> get and remove the element at the head of the queue
		//if successful else return null
		
		System.out.println(q.poll());
		
		q.add(15);
		q.add(52);
		
		System.out.println("**********");
		//Looping through the queue
		
		Iterator<Integer> it = q.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("**********");
		//foreach loop
		
		for(Object i:q) {
			System.out.println(i);
		}
		
		
		
	}

}
