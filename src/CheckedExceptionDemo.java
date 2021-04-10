// In java there are two types of exceptions
// namely - checked and unchecked.
//All exceptions under Runtime exceptions are unchecked 
//where as all IOException are checked i.e complier expects 
//and prompts you to put error handling mechanism in place.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {
	// error handling mechanism
	public static void main(String[] args) throws Exception
	{
		
		int n = 0;
		System.out.println("Enter a number : ");
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		}
		catch(Exception e) {
			System.out.println("SOMETHING IS WRONG :== "+e);
		}
		finally {
			br.close();// Closing the resource
			System.out.println(n);
		}
	}
	
}
