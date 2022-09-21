package sec03.exam01_01_for;

// 1부터 10사이의 임의의 난수를 발생하여
// 1부터 발생한 난수까지 수를 전부 더한 합계 

public class ForEx_5 {

	public static void main(String[] args) {
		
		int random=(int)(Math.random()*10)+1;
		int sum=0;
		
		for(int i=1;i<=random;i++) {
			sum+=i;
		}
		
		System.out.printf("1부터 %d까지의 정수 합계:%d",random,sum);
	
	}

}
