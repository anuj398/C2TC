package day8.Interface;

public class SavingAccount extends Person  {
	private static final float MINBAL = 0;
	private static final float DEPOSIT_LIMIT = 0;
	private int accNo;
	private float balance;
	
	public SavingAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}


	public void deposit(float amount) {
		if(amount > DEPOSIT_LIMIT) {
			System.out.println("Deposit exceeded the limit");
		}
		else {
			balance += amount;
			System.out.println("Rs."+amount +"was deposited");
		}
	}

	public void withdraw(float amount) {
		if(amount <= balance - MINBAL) {
			balance -= amount;
			System.out.println("Rs."+amount +"was withdrawn");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
}