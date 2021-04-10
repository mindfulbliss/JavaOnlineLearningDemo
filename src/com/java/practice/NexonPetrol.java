package com.java.practice;

public class NexonPetrol extends Car 
{

	public NexonPetrol(String car_colour) {
		super(car_colour);
		
	}
	
	public static void main(String[] args) {
		Car car = new Car("Flame Red");
		car.PrintCarColour();
		car.PetrolEngineDetails();
	}
	

}
