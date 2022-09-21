package sec02.exam01_02_ifElse;

import java.util.Scanner;

//if문,Scanner

public class IfElseEx_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		int num=sc.nextInt();
		
		System.out.println("숫자를 한 개 입력하세요:");
				
		if(num%2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");			
		}else{
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
