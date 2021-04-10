class Outer{
	
	int a=7;
	
	public void PrintOuterClassDetails()
	{
		System.out.println("From Outer class, value of a = "+a);
	}
	
	class Inner{
		
		int a=8;
		
		public void PrintInnerClassDetails()
		{
			System.out.println("From Inner class, value of a = "+a);
		}
	}
	
	static class Inner2{
		int a = 9;
		
		public void PrintInnerStaticClassDetails()
		{
			System.out.println("From Static inner class, value of a ="+a);
		}
		
		
	}
}




public class InnerClassDemo {
	
	public static void main(String[] args)
	{
		//Create a object of outer class
		Outer obj = new Outer();
		obj.PrintOuterClassDetails();
		
		//Create a object of inner class
		// Syntax:
		// OuterClass.InnerClass innerclassobject = outerclassobject.new InnerClass()
		
		Outer.Inner obj1 = obj.new Inner();
		obj1.PrintInnerClassDetails();
		
		
		//Create a obj of static inner class
		//syntax : OuterClass.InnerClass innerclassobject = new OuterClass.InnerClass(
		Outer.Inner2 obj3 = new Outer.Inner2();
		obj3.PrintInnerStaticClassDetails();
				
		
	}

}
