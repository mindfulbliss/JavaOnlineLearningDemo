//MultiThreading can be done with implementing runnable interface
//as extends limits the classes that can be inherited.


class A11 implements Runnable{	
	public void run() {
		for (int i =0; i<5;i++) {
			System.out.println("A1");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}		
	}	
}

class A12 implements Runnable{
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("A2");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}


public class ThreadDemoWithRunnableInterface {
	
	public static void main(String[] args) {
		//Create a obj  
		
		Runnable obj1 = new A11();
		Runnable obj2 = new A12();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		
		t2.start();
	}

}
