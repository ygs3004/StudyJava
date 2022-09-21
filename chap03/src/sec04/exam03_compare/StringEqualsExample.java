package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {

		String strVar1="홍길동";
		String strVar2="홍길동";
		String strVar3=new String("홍길동");
		
		System.out.println(strVar1==strVar2);
		System.out.println(strVar1==strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));		

	}

}
