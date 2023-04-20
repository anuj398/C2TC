package day8.Abstraction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.calArea();
		s.show();
		
		Shape shape;
		shape = new Square(21.5f);
		
		shape.calArea();
		shape.show();
	
	}

}
