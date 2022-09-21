package tbrainExample02;

public class InheritanceTest03 {

	public static void main(String[] args) {
		
		BonusPointAccount obj = new BonusPointAccount("333-33-333333","김미영",0,0);
		obj.deposit(1000000);
		
		System.out.println("잔액 : "+obj.balance);
		System.out.println("누적 포인트 : "+obj.bonusPoint);
		
	}

}
