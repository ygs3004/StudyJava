package sec07_user_define_exception;

public class BalanceInsufficientException extends Exception{
	
	public BalanceInsufficientException() {
		
	}
	
	public BalanceInsufficientException(String message) {
		// System.out.println("message : "+message);
		super(message);
	}

}