//program by using runnable interface
package day13;

	public class UsingRunnable<using>  implements Runnable{
		Thread t;
		int h, l;
		String msg;

	public UsingRunnable (int h, int l, String msg) {
		this.h=h;
		this.l=1;
		this.msg=msg;
		t = new Thread (this, "Child Thread");
		t.start();
	 }
		 
	 @Override
	 public void run() {
		 for (int i = h; i > l; i--) { 
			 try {
				 Thread.sleep(2000);
			 } catch (InterruptedException e) {
				 System.err.println(e.getMessage());
			 }
			 System.out.println(msg + i );
		 }
	 }
}
