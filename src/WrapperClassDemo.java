
// primitive data type works faster than wrapper class hence they are deprecated.

public class WrapperClassDemo {
	
	public static void main(String[] args) {
		
		
		int i = 5; //primitive data type
		Integer ii = new Integer(5);// Wrapper class -- Boxing
		
		int j = ii.intValue(); // unboxing
		
		Integer value  = i; //autoboxing
		
		int k = value; //auto-unboxing
		
		
		String str = "123";
		int a = Integer.parseInt(str);		
	}

}
