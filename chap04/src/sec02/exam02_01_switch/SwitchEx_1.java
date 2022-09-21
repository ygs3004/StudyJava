package sec02.exam02_01_switch;

import java.util.Scanner;

// 정수 두개와 연산기호 1개를 입력 받아서 연산 기호 문자(+,-,*,/)에
// 해당하는 계산을 실행하고 출력하세요.

public class SwitchEx_1 {

	public static void main(String[] args) {

		int first;
		int second;
		char op;
		int result=0; // switch 내에서 사칙연산 되지 않을경우 초기화 되지 않으므로 초기값 필요
		
		Scanner sc=new Scanner(System.in);

		 System.out.println("정수1을 입력하세요.");
		 first=sc.nextInt();
		 
		 System.out.println("정수2을 입력하세요.");
		 second=sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("기호를 입력하세요(+,-,*,/)");
		 op=sc.nextLine().charAt(0);
		 				 
		 switch(op){
			 
		 	case '+':
		 		result=first+second;
				break;
			 
			case '-':
				result=first-second;
				break;
				 
			case '*':
				result=first*second;
				break;
				 
			case '/':
				result=first/second;
				break;
				
			default:
				System.out.println("연산 기호를 잘못 입력 하셨습니다");
		 }
		 
		 System.out.println(first+""+op+""+second+"="+result);
		 sc.close(); 
	}
}
