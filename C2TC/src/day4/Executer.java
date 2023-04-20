package day4;

public class Executer {
	public static void main(String[] args) {
		Base obj = new Base();		//object creation
		obj.methodDefault();
		obj.methodProtected();
		obj.methodPublic();
		
		obj.varDefault = 11;
		obj.methodDefault();
		
		obj.varProtected = 31;
		obj.methodProtected();
		
		obj.varPublic = 21;
		obj.methodPublic();
	}
}
