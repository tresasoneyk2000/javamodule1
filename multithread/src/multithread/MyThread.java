package multithread;

public class MyThread extends Thread {

	private String name;
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	public MyThread(String name) {
		this.name=name;
		
	}
	public void run() {// run is entry point of child thread
		for(int i=1;i<600;i++) {
			System.out.println(name+" + "+i);
		}
	}
}
