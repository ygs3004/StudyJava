package tbrainExample02;

public class MethodExample03 {

	public static void main(String[] args) {

		Account obj = new Account("777-777-77777777", "최대박", 10);

		// 예외처리
		try {
			int amount = obj.withdraw(10000);
			System.out.println("인출액 : " + amount);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}

}
