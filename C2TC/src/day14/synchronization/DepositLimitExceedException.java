//User defined exception
package day14.synchronization;

@SuppressWarnings("serial")
public class DepositLimitExceedException extends Exception{
	public DepositLimitExceedException() { 
		super ("Daily limit of Deposit is exceeded..."); 
		}
	public DepositLimitExceedException (String message) { 
		super(message);
	}
}
