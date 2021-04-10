//Extend the Thread class

class Hi extends Thread{
	
	// rename method as run
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}

class Hello extends Thread{
	public void run() {
		for(int i =0; i<5;i++) {
			System.out.println("Hello");
			try{Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}



public class ThreadDemoWithExtendingThreadClass {
	
	public static void main(String[] args) {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		// Call start method which in turn calls the run method of classes
		//defined above.
		obj1.start();
		obj2.start();
	}

}
