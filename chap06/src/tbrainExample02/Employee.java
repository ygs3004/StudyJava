package tbrainExample02;

public class Employee {

	private int myMoney;

	public Employee(int money) {
		myMoney = money;
	}
	
	public void earnMoney(int money) {
		myMoney += money;
	}

	public void showMyMoney() {
		System.out.println("Employee(고용인) myMoney : "+myMoney);
	}
	
}