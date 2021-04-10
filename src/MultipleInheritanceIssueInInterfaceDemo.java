//// Consider the following example
//
//interface Demo1{
//	default void show() {
//		System.out.println("from Demo1 show");
//	}
//}
//
//interface Demo2{
//	default void show() {
//		System.out.println("from Demo2 show");
//	}
//}
//
//class DemoImplement implements Demo1,Demo2{
//	
//}
////Error: duplicate methods show are inherited from types
////demo1 and demo2
//// this means the show methods in each interface are causing 
////ambiguity

// TO RESOLVE ABOVE we have two options
//1. we can declare define a show method in class DemoImplement as it 
// will override the show mthods interfaces with custom definition.
//2. we can define show method in DemoImplement and override 
//specific interface method with syntax
//<Inteface>.super.<methodname>

interface Demo1{
	default void show() {
		System.out.println("Demo1 Show");
	}
}
interface Demo2{
	default void show() {
		System.out.println("Demo2 Show");
	}
}

class DemoImplement implements Demo1,Demo2{
	public void show() {
		System.out.println("DempImplement show");
	}
	
// 		OR
//	public void show() {
//		//Demo1.super.show();
//		//Demo2.super.show();
//	}
}

public class MultipleInheritanceIssueInInterfaceDemo {
	
	public static void main(String[] args) {
		
		Demo1 d = new DemoImplement();
		d.show();
	}

}
