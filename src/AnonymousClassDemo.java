//// Consider the below example
////
////
//class A1{
//	public void show() {
//		System.out.println("in A show");
//	}
//}
//
//public class AnonymousClassDemo {
//	public static void main(String[] args)
//	{
//		A1 obj = new A1();
//		obj.show();		
//	}	
//
//}
//
////In above example we can see that Object obj.show()
////prints the message.
//// now we want print different message ,eitehr we can change the
////code in ClassA1.show() method or extend the A1 class and override//
////the method
//
//class A2 extends A1
//{
//	public void show() {
//		System.out.println("in Class A2 show");
//	}
//	
//}

//The whole purpose of this class A2 is to merely print different msg
//This can be done using Anonymous class.

// If your intention is to use the class for one time use
// anonmyous class is the answer

class A1{
	public void show() {
		System.out.println("in class A show method");
	}
}

class AnonymousClassDemo{
	
	public static void main(String[] args) {
		
// To create a anonymous class create a object here new A1() 
		// and add the class body next to it. 
		A1 obj = new A1()
		{// ANONYMOUS CLASS
			public void show() {
				System.out.println("in ANONYMOUS class show method");
			}
			
		};
		
		obj.show();
		
	}
	
	
}
