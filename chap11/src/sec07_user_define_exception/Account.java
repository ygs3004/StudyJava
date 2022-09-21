package sec07_user_define_exception;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance+=money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money)
			throw new BalanceInsufficientException("잔고 부족 :"+(money-balance)+ " 모자람");
		
	}
	
}