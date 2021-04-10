// here we have a class V1 which has one method add()
class CalcV1{
	
	public int Add(int ... n)
	{
		if(n == null || n.length == 0) {
			return 0;
		}
		 int result = 0;
		for(int k:n) {
			
			result +=k;
		}
		
		return result;
	}
	
}
// We have now an improvement over V1 and V2 which 
//has method subtract()

class CalcV2 extends CalcV1{
	
	public int Subtract(int ... n) {
		if(n == null || n.length == 0) {
			return 0;
		}
		int result = n[0];
		for(int k = 1; k<n.length; k++) {
			result -=n[k];
		}
		return result;
		
	}
	
}

// finally the latest version V3 has multiplication method.

class CalcV3 extends CalcV2{
	public int Multiply(int ... n) {
		if(n == null || n.length == 0) {
			return 0;
		}
		int result =1;
		for(int k:n) {
			result *= k;
		}
		
		return result;
	}
}


//Now all the class above can be accessed (inherit) by CalcV3
//if it extends CalcV2 and if CalcV2 extends CalcV1

//Single inheritance CalcV2 extends CalcV1
//Multilevel inheritance CalcV3 extends CalcV2, CalcV2 extends CalcV1

// Class  Terminology
// CalcV1 > Super > Parent > Base 
// CalcV2 > Sub   > Child  > Derived

// In Java we use Super and Sub class
//In the Java programming language, 
//each class is allowed to have one direct superclass, 
//and each superclass has the potential for 
//an unlimited number of subclasses:

//Inheritance relationship among classes "IS-A"
//Class CalcV3 is a extension of Class CalcV2, similarly
//Class CalcV2 is a extension of Class CalcV1


//Is-A Relationship in Java

//In Java, an Is-A relationship depends on inheritance. 

//Further inheritance is of two types, class inheritance and interface
//inheritance. It is used for code reusability in Java. For example, a Potato
//is a vegetable, a Bus is a vehicle, a Bulb is an electronic device and so on.
//One of the properties of inheritance is that inheritance is unidirectional in
//nature. Like we can say that a house is a building. But not all buildings are
//houses. We can easily determine an Is-A relationship in Java. When there is
//an extends or implement keyword in the class declaration in Java, then the
//specific class is said to be following the Is-A relationship.
 
//Has-A Relationship in Java
// 
//In Java, a Has-A relationship is also known as composition. 
//It is also used for code reusability in Java. In Java, 
//a Has-A relationship simply means that an instance of one class 
//has a reference to an instance of another class or 
//an other instance of the same class. For example, a car has an engine, 
//a dog has a tail and so on. In Java, there is no such keyword 
//that implements a Has-A relationship. But we mostly use new keywords 
//to implement a Has-A relationship in Java.


public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		CalcV3 obj = new CalcV3();
		//CalcV3 accessing its own method Multiply
		System.out.println("Mul result = "+ obj.Multiply(1,2,3,4,5,6));
		//CalcV3 accessing its Parent CalcV2 method Subtract		
		System.out.println("Sub result = "+ obj.Subtract(1,2,3,4,5,6));
		//CalcV3 accessing its Grand Parent CalcV1 method Add		
		System.out.println("Add result = "+ obj.Add(1,2,3,4,5,6));
	}

}
