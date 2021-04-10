//Encapsulation means binding of data with methods
// here members are hidden and can only be accessed with methods.. 
// i.e getters and setters

class CustomerInformation{
	private String name;
	private String panNumber;
	
	public CustomerInformation(String name, String panNumber) {
		this.name=name;
		this.panNumber=panNumber;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name,String userName) {
		this.name = name;
		System.out.println(userName+" has updated the name to "+this.name);
	}

	public String getPanNumber() {
		return this.panNumber;
	}
	
	public void setPanNumber(String panNumber, String userName) {
		this.panNumber=panNumber;
		System.out.println(userName+" has updated the pannumber to "+this.panNumber);
	}
	
	
	
	
}
public class EncapsulationDemo {
	
	public static void main(String[] args)
	{
		
		CustomerInformation obj = new CustomerInformation("ABCD","PQRS123");
//		System.out.println(obj.name);
//		obj.name="DEFG";
//		System.out.println(obj.name);
		
		System.out.println(obj.getName());
		System.out.println(obj.getPanNumber());
		
		obj.setName("XYZ","Alpha");
		obj.setPanNumber("XYZ1234","Alpha");
	}

	

}
