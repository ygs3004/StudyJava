package sec02.exam01_01_if;

// if문,Scanner

import java.util.Scanner;

public class IfEx_1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
					
		System.out.println("숫자 한 개를 입력하세요.");
		
			int num=sc.nextInt();
		
			if(num>0) {
				System.out.println("입력하신 숫자는 양수입니다.");
			}if(num==0) {
				System.out.println("입력하신 숫자는 0 입니다.");		
			}if(num<0) {
				System.out.println("입력하신 숫자는 음수입니다.");
			}

			System.out.println();
			System.out.println("프로그램 종료");
			
			sc.close();
			
	}

}
