class Calculator{
	//variables
	int num1;
	int num2;
	double result;
	
	
	
	
	//methods
	
	void Addition() {
		result = num1+num2;
		System.out.println(" Addition result = "+ result);
	}
	
	void Subtraction() {
		result = num1-num2;
		System.out.println(" Subtraction result = "+ result);
	}
	
	void Division() {
		result = num1/num2;
		System.out.println(" Division result = "+ result);
	}
	
	void Multiplication() {
		result = num1*num2;
		System.out.println(" Multiplication result = "+ result);
	}
	
	
}


public class ClassesAndObjects {
	
	public static void main (String[] args) {
		
		Calculator obj = new Calculator();
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		obj.num1=10;
		obj.num2=4;
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		obj.Addition();
		obj.Subtraction();
		obj.Division();
		obj.Multiplication();
	}

}
