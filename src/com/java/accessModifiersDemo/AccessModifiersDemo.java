package com.java.accessModifiersDemo;

// access modifiers in java
//1. Final - the variable value cannot be changed,
// the method cannot be overridden
//the class cannot be extended.

//2. Abstract - the method defined as abstract have declaration
// but no body. once method is abstract class 
//also has to be abstract.
// The abstract class can have abstract and non abstract methods.

//3. public -  the class, method ,variable can be accessed from
//different class or diff package.

//4. private - the private variable from Super class are not 
//accessible outside the class. it is good practice to encapsulate
//private variable of class with getter setter methods and exposing
//these methods outside the class. 
//Private class is allowed only on inner class i.e class within a class



//5. protected  - the protected variable are available 
//to the subsiding class.
//the protected methods are available to the subclasses also, even
//if the sub class is in other package.
// protected keyword is not allowed with class



//6. default or package private - when no access modifiers is mentioned its considered
//as default, the default class , method ,variables are accessible
//in the same package.



class B extends A{
	
	public void show() {
		System.out.println(letter);
	}
}


public class AccessModifiersDemo {
	
	public static void main(String[] args) {
		B obj = new B();
		obj.show();
	}

}
