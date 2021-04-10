import java.util.ArrayList;
import java.util.List;

//We use List because Collection interface does not support 
//index numbers


public class ListInterfaceDemo {
	
	public static void main(String[] args) {
		
		List<Object> values = new ArrayList<>();
		values.add("Hello");
		values.add("Google");
		//add values based on index
		values.add(2, "Please");
		values.add(3,'Z');
		values.add(0,3.4f);
		//looping and printing values based on index.
		for (int i = 0; i< values.size();i++) {
			System.out.println(values.get(i));
		}
		
		values.remove(3);
		for(Object o: values) {
			System.out.println(o);
		}
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(0);
		numbers.add(3);
		numbers.add(4);
		
		for(int k: numbers) {
			System.out.println(k);
		}
		
	}
	

}
