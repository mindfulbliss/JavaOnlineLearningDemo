//We can use abstract in a class and method

// WHAT EXACTLY ABSTRACT CLASS IS


//Abstract class is one which is designed with the purpose of 
//someother 
//class extending it.
// example 
// 
//abstract class Human{
//	
//	public void walk() {
//		
//	}
//	public void eat() {
//		
//	}
//	
//}

//here human class has two methods defined but with empty implementation
// becasue we dont want anyone to create a instance of this human class
// rather extend the human class.
// 


//similarly we can define abstract methods and 
// - > abstract methods have only definition and no body
//- > once the method is abstract the class also has to be abstract
// -> however we can have the abstract and non abstract method with empty body 
//in abstract class
//


//example
//abstract class Human{
//	public abstract void walk();
//	
//	public void eat() {
//		
//	}
//}

//Also when a class extends a abstract class having abstract method,
//its is complusory for the sub/child/derived class to implement
//the abstract method im this case walk()

//Below is the abstract class
abstract class Human{
	public abstract void walk();
	
	public void eat() {
		
	}
}

// Below is the CONCRETE class.
class Men extends Human{

	public void walk() {
		System.out.println(" from Men class walk method.");
	}
	
	
}


public class AbstractDemo {
	
	public static void main(String[] args) {
		
	}

}
