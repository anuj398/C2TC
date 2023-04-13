package day7.overloading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method Overloading");
		System.out.println("Addition of two integers"+MethodOverloading.add(23, 57));
		System.out.println("Addition of two Float"+MethodOverloading.add(11.5f, 3.7f));
		System.out.println("Addition of one integer and one float"+MethodOverloading.add(5, 6.8));
		System.out.println("Addition of one float and one integer"+MethodOverloading.add(1.0f, 24));
		System.out.println("Addition of two Strings"+MethodOverloading.add("Rev", "enth"));
	
		
		System.out.println("Consructor Overloading");
		Point p = new Point();//default constructor will invoked
		System.out.println(p);
		
		Point p1 = new Point(35.7f);
		System.out.println(p1);

		Point p2 = new Point(35.7f, 63.1f);
		System.out.println(p2);

	
	}

}
