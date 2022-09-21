package wpractice02;

import java.util.Scanner;

public class OperatorPractice03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("정수를 입력해주세요.");
		num=sc.nextInt();
		
		String str=(num%2==0)?"입력하신 수는 짝수입니다.":"입력하신 수는 홀수입니다.";
		
		System.out.println(str);
		
		sc.close();
	
	}

}
