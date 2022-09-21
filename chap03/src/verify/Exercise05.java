package verify;

public class Exercise05 {

	public static void main(String[] args) {
		int value=356;
		System.out.println(value-(value%100));
		
		value-=(value%100);
		System.out.println(value);
		
		value=(int)(value/1.0);
		System.out.println(value);
		
		value=value*100/100;
		System.out.println(value);
	}

}
