 //User defined exception
package day14.synchronization;

	@SuppressWarnings("serial")
	public class InsufficientBalanceException extends Exception {
		
		public InsufficientBalanceException() {
			super("Insufficient Balance in your Account");
		}
		public InsufficientBalanceException (String message) {
			super(message);
		}
}
