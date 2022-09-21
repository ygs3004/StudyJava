package chap09.multithreadexample09;

class Account {

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

	int withdraw(int amount) throws Exception { // 출금
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;
	}

}

class SharedArea{
	Account account1;
	Account account2;
	
	void transfer(int amount) {
		synchronized(this) {
			try {
				account1.withdraw(1000000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("이몽룡 계좌 : 100만원 인출");
			account2.deposit(1000000);
			System.out.println("성춘향 계좌 : 100만원 입금");
		}
	}
	
	int getTotal() {
		synchronized(this) {
			return account1.balance+account2.balance;	
		}
	}
}


public class MultithreadExample09 {

	public static void main(String[] args) {
		SharedArea area=new SharedArea();
		area.account1=new Account("111-111-1111","이몽룡",20000000);
		area.account2=new Account("222-222-2222","성춘향",10000000);
		TransferThread thread1=new TransferThread(area);
		PrintThread thread2=new PrintThread(area);
		thread1.start();
		thread2.start();
	}

}


class TransferThread extends Thread{
	SharedArea area;
	
	TransferThread(SharedArea area){
		this.area=area;
	}
	
	@Override
	public void run() {
		for(int cnt=0; cnt<12; cnt++) {
			area.transfer(1000000);
		}
	}
	
}

class PrintThread extends Thread{
	SharedArea area;
	
	PrintThread(SharedArea area){
		this.area=area;
	}
	
	@Override
	public void run() {
		area.getTotal();
	}
	
}