// Abstract class -> define methods or define/declare methods
// Interface class -> define methods (v1.7)
//use default keyword -> define mthd or define/declare mthd(v1.8) 

//Ideally methods are only declared in interface as all 
//methods in interface are abstract in nature.
//however from 1.8 onwards with a keyword <default>, we can 
//now declare and define any no of methods in a interface.
//Also we can override method from the interface implementor class



interface Demo{
	
	void walk(); //abstract method , which should be implemented
	
	default void eat() { //default method
		System.out.println("eat your food.");
	}
	
	default void run() { //default method
		System.out.println("run fast");
	}
}

class DemoImplementor implements Demo{
	public void walk() { // abstract methd definition
		System.out.println("walk gently.");
		
	}
	
	public void eat() { // override the default method of interface
		System.out.println("Eat your food slowly");
	}
	
	
}




public class DefaultMethodInInterfaceDemo {
	
	public static void main(String[] args) {
		Demo d = new DemoImplementor();
		d.walk();
		d.eat();
		d.run();
	}

}
