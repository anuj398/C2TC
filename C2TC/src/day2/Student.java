package day2;

public class Student {

	void one()
	{
		System.out.println("fisrt method");
		
	}
	void two()
	{
		System.out.println("second method");
	}
	public static void main(String[] args) {
		
		Student obj = new Student();
		System.out.println("main method");
		obj.one();
		obj.two();

	}

}
