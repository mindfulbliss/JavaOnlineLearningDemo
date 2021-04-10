class A{
	public void show() {
		System.out.println("Class A show()");
	}
}

class B{
	public void show() {
		System.out.println("Class B show()");
	}
}

class C extends A //,B (Assume Class C extends both A and B)
{
	
}



public class WhyNoMuliplteInheritanceInJava {
	
	public static void main(String[] args) {
		C obj = new C();
		obj.show();
		
		// Now here if we had multiple inheritance allowed 
		// then Class C extends A,B would apply
		// and on the line 24 obj.show();
		//JVM would be confused to which show() method to call
		// as both Class A and B have show() method.
		//This is ambiguity problem and hence java does not support multiple
		//inheritance.
	}
	

}
