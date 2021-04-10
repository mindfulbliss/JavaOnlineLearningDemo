// WHY DO WE NEED ABSTRACT CLASS?
//consider this example

//class Printer{
//	
//	public void display(Integer i) {
//		System.out.println("Class Printer display method i ="+i);
//	}
//	
//	public void display(Double i) {
//		System.out.println("Class printer display method i ="+i);
//	
//	}
//	
//}
//
//
//
//public class WhyDoWeNeedAbstractClassDemo {
//
//	public static void main(String[] args) {
//		Printer obj = new Printer();
//		obj.display(34);
//		obj.display(552.05);
//		//OUTPUT
//        //Class Printer display method i =34
//	   //Class printer display method i =552.05
//	}
//	
//
//}

//In this example, 
//we have written two display method with diff signature
//however we can write a single method and pass in either int or double or float
//Because int, double,float all extend class Number and
//Number is a abstract class

//refer below class

class Printer{
	
	public void display(Number i) {
		System.out.println("Class Printer display method i ="+i);
	}
	
	
}



public class WhyDoWeNeedAbstractClassDemo {

	public static void main(String[] args) {
		Printer obj = new Printer();
		obj.display(37);
		obj.display(552.50);
		//OUTPUT
        //Class Printer display method i =34
	   //Class printer display method i =552.05
	}
	

}