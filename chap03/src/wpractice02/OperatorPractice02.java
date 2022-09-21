package wpractice02;

import java.util.Scanner;

public class OperatorPractice02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num; 
		
		System.out.println("정수를 입력해주세요.");
		num=sc.nextInt();
		
		System.out.println((num>0)?"입력한 정수는 양수이다.":((num==0)?"입력한 정수는 0이다":"입력한 정수는 음수다."));

		sc.close();
		
						
		//String str=(num>0)?"양수이다.":"양수가 아니다.";
		//System.out.println("입력한 정수는 "+str);


	}

}
