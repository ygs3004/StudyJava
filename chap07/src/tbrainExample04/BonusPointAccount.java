package tbrainExample04;

// 포인트 적립 계좌 클래스
public class BonusPointAccount extends Account {
	int bonusPoint;

	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, bonusPoint);
		this.bonusPoint = bonusPoint;
	}

	@Override
	void deposit(int amount) { // 예금, 0.1%적립
		balance += amount;
		bonusPoint += (int)(amount*0.001);
	}
}