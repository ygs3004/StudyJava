package tbrainExample02;

//고용주

public class Employer {

	private int myMoney;
	
	public Employer(int money) {
		myMoney = money;
	}

	public void payForWork(Employee emp, int money) {
		if(myMoney < money)
			return;
		emp.earnMoney(money);
		myMoney -= money;
	}

	public void showMyMoney() {
		System.out.println("Employer(고용주) myMoney : "+myMoney);
	}

	
	public static void main(String[] args) {
		Employer yer=new Employer(10000000);
		Employee yee=new Employee(0);
		yer.payForWork(yee, 2000000);
		yer.showMyMoney();
		yee.showMyMoney();
		
	}
	
}