package sec03.exam01_01_for;

//1에서 10사이의 홀수만 출력
public class ForEx_3 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			if(i%2!=0) {
				System.out.println(i);	
			}
		}
		System.out.println();
		
		
		for(int i=1;i<=10;i+=2){
			System.out.println(i);	
		}
	}
}