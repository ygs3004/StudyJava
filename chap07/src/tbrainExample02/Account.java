package tbrainExample02;

//public final class Account{ // final : 상속 금지
public class Account {

	String accountNo; // 계좌번호
	String ownerName;// 예금주
	int balance; // 잔액
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}

	void deposit(int amount) { // 예금
		balance += amount;
	}

	// final int withdraw() : Overrideing 금징
	int withdraw(int amount) throws Exception { // 출금
		if (balance < amount)
			// System.out.println("잔액이 부족합니다.");
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;

	}

}