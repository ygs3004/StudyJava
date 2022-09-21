package sec03.exam02_01_while;

import java.util.Scanner;

// 문자열을 입력받아 인덱스별로 문자 출력

public class WhileEx_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열 입력:");

		String str=sc.next(); // 문자열의 길이 str.length() 
		
		int index=0;
		
		while(index < str.length()) {
			char ch=str.charAt(index);
			index++;
			System.out.println(index+"번째 위치 문자:"+ch);
		}
		
		sc.close();
	}

}