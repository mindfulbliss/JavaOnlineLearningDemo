import java.util.Scanner;
public class UserInputUsingScannerDemo {
	
	public static void main(String[] args) {
//advantage of using scanner over BufferedReader is 
		// automatic exception handling
		//and inbuilt type casting method. 
		
		int number;
		System.out.println("Enter the number : ");
		
		Scanner sc = new Scanner(System.in);		
		number = sc.nextInt();					
		System.out.println(number);
		
		
		
		
		
	}

}
