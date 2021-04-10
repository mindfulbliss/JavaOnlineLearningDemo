// From the WhyDoWeNeedAbstractClass2.java it is evident 
//that we can extend the abstract class Writer in classes
//pen and pencil and create a obj of pen or pencil with class ref
//as Writer and thus achieve abstraction.

//But now the problem is that we cannot extend two classes as
//java does not allow multiple inheritance.

//So Interface is the solution to achieve this
// Class implements the Interface
//Interface is similar to abstract class , except that
//all methods defined in interface are public abstract i.e they
//have only declaration and no body/implementation.

//abstract class Writer{
//	public abstract void display(String message);
//}
//
//class InkFillSystem{
//	public void fillInk()
//	{
//		System.out.println("Ink filled completely");
//	}
//	public void purgeInk() {
//		System.out.println("Ink removed completely");
//	}
//}

//here we have two classes Writer and InkFillSystem
//since both cannot be extended we need to create a interface of
//one class and extend the other
// OR
// we can create both classes as interface and implement them


abstract class Writer1{
	public abstract void display(String message);
}

interface InkFillSystem{
	void fillInk();
	
	void purgeInk();
}

class FountainPen extends Writer1 implements InkFillSystem
{
	public void display(String message) {
		System.out.println(message);
	}
	
	public void fillInk() {
		System.out.println("Ink filled completely");
	}
	
	public void purgeInk() {
		System.out.println("Ink purged completely");
	}

	
}

class InkCartidgePen extends Writer1 implements InkFillSystem{
	public void display(String message) {
		System.out.println(message);
	}
	public void fillInk() {
		System.out.println("Ink cartidge inserted");
	}
	public void purgeInk() {
		System.out.println("Ink cartidge removed");
	}
	
}


public class WhyDoWeNeedInterfaceDemo {
	
	public static void main(String[] args) {
		InkCartidgePen icp = new InkCartidgePen();
		icp.display("This is a abstract method implementation");
		icp.fillInk();
		icp.purgeInk();
		
		FountainPen fp = new FountainPen();
		fp.display("This is a abstract method implementation");
		fp.fillInk();
		fp.purgeInk();
	}
	

}
