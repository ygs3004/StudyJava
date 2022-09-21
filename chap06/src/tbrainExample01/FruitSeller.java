package tbrainExample01;

public class FruitSeller {
	
	final int APPLE_PRICE=1000;
	int numOfApple=20;
	int myMoney=0;
	
	public int saleApple(int money) {
		int num=money/APPLE_PRICE; // money를 받고 판 사과수
		numOfApple-=num; // 남은 사과수
		myMoney+=money;	// 과일장수가 소지하고 있는 돈
	
		return num; // 
	}
	
	public void showSaleResult() {
		System.out.println("남은 사과 : "+numOfApple);
		System.out.println("판매 수익 : "+myMoney);
	}
}