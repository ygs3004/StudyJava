package sec02.exam01_02_ifElse;

import java.util.Scanner;

public class IfElseEx_1{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
					
		System.out.println("숫자 한 개를 입력하세요.");
		
			int num=sc.nextInt();
		
			if(num==0) {
				System.out.println("입력하신 숫자는 0 입니다.");		
			}else {
				if(num>0) {
					System.out.println("입력하신 숫자는 양수입니다.");
				}else {
					System.out.println("입력하신 숫자는 음수입니다.");
				}
			}
			
			System.out.println();
			System.out.println("프로그램 종료");
			
			sc.close();			
	}

}
