package tbrainExample02;

//마니어스 통장 클래스
public class CreditLineAccount extends Account {
	int creditLine = 200000000;

	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	@Override
	int withdraw(int amount) throws Exception { // 출금
		if (creditLine + balance < amount)
			throw new Exception("인출이 불가능합니다.");
		balance -= amount;
		creditLine += balance;

		return amount;
	}
}