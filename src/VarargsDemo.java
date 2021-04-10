class Cal{
	
	public int Add(int i, int j)
	{
		return i+j;
	}
	
	// here we expect multiple numbers as input 
	// to the method and they are form of an array
	public int Mul(int ... n) {		//variable length arguments
		if(n == null || n.length == 0)
		{
			return 0;
		}
		int	result=1;
		// looping through the array
		for(int i :n) {
			result *= i;
		}
		
		return result;
	}
}

public class VarargsDemo {
	
	public static void main(String[] args) {
		
		Cal obj = new Cal();
		// here we are adding two numbers 
		//which are passed to the method
		//and printing them.
		System.out.println(obj.Add(2, 5));
		
		// now consider that we need to multiply n numbers
		//where we dont know the value of n
		//beforehand.
		// This is when varargs is used as it passes
		// inputs to method as an array
		int answer = obj.Mul(1,2,3,4,5,6,7,8,9);
		System.out.println(answer);
		
		int ans = obj.Mul();
		System.out.println(ans);
		
		
	}

}
