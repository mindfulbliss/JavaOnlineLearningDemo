public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		try {
			String[] a = null;
			a = new String[5];
			a[2]="Hello";
			int i=7;
			int k=2;
			int j =i/k;
			System.out.println("j = "+j); 
			 
					
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array out");
		}
		catch(ArithmeticException e) {
			System.out.println(" /by zero");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block");
		}
				
		
	}

}
