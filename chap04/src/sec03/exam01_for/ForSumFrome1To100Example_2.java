package sec03.exam01_for;

// 1부터 10까지의 합을 구하여 출력
public class ForSumFrome1To100Example_2 {

	public static void main(String[] args) {

		int sum=0;
		int i;
				
		for(i=0;i<=100;i++) {
			sum+=i;
			System.out.println("i="+i+" sum="+sum);
		}
		System.out.println("1~"+(i-1)+" 합:"+sum);

	}

}
