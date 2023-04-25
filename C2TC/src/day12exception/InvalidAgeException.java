package day12exception;

@SuppressWarnings("serial")
public class InvalidAgeException  extends Exception{
	public InvalidAgeException() {
		super ("Invalid Age");
}
	InvalidAgeException (String message) {
		super (message);
	}
}
