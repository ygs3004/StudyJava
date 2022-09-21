package sec02.exam02_01_switch;

import java.util.Scanner;

// 1~12월 중 입력받은 해당 월의 마지막 날짜를 출력하는 프로그램을 작성하세요.

public class SwitchEx_4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1월~12월까지 중 하나를 입력하세요.");
		int num=sc.nextInt();
		
		switch(num) {
		
			case 1: case 3:	case 5:	case 7:	case 8: case 10: case 12:
			System.out.println("입력한 월은 31일까지 입니다");
			break;
		
			case 2 :
			System.out.println("입력한 월은 28일 혹은 29일까지 입니다");
			break;
		
			case 4: case 6:	case 9:	case 11:
			System.out.println("입력한 월은 30일까지 입니다.");
			break;
			
			default:
			System.out.println("반드시 1~12월까지 입력해야 합니다.");
			
		}
		
		sc.close();		

	}

}
