class Casio{
	
	int num1;
	int num2;
	
	public Casio(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;				
	}
	
	//method overloading same method name different signature
	public void Add() {
		System.out.println("num1+num2 = "+(num1+num2));
	}
	
	//method overloading
	public void Add(int num1, int num2) {
		System.out.println("num1+num2 = "+(num1+num2));
	}
	
}


public class MethodOverloadingDemo {
	
	public static void main (String[] args) {
		
		Casio obj = new Casio(7,8);
		obj.Add();
		
		obj.Add(10,20);
		
	}

}
