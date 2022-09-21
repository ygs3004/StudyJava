package sec03.exam01_01_for;

//중첩 for, if_else
//줄 수 :5
//칸 수 :7
//1******
//*2*****
//**3****
//------

import java.util.Scanner;

public class ForEx_8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("줄 수:");
		int row=sc.nextInt();
						
		System.out.println("칸 수:");
		int col=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++){
				if(i==j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	sc.close();
	}

}


