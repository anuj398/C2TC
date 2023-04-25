package day13;

public class ThreadDemo {
	public static void main(String[] args) {
		Childthread t1 = new Childthread (5, "First");//new thread & runnable
		Childthread t2 = new Childthread (6, "Second");
		
		t1.start(); //running
		t2.start();
}
}
