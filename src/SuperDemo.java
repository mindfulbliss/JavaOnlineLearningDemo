class Vehicle{
	
	int registration_no;
	
	public Vehicle() {
		System.out.println("Default reg no -12345");		
	}
	
	public Vehicle(int reg_no) {
		this.registration_no=reg_no;
		System.out.println("Reg no -"+ registration_no);
	}	
	
}

class Car extends Vehicle{
	
	String carColor;
	
	public Car() {
		super(4567);
		System.out.println("Default car color is white");
	}
	
	public Car(String color) {
		super(456);
		System.out.println("Car color"+color);
	}
}


//Always the super class default constructor is called first
//before the sub class constructor untill explicitly mentioned
//by super().Now the custom constructor of Super class will be called.

public class SuperDemo {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		// car = new Car("Blue");
		
	}

}
