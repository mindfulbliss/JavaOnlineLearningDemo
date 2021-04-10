class AA{
	public void show() {
		System.out.println("Class A show()");
	}
}

class BB extends AA
{
	public void show() {
		System.out.println("Class BB show()");
	}
	
}

class CC extends AA
{
	public void show() {
		System.out.println("Class CC show()");
	}
	
}


public class OverridingDemo {
	
	public static void main(String[] args) {
		// If you have a reference of Super class (AA) and obj of
		// sub class (BB) then only methods of Super class (AA)
		// are available.
		
		AA obj = new BB(); // linking is done at run time,
		// the determination of which show()
		// method to call is done at run time hence its 
		// called as run time polymorphism
		obj.show(); // output is "Class BB show()"
		// Now both Class A and B have show method.
		// class B show () overrides the class A method
		
		// we add another class CC which extends AA
		// changing the obj reference to class cc
		obj = new CC();
		obj.show(); // output is "Class CC show()", this isDynamic method dispatch
		// to follow dynamic method dispatch we need run time polymorphism
	}

}
