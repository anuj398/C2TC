package day7.Static;

public class StaticBlockDemo {
	 static int a;
	 static int b;
	 static {
	    a = 10;
	    b = 20;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of a = " + a);
		  System.out.println("Value of b = " + b);
	
	}

}
