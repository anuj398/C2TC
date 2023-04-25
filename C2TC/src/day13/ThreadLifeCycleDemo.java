package day13;

public class ThreadLifeCycleDemo extends Thread {
	 public void run() {
		 System.out.println("Inside run() thread is alive or not? "+this.isAlive ());
		 int num = 0;
		 while (num < 4) {
		 num++;
		 System.out.println("num "+num);
		 try {
			 sleep (1000);
			 System.out.println("Inside runnable() thread is alive or not? "+this.isAlive());
		 } catch (InterruptedException e) {
			 System.err.println(e.getMessage());
		 }
	 }
 }

	public static void main(String[] args) {
		Thread myThread = new ThreadLifeCycleDemo (); 
		System.out.println("Before runnable() thread is alive or not? "+myThread.isAlive());
		myThread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		System.err.println(e.getMessage());
		System.out.println("After complition thread is alive or not? "+myThread.isAlive());
		}
	}	
}
