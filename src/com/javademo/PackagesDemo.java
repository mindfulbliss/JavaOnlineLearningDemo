// packages should ideally be mirror of your domain name
//example google.com package should be com.google.test...

package com.javademo;

class A{
	public void show() {
		System.out.println("Class A show");
	}
	
	class B{
		public void show() {
			System.out.println("Class B show");
		}
	}
	
	static class C{
		public void show() {
			System.out.println("Static class C show");
		}
	}
}

public class PackagesDemo {
	
	public static void main(String[] args) {
		
		A obj = new A();
		obj.show();
		
		A.B obj1 = obj.new B();
		obj1.show();
		
		A.C obj2 = new A.C();
		obj2.show();
		
				
	}

}
