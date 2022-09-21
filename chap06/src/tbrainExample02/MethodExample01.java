package tbrainExample02;

public class MethodExample01 {

	public static void main(String[] args) {
		Account obj1 = new Account("111-222-33333333", "김영식", 200000);
		Account obj2 = new Account("555-666-77777777", "박진희", 1000000);

		obj1.deposit(1000000);
		//obj2.withdraw(200000);

		// 두 객체의 내용을 출력
		/*
		System.out.println("계좌번호 : " + obj1.accountNo);
		System.out.println("예금주 : " + obj1.ownerName);
		System.out.println("잔액 : " + obj1.balance);

		System.out.println("계좌번호 : " + obj2.accountNo);
		System.out.println("예금주 : " + obj2.ownerName);
		System.out.println("잔액 : " + obj2.balance);
		 */	
		
		printAccount(obj1);
		System.out.println();
		
		printAccount(obj2);

	}

	static void printAccount(Account account) {
		System.out.println("계좌번호 : " + account.accountNo);
		System.out.println("예금주 : " + account.ownerName);
		System.out.println("잔액 : " + account.balance);
	}
}