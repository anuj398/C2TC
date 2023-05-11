package day14.synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Account al = new  Account (123, "Reventh K", 50000); 
		System.out.println(al);
		
		//Ten account thread running parallel & sharing same resource 
		AccountThread t[] = new AccountThread [10];
		for (int i=0; i<10; i++) {
			t[i]= new AccountThread (al, 1000* (i+1));
		}
		try {
			for (int i = 0; i < 10; i++) {
				t[i].join();
				}
		} catch (InterruptedException e) { 
				System.err.println(e.getMessage()); 
		}//waits main thread execution of all child thread
			System.out.println(al);
	}

}

