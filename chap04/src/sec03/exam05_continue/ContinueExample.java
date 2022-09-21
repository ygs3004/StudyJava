package sec03.exam05_continue;

public class ContinueExample {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			if(i%2 != 0)
				continue; // 조건문 판정 부분으로 
			System.out.println(i);
		}
	}
}