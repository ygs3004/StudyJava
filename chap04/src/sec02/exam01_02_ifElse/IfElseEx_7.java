package sec02.exam01_02_ifElse;

import java.util.Scanner;

//3개의 수를 키보드로부터 입력받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
public class IfElseEx_7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		boolean isTrue;
				
		System.out.println("입력1:");
		num1=sc.nextInt();
		System.out.println("입력2:");
		num2=sc.nextInt();
		System.out.println("입력3:");
		num3=sc.nextInt();
		
		isTrue=(num1==num2 && num2==num3);
		
		if(isTrue){
			System.out.println("세 수가 모두 같습니다.");	
		}else{	
			System.out.println("세 수가 모두 같지 않습니다.");
		}
		sc.close();
	}	
}