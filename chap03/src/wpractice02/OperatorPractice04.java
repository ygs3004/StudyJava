package wpractice02;

import java.util.Scanner;

public class OperatorPractice04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int candy;
		int human;
		
		System.out.println("사탕 개수를 입력해주세요.");
		candy=sc.nextInt();
						
		System.out.println("인원 수를 입력해주세요.");
		human=sc.nextInt();
		
		System.out.println("1인당 사탕개수:"+(candy/human));
		System.out.println("남는 사탕개수:"+(candy%human));
		
		sc.close();

	}

}
