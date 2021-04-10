import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeSet;

// The main diff between list and set is that 
// Set contains only unique values
// Also the way the elements of set are printed in for loop is
//dependent on hashing and not set index



public class SetInterfaceDemo {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		
		li.add(124);
		li.add(54);
		li.add(750);
		li.add(54);
		for(int k:li) {
			System.out.println(k);
		}
		
		System.out.println("--------");
		Set<Integer> s = new HashSet<>();
		System.out.println(s.add(1240)); // true
		System.out.println(s.add(54)); // true
		System.out.println(s.add(750)); // true
		System.out.println(s.add(54)); // false
		
		
		for(int k:s) {
			System.out.println(k); // note that order is not maintained
			// while printing
			// Sequence is not maintained.
		}
		
		// TO STORE THE DATA IN ASCENDING ORDER.
		// INSTEAD OF HASHSET USE TREESET.
		System.out.println("--------");
		
		Set<Integer> s1 = new TreeSet<>();
		System.out.println(s1.add(1024));// true
		System.out.println(s1.add(24));// true
		System.out.println(s1.add(10));// true
		System.out.println(s1.add(4));// true
		System.out.println(s1.add(24));// false
		
		for(int k:s1) {
			System.out.println(k);
		}
		
		List<Integer> list1 = new ArrayList<>(s1); 
		Collections.reverse(list1);
		System.out.println(list1);
		
		Set<Integer> s11 = new LinkedHashSet<>(list1);
		
		for(int k:s11) {
			System.out.println(k);
		}
		
		
		
		
	}

}
