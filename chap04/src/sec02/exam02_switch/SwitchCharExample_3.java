package sec02.exam02_switch;

public class SwitchCharExample_3 {

	public static void main(String[] args) {
		
		char grade='B';
		
		switch(grade) {
		
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
			
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
			
		case 'C':
		case 'c':
			System.out.println("손님입니다.");
			break;
		}
				
	}

}