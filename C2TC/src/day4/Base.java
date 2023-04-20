package day4;

public class Base {
	int varDefault = 10;				//default
	public int varPublic = 20;			//public
	private int varPrivate = 30;		//private
	protected int varProtected = 40;	//protected
	
	void methodDefault() {
		System.out.println("Default access base class");
		System.out.println("Default variable: "+varDefault);
	}
	public void methodPublic() {
		System.out.println("Public access base class");
		System.out.println("Public variable: "+varPublic);
	}
	private void methodPrivate() {
		System.out.println("Private access base class");
		System.out.println("Private variable: "+varPrivate);
	}
	protected void methodProtected() {
		System.out.println("Protected access base class");
		System.out.println("Protected variable: "+varProtected);
	}
	public static void main(String[] args) {
		Base obj = new Base();		//object creation
		//obj.m
	}
}
