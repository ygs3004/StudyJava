package view;

import java.util.Scanner;

import controller.CoffeeManager;
import model.exception.CoffeeException;
import model.vo.Coffee;

public class CoffeMenu {
	public static CoffeeManager cm = new CoffeeManager();
	
	public static void showMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("== 길동이의 커피 프린세스 버젼 1 ==");
		System.out.println("--------------------------------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라뗴");
		System.out.println("3. 카푸치노");
		System.out.println("\n메뉴를 선택하세요 : ");
		int sel=sc.nextInt();
		System.out.println("주문한 잔의 수 : ");
		int cups=sc.nextInt();
		
		String coffeeName = null;
		int price = 0;
		
		switch(sel) {
			case 1:
				coffeeName = "아메리카노";
				price=3000;
				break;
			case 2:
				coffeeName = "카페라떼";
				price=3500;
				break;
			case 3:
				coffeeName = "카푸치노";
				price=4000;
				break;
		}
		
		System.out.println("주문하신 커피는 " + coffeeName + "이며");
		System.out.println("총 " + cups + "잔 이며");
		System.out.println("가격은 "+(price*cups)+"원 입니다.");
		*/
		
		/*cup[0]:메뉴 선택 cup[1]:주문할 잔의 수 cup[2]:가격
		int[] cup = new int[3];
		System.out.println("== 길동이의 커피 프린세스 버젼 1 ==");
		System.out.println("--------------------------------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라뗴");
		System.out.println("3. 카푸치노");
		System.out.println("\n메뉴를 선택하세요 : ");
		cup[0]=sc.nextInt();
		System.out.println("주문한 잔의 수 : ");
		cup[1]=sc.nextInt();
		
		String coffeeName = null;
		
		switch(cup[0]) {
			case 1:
				coffeeName = "아메리카노";
				cup[2]=3000;
				break;
			case 2:
				coffeeName = "카페라떼";
				cup[2]=3500;
				break;
			case 3:
				coffeeName = "카푸치노";
				cup[2]=4000;
				break;
		}
		
		System.out.println("주문하신 커피는 " + coffeeName + "이며");
		System.out.println("총 " + cup[1] + "잔 이며");
		System.out.println("가격은 "+(cup[2]*cup[1])+"원 입니다.");
		*/
		
		/*
		initMenu(2.0);
		System.out.println("메뉴를 선택하세요. : ");
		int sel = sc.nextInt();
		System.out.println("주문할 잔의 수 : ");
		int cups = sc.nextInt();
		
		Coffee co = new Coffee(sel, cups);
		
		System.out.println("주문하신 커피의 정보입니다.");
		System.out.println(co);
		*/
		
		do {
			showMenu(3.0);
			System.out.print("메뉴 확인 : ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				insertCoffee();
				break;
			case 2:
				selectCoffee();
				break;
			case 3:
				updateCoffee();
				break;
			case 4:
				deleteCoffee();
				break;
			case 5:
				selectCoffeeAll();
				break;
			case 6:
				System.out.println("정말 종료하시겠습니까?(Y/N)");
				if(sc.next().toUpperCase().charAt(0)=='Y') {
					cm.close();
					
					return;
				}else {
					System.out.println("메뉴를 다시 불러옵니다.");
				}
				break;
			}
		}while(true);
	}
	
	public static void showMenu(double version) {
		
		System.out.println("== 길동이의 커피 프린세스 버젼 " +version +"==");
		System.out.println("--------------------------------");
		
		/*
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라뗴");
		System.out.println("3. 카푸치노");
		*/
		System.out.println("1. 커피 주문");
		System.out.println("2. 주문 번호 확인");
		System.out.println("3. 주문 내용 변경");
		System.out.println("4. 주문 취소");
		System.out.println("5. 주문 전체 내역 확인");
		System.out.println("9. 프로그램 종료");
	}
	
	
	public static void insertCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- 메뉴 ----");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 카푸치노");

		System.out.println("메뉴 확인 : ");
		int sel = sc.nextInt();
		System.out.println("주문 잔 수 : ");
		int cups = sc.nextInt();
		
		System.out.println("주문 정보 확인 : ");
		System.out.println(cm.insertCoffee(new Coffee(sel, cups)));

	}
	
	public static void selectCoffee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 확인 번호 : ");
		int orderNo = sc.nextInt();
		
		try {
			System.out.println("현재 주문 내역");
			System.out.println(cm.verifyCoffee(orderNo));
		}catch (CoffeeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void updateCoffee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 번호 확인 : ");
		int orderNo=sc.nextInt();
				
		try {
			System.out.println("주문 내역 확인");
			System.out.println(cm.verifyCoffee(orderNo));
			System.out.println("---- 메뉴 ----");
			System.out.println("1. 아메리카노");
			System.out.println("2. 카페라떼");
			System.out.println("3. 카푸치노");

			System.out.println("메뉴 확인 : ");
			int sel = sc.nextInt();
			System.out.println("주문 잔 수 : ");
			int cups = sc.nextInt();
			cm.updateCoffee(orderNo, new Coffee(sel, cups));
		}catch(CoffeeException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void deleteCoffee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 번호 확인 : ");
		int orderNo=sc.nextInt();
				
		try {
			System.out.println("주문 내역 확인");
			System.out.println(cm.verifyCoffee(orderNo));
			System.out.println("정말 취소하시겠습니ㅣ까?(Y/N)");
			if(sc.next().toUpperCase().charAt(0)=='Y') {
				cm.deleteCoffee(orderNo);
				System.out.println("주문이 정상적으로 취소되었습니다.");
			}else {
				System.out.println("메인으로 돌아갑니다..");
			}
		}catch(CoffeeException e){
			e.getMessage();
		}
	}
	
	public static void selectCoffeeAll() {
		for(Coffee co : cm.getOrderList()) {
			System.out.println(co);
		}
	}
	
}