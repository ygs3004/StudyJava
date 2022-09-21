package tbrainExample04;

// 은행 계좌 클래스를 상속하는 직불 계좌 클래스

public class CheckingAccount extends Account {
	
	String cardNo;
	
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		super(accountNo, ownerName, balance);
		//this.accountNo=accountNo;
		//this.ownerName=ownerName;
		//this.balance=balance;
		this.cardNo=cardNo;
	}
	
	

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(cardNo) || balance < amount)
			throw new Exception("지불이 불가능 합니다.");
		return withdraw(amount);
	}

}