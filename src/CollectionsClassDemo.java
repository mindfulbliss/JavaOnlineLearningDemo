import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Collections are used to sort reverse the list


public class CollectionsClassDemo {
	
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		
		num.add(526);
		num.add(735);
		num.add(488);
		
		for(int k: num) {
			System.out.println(k);
		}
		
		//sort the list
		Collections.sort(num);
		System.out.println(num);
		//reverse the list
		Collections.reverse(num);
		System.out.println(num);
		//shuffle the list
		Collections.shuffle(num);
		System.out.println(num);
		
		
		// NOW I WANT TO SORT BASED ON THE LAST DIGIT RATHER THAN
		//FIRST DIGIT AS ABOVE
		
		// ----- COMPARATOR OBJECT
		
		// WE WILL NOW USE CUSTOM COMPARATOR IN SORT
		//Collections.sort has a method that takes list and comparator.
		//Comparator itself is a functional interface so we can
		//use the lambda expression
		Collections.sort(num, (i,j) -> i%10>j%10?1:-1);
		System.out.println(num);
		
		//OR
		// INTERFACE WITH ANONMYOUS METHOD
		Comparator<Integer> c = new Comparator<Integer>() {

			//ANONYMOUS METHOD
			public int compare(Integer i, Integer j) {
			
				return i%10 > j%10?1:-1;
			}
			
		};
		
		List<Integer> num2 = new ArrayList<>();
		num2.add(571);
		num2.add(626);
		num2.add(393);
		Collections.sort(num2,c);
		System.out.println(num2); 
		
		
		
		
		
	}
	
	
	

}
