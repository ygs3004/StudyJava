package sec03.exam01_01_for;

import java.util.Scanner;

// 정수를 하나 입력받아 그 수가 1~9사이의 수일 때만 그 수의 구구단 출력
// 조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다." 출력

public class ForEx_4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
			
		System.out.println("1~9사이의 양수를 하나 입력하세요.");
		
		int dan=sc.nextInt();		
		
		if(dan>=1 && dan<=9) {
		
			System.out.println("구구단 "+dan+"단");
		
			for(int i=1;i<=9;i++){
				// int result=i*dan;
				//System.out.println(dan+"x"+i+"="+(i*dan));
				System.out.printf("%d * %d = %d\n", dan,i,dan*i);
			}
		
		}else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");

		}
		sc.close();
	}

}
