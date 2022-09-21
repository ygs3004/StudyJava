package sec03.exam02_01_while;

import java.util.Scanner;

public class WhileEx_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int menuNum=0;
		
		while(menuNum != 4) {
			System.out.println("1. 1~5까지 출력:");
			System.out.println("2. 5~1까지 출력:");
			System.out.println("3. 1~10 사이의 홀수 출력:");
			System.out.println("4. 종료");
			System.out.println("메뉴 선택");
			menuNum=sc.nextInt();
			
			switch(menuNum) {
			
			case 1:
				method1(); // 메소드(기능) 호출
				break;
			
			case 2:
				method2();
				break;
			
			case 3:
				method3();
				break;
				
			case 4 :
				System.out.println("종료합니다.");
				System.exit(0);
			
			default :
				System.out.println("잘못 입력하셨습니다.");		
							
			}
						
		}
		
		sc.close();
		
	} // end main

	public static void method1(){

		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void method2(){
		
		int i=5;
		while(i>=1) {
			System.out.println(i);
			i--;		
		}
	}
	
	public static void method3() {
		//1에서 10 사이의 홀수		
		int i=1;
		while(i<=10) {
			if(i%2 != 0) {
			System.out.println(i);
			}
			i++;
		}

	}
	
}
