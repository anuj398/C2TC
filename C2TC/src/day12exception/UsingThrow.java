package day12exception;

import java.util.Scanner;

public class UsingThrow {
	static int acceptNumber() {
		Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 sc.close();
		 return n;
	}
	public static void main(String[] args) {
		int per;
		System.out.println("Enter a Percentage: ");
		per = acceptNumber() ;
		try {
		    if (per < 0) {
		    	throw new ArithmeticException ("Percentage should not be negative");
		    }
		    if (per>100) {
		    	throw new ArithmeticException ("Percentage should not be above 100");
		    }
		    else {
		    	System.out.println("Valid percentage");
		    }
		 } catch (ArithmeticException e) {
			 System.err.println("Error..."+e.getMessage());
	}
	}
}
