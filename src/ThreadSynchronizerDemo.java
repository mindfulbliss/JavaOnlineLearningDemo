class Counter {

	int count = 0;

	// synchronized keywords makes sure that the at any time
	// only one thread has access to the method. 
	// Thus making the program thread safe.
	public synchronized void increment() {
		count++;
	}
}

public class ThreadSynchronizerDemo {

	public static void main(String[] args) throws Exception 
	{

		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0;i<1000;i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Counter value = "+c.count);

	}

}
