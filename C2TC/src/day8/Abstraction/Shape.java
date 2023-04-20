package day8.Abstraction;

public abstract class Shape {
protected float area;
	
	//abstract method
	abstract void calArea();
	
	//normal method
	void show() {
		System.out.println("Area of shape is "+area);
	}
}
