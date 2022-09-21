package sec02.exam02_01_switch;

// 과일 입력, "딸기:1000", "바나나:3000", "망고:5000", "귤:10000"
// 해당 과일명과 가격 출력하세요.
// 없을 경우 " 해당하는 과일이 없습니다 출력"
// switch

import java.util.Scanner;

public class SwitchEx_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String fruit;
		int price=0;
		
		System.out.println("과일을 입력하세요.");
		fruit=sc.nextLine();
		
		switch(fruit) {
		
		case "딸기" :
			price=1000;
			break;
			
		case "바나나" :
			price=3000;
			break;
			
		case "망고" :
			price=5000;
			break;
			
		case "귤" :
			price=10000;
			break;
			
		default :
			System.out.println("해당하는 과일이 없습니다.");
			break;
		}
		System.out.println(fruit+"는(은) "+price+"원 입니다.");
		
		sc.close();		
	}

}
