package wArrayExample_01;

import java.util.Scanner;

// 문자열을 입력받아 String 타입에 저장하고
// 인덱스를 지정하여 인덱스 별 문자를 문자 배열에 저장한다
// 문자 배열을 출력해본다.

public class ArrayEx_4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str=sc.nextLine();
		char[] cArr=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			cArr[i]=str.charAt(i);
			System.out.println("cArr["+i+"] : "+cArr[i]);
		}
		
		System.out.print("문자배열 : ");
		for(int i=0;i<str.length();i++) {
			System.out.print(cArr[i]);
		}
		
		
		sc.close();
	}

}
