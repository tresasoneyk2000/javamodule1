package oopsday3.atm.exceptions;

public class InsuffcientFundsException extends Exception {
	public InsuffcientFundsException() {
		
	}
	public InsuffcientFundsException(String msg) {
		super(msg);
	}
 public String getMessage() {
	 return super.getMessage();
 }
}
