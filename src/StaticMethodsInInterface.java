// from v1.8 we can now have a static method in interface
// in the main method we simply need to call it with interface name
// <InterfaceName>.<methodname>

//Also we can declare and define variables in interface but they are
// final type i.e their values cannot be changes (CONSTANTS)

interface DemoA{
	
	int number = 200;
	
	static void move(){
		System.out.println("Static Method demo");
	}
	
}

public class StaticMethodsInInterface {
	
	public static void main(String[] args) {
		//Syntax : interfacename.methodname
		DemoA.move();
		System.out.println(DemoA.number);
		//DemoA.number = 201; //error: the final field number cannot be assigned.
	}
	
	

}
