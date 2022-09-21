package sec03.exam01_01_for;

import java.util.Scanner;

public class ForEx_7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("출력할 줄 수:");
		int row=sc.nextInt();
				
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=5;j++){
			System.out.print("*");
			
			}System.out.println();
		}
		sc.close();
	}
}
