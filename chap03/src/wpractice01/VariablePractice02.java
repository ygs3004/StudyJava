package wpractice01;

import java.util.Scanner;

public class VariablePractice02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int num2;
					
		System.out.println("첫번째 정수를 입력해주세요.");
	    num1=sc.nextInt();
		
		System.out.println("두번째 정수를 입력해주세요.");
		num2=sc.nextInt();
		
		int add=num1+num2;
		int minus=num1-num2;
		int multiply=num1*num2;
		int division=num1/num2;
		
		System.out.println("두 정수를 더한 결과는 "+add+"입니다.");
		System.out.println("두 정수를 뺀 결과는 "+minus+"입니다.");
		System.out.println("두 정수를 곱한 결과는 "+multiply+"입니다.");
		System.out.println("두 정수를 나눈 결과의 몫은 "+division+"입니다.");
		
				
				
		
		
		
	}

}
