package tbrainExample04;

public class InheritanceExample01 {

	public static void main(String[] args) {
		Account obj1=new Account("111-22-333333","임꺽정",10000);
		CheckingAccount obj3=new CheckingAccount("444-55-666666","홍길동",20000,
													"5555-6666-7777-8888");
		CreditLineAccount obj4=new CreditLineAccount("777-88-999999","김선달",
													30000,20000000);
		BonusPointAccount obj2=new BonusPointAccount("000-00-000000","김미영",0,0);
		
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
	}
	
	static void printAccountInfo(Account account){
		System.out.println("계좌 번호 : "+account.accountNo);
		System.out.println("예금주 이름 : "+account.accountNo);
		System.out.println("잔액 : "+account.balance);
		System.out.println();
				
	}

}