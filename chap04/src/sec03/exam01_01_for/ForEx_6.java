package sec03.exam01_01_for;

import java.util.Scanner;

// 키보드로 정수 두 개를 입력 받아 작은 수부터 큰 수까지의  
public class ForEx_6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫 번째 정수:");
		int num1=sc.nextInt();
		
		System.out.println("두 번째 정수:");
		int num2=sc.nextInt();
		int sum=0;
			
		int max=0;
		int min=0;
		
		if(num1>num2) {
			max=num1;
			min=num2;
		}else {
			max=num2;
			min=num1;
		}
		
		for(int i=min;i<=max;i++) {
			sum+=i;
		}
		System.out.printf("%d부터 %d까지의 합:%d",num1,num2,sum);

		
		
/*
		if(num1>num2) {
			for(int i=num2;i<=num1;i++) {
				sum+=i;
			}
			System.out.printf("%d부터 %d까지의 합:%d",num2,num1,sum);
		
		}else if(num2>num1) {
			for(int i=num1;i<=num2;i++) {
				sum+=i;		
			}
			System.out.printf("%d부터 %d까지의 합:%d",num1,num2,sum);
		
		}else {
			System.out.println("정수 두 개의 값을 다르게 넣어주세요.");
		}

		
		
		/* switch 문으로 작성		
		if(num1==num2){
			System.out.println("정수 두 개의 값을 다르게 넣어주세요.");
		}else{
			boolean check = (num1>num2);
		
			int isTrue = check ? 1 :2;
			
			switch(isTrue) {
			
				case 1:
					for(int i=num2;i<=num1;i++) {
						sum+=i;
					}
					System.out.printf("%d부터 %d까지의 합:%d",num2,num1,sum);
					break;
			
				case 2:
					for(int i=num1;i<=num2;i++) {
						sum+=i;		
					}
					System.out.printf("%d부터 %d까지의 합:%d",num1,num2,sum);
					break;
			}
		}
		*/
				
		sc.close();

	}

}
