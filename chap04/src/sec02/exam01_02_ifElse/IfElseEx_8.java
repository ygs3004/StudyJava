
package sec02.exam01_02_ifElse;

import java.util.Scanner;

//본인 이름을 입력 받아 본인인지 아닌지 출력하는 프로그램
public class IfElseEx_8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름:");
		String name=sc.nextLine();
		
		if(name.equals("홍길동")) {
			System.out.println("본인입니다.");

		}else {
			System.out.println("본인이 아닙니다.");
		}
		
		sc.close();
	}
}
