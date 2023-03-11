package multithread;

import java.util.Scanner;

public class MyRunnable implements Runnable {

	@Override// this class provide space for run() it is not a thread it doesnot extend thread instead it implement which is act as surrogacy
	public void run() {
		// TODO Auto-generated method stub
	for(int i=0;i<=5;i++) {
		System.out.println("Enter the input");
		int a =new Scanner(System.in).nextInt();// blocks the threads run method is blocked here
		System.out.println("Got the input proceeding");
		System.out.println(Thread.currentThread().getName()+"="+i);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
		e.printStackTrace();
		}
	}

	}

}
