abstract class Writer{
	public abstract void write(String message); 
}


class Pen extends Writer{

	public void write(String message) {
		System.out.println("Class Pen message ="+message);
	}
	
}

class Pencil extends Writer{
	public void write(String message) {
		System.out.println("Class Pencil message ="+message);
	}
	
}
public class WhyDoWeNeedAbstractClass2 {
	
	public static void main(String[] args) {
		Writer wr = new Pencil();
		wr.write("Pencil message");
		wr=new Pen();
		wr.write("Pen message");
				
				
		
	}

}
