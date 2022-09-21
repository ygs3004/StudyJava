package tbrainExample01;

import java.util.Scanner;

// 과일 판매자의 현황
// 남은 사과 : 18
// 판매 수익 : 2000
// 과일 구매자의 현황
// 현재 잔액 : 3000
// 사과 개수 : 2

public class FruitSalesMain1 {

	public static void main(String[] args) {
		
		FruitSeller seller=new FruitSeller();
		FruitBuyer buyer=new FruitBuyer();

		Scanner sc=new Scanner(System.in);

		System.out.print("사과 구매에 사용한 돈 : ");
		int money = sc.nextInt();
		buyer.buyApple(seller, money);
		
		System.out.println();
		System.out.println("과일 판매자의 현황");
		seller.showSaleResult();
		
		System.out.println();
		System.out.println("과일 구매자의 현황");
		buyer.showBuyResult();
	
		sc.close();
	}
}