class Calc{
	
	int num1;
	int num2;
	double result;
	
	// here we achieve constructor overloading
	//i.e same constructor name different paramenters or signature.
	public Calc() {
		num1=10;
		num2=4;
	}
	
	public Calc(int x) {
		num1=x;
		num2=x;
	}	
	
	
	public Calc(int num1, int num2) {
		
		this.num1 = num1;//this specifies the instance variable num1 and not the local method variable.
		this.num2 = num2;
		
	}
	
	public void Add() {
		result = num1+num2;
		System.out.println("Addition = "+ (int)result);
	}
	
}


public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		Calc obj = new Calc();
		obj.Add();
		
		Calc obj1 = new Calc(6);
		obj1.Add();
		
		Calc obj2 = new Calc(50,20);
		obj2.Add();
		
		
	}

}
