
public class IterationDemo {
	
	public static void main(String[] args) {
	
		//while(condition){
		// do something
		// make changes to condition
		//}
		byte i=0;
		while(i<5) {			
			System.out.println("Value of i is "+i);
			i++;		
		}
		byte counter = 0;
		while (true) {
			System.out.println("What you think you become!"+ counter);
			counter+=1;
			if (counter==12) {
				break;
			}
		}
		
		//do while executes at least once before checking the condition.
		// do {
		//some task
		//} while(condition)
		
		byte ab = 1;
		
		do {
			System.out.println("value of ab"+ab);
		}while(ab<1);
		
		// for loop
		// for(variable,condition,variable increment/decrement){
		// do work
		//}
		
		for (byte x=1; x<10; x++) {
			System.out.println("value of x="+x);
		}
		
		for (byte u=10 ; u>0; u--) {
			System.out.println("value of u="+u);
		}

	}	

}
