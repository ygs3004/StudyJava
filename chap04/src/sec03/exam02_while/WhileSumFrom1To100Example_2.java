package sec03.exam02_while;

public class WhileSumFrom1To100Example_2 {

	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		
		while(i<=100) {
			sum+=i;
			i++;			
		}

		System.out.println("1~"+(i-1)+" 합: "+sum);
	}

}
