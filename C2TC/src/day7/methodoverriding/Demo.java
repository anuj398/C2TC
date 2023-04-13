package day7.methodoverriding;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RBI rbi;
		
		//Dynamic Binding or Upcasting
		rbi = new SBI();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfIntrest());

	}

}
