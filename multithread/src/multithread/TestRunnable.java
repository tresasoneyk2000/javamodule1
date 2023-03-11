package multithread;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		System.out.println("mains oriority ="+ Thread.currentThread().getPriority());
		
		MyRunnable runnable=new MyRunnable();
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("T1 PRIORITY = "+ t1.getPriority());
		System.out.println("T2's priority = " +t2.getPriority());
		System.out.println("main exited");
		

	}

}
