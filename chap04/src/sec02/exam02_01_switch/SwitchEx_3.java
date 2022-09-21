package sec02.exam02_01_switch;

// 메뉴를 선택하여 해당 메뉴 내용 출력하세요.
//



import java.util.Scanner;

public class SwitchEx_3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 수정");
		System.out.println("3. 회원 삭제");
		
		System.out.println("번호를 입력해주세요.");
		int num=sc.nextInt();
		
		switch(num) {
		
			case 1:
				System.out.println("회원 등록 메뉴입니다.");
				break;
				
			case 2:
				System.out.println("회원 수정 메뉴입니다.");
				break;
				
			case 3:
				System.out.println("회원 삭제 메뉴입니다.");
				break;
				
			default:
				System.out.println("잘못 입력 하셨습니다.");			
		}
		sc.close();
	}
	
}
