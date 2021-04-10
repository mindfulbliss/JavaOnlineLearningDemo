// Types of Interface
// 1. Normal interface - having more than one methods
// 2. Single Abstract method - SAM / from v1.8 SAM is called 
//functional interface - lambda expression
// 3. Marker interface - interface with no methods
//
//Syntax for defining functional interface
//@FunctionalInterface
//interface ABCD{
//	void act();

interface ABB{
	void show();
}
	
public class TypeOfInterfaceDemo {
	
	public static void main(String[] args) {
		ABB obj = () -> System.out.println(" Hello");
		obj.show();
	}

}
