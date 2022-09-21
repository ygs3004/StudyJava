package wpractice01;

import java.util.Scanner;

public class VariablePractice04 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String str;
		char name1,name2,name3;
		
		System.out.println("문자열을 입력하세요.");
		
		str=sc.nextLine();
		
		name1=str.charAt(0);
		name2=str.charAt(1);
		name3=str.charAt(2);
				
		System.out.println("첫번째 문자 :"+name1);
		System.out.println("두번째 문자 :"+name2);
		System.out.println("세번째 문자 :"+name3);

		
	}

}