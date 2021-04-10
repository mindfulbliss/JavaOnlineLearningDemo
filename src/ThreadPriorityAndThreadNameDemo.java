
public class ThreadPriorityAndThreadNameDemo {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});

		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 5; i++) {
				System.out.println("Hellow");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		
		//SET THREAD NAME DEFAULT NAME IS THREAD-0 and SO ON..	
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("Hi Thread");
		t2.setName("Hellow Thread");		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		//PRIORITY OF A THREAD
		// by default he thread priority is default (5)
		//range of priority is from 1(least) to 10(highest)
		// OR
		//THREAD.MIN_PRIORITY i.e (1) THREAD.NORM_PRIORITY i.e(5) and
		//THREAD.MAX_PRIORITY i.e (10).
		
		System.out.println("T1 Priority"+t1.getPriority());
		System.out.println("T2 Priority"+t2.getPriority());
		
		//SET THREAD PRIORITY
		
		t1.setPriority(1);
		//OR
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t2.setPriority(10);
		//OR
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("T1 Priority"+t1.getPriority());
		System.out.println("T2 Priority"+t2.getPriority());

		t1.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		t2.start();

		// Thread.join -- Waits for this thread to die
		t1.join();
		t2.join();
		// so Bye will not be printed untill above both thread are alive
		// we can check that with Thread.isAlive()

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println("Bye");

	}

}
