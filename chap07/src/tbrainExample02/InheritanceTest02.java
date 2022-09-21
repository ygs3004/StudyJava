package tbrainExample02;

public class InheritanceTest02 {

	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("000-11-111111", "김선달", 10000, 20000000);

		try {
			int amount = obj.withdraw(300000000);
			System.out.println("인출액 : " + amount);
			System.out.println("잔액 : " + obj.balance);
			System.out.println("마이너스 한도 : " + obj.creditLine);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
