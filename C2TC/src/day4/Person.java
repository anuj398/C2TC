package day4;

public class Person {
	public Person() {
		System.out.println("Default constructor");
	}
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Person [number=" + number + "]";
	}
	public Person(int number) {		
		this.number = number;
		System.out.println(number);
	}
	
}
