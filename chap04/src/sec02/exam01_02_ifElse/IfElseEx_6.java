package sec02.exam01_02_ifElse;

import java.util.Scanner;

//주민 번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
//남자:1,3 여자:2,4

public class IfElseEx_6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("주민 번호를 입력하세요(-포함)");
		
		char civ;
		civ=sc.nextLine().charAt(7);
		if(civ=='1' || civ=='3'){
			System.out.println("남자입니다.");
		}else if(civ=='2' || civ=='4') {
		System.out.println("여자입니다.");
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
		sc.close();

	}

}

