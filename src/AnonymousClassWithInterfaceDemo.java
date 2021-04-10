interface ABC{
	
	void walk();
}
//Here we create a anonymous class with Interface obj
//and give the definition. Advantage is less mem usages,
//however the definiation cannot be reused.
//Here we have created a obj of interface with anonymous class
//
public class AnonymousClassWithInterfaceDemo {
	
	public static void main(String[] args) {
		
		ABC obj = new ABC()
				{
					public void walk() {
						System.out.println("Walk straight.");
					}
			
			
				};
				
		obj.walk();
	}

}
