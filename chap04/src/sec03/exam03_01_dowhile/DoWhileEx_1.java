package sec03.exam03_01_dowhile;

import java.util.Scanner;

// 키보드로 영어 문자열 값을 입력 받아 출력 반복 실행
public class DoWhileEx_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=null;
		
		do {
			System.out.print("문자열 입력:");
			str = sc.next();
			System.out.println("str:"+str);
			
			if(str.equals("exit")) {
			break;
			}
		
		}while(true);
		
		
		System.out.println("프로그램 종료");	
		sc.close();
	}
}



/*
do {
	System.out.print("문자열 입력:");
	str = sc.next();
	System.out.println("str:"+str);
}while(!(str.equals("exit")));    //"exit"종료
*/