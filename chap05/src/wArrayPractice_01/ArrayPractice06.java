package wArrayPractice_01;

import java.util.Scanner;

//"월"~"일"까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력받아
//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//범위에 없는 숫자를 입력시 "잘못입력하셨습니다"를 출력하세요

public class ArrayPractice06 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String[] str={"월","화","수","목","금","토","일"};
		
		System.out.println("0~6 사이 숫자 입력 : ");
		int num=sc.nextInt();
		
		if(num<str.length && num>=0) {
			System.out.println(str[num]+"요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

		sc.close();
	}

}
