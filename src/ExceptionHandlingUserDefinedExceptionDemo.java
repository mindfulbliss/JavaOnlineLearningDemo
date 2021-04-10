

public class ExceptionHandlingUserDefinedExceptionDemo {
	
	public static void main(String[] args)
	{
		int i,j,k;
		
		i=9;
		j=8;
		try {
			k=i/j;
			if(k<2) {
				throw new GauravException("Custom error message");
			}			
		}
		catch(GauravException e) {
			System.out.println("Error : "+e.getMessage());
		}
		

		
		
		
		
	}
	

}
