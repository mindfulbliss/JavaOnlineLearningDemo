
public class ThreadIsAliveAndJoinDemo {
	
	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(()->{
			for(int i=0; i<5;i++) {
				System.out.println("Hi");
				try{Thread.sleep(1000);} catch(Exception e) {}
			}			
		});
		
		Thread t2 = new Thread(()->{
			
			for(int i=0;i<5;i++) {
				System.out.println("Hellow");
				try {Thread.sleep(1000);} catch(Exception e) {}
			}
		});
		
		
		t1.start();
		try{Thread.sleep(1000);}catch(Exception e) {}
		t2.start();
		
		// Thread.join -- Waits for this thread to die
		t1.join();
		t2.join();		
		// so Bye will not be printed untill above both thread are alive
		//we can check that with Thread.isAlive()
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println("Bye");
		
	}
	
	
	


}
