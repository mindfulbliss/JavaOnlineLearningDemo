package com.java.practice;

public class Car implements PetrolEngine,ElectricEngine
{
	
	private String colour;
	
	public Car(String car_colour) {
		this.colour=car_colour;
	}
	
	
	public void PrintCarDetails() {
		System.out.println("CAR COLOR IS WHITE");
		
		String s1 = "Illi";
		boolean isPresent = s1.contains("el");
		char ch = s1.charAt(3);
		int position = s1.indexOf("p");
		System.out.println(isPresent);
		System.out.println(ch);
		System.out.println(position);
		
		// print string in reverse
		String reverse_s1="";
		
		for(int i=s1.length()-1; i>=0;i--) {
			reverse_s1+= s1.charAt(i);
		}
		System.out.println(reverse_s1);
		System.out.println(s1.toLowerCase());
		System.out.println(reverse_s1.toLowerCase());
		
		if(s1.toLowerCase().equals(reverse_s1.toLowerCase()))
		{
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}
	
	public void PrintCarColour() {
		System.out.println("Car colour is "+colour);
	}


	@Override
	public void ElectricEngineDetails() {
		System.out.println("This car has an electric engine");
		
	}


	@Override
	public void PetrolEngineDetails() {
		System.out.println("This car has a petrol engine");
		
	}
	
	

	
	
	
	
}
