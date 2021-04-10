import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandlingWithTryResourcesDemo {
	
	public static void main(String[] args) throws Exception
	{
		int num = 0;
		System.out.print("Enter a number : ");
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			num = Integer.parseInt(br.readLine());
		}
		System.out.println(num);
		
	}

}
