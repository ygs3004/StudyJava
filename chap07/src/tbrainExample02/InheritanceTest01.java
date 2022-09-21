package tbrainExample02;

public class InheritanceTest01 {

	public static void main(String[] args) {
//		CheckingAccount obj = new CheckingAccount();
//		obj.accountNo="111-22-33333333";
//		obj.ownerName="홍길동";
//		obj.cardNo="5555-6666-7777-8888";

		CheckingAccount obj = new CheckingAccount("111-22-33333333", "홍길동", 0, "5555-6666-7777-8888");
		obj.deposit(100000);

		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("지불액 : " + paidAmount);
			System.out.println("잔액 : " + obj.balance);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}

}