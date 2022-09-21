package tbrainExample01;

// wrapper 클래스
// 프리미티브 타입(byte, short, int, long, float, double, char, boolean
// 을 객체로 표현하는데 사용

public class WrapperEx09 {

	public static void main(String[] args) {
		Integer obj1=new Integer(50); //Boxing
		Integer obj2=new Integer(50);  
		
		int sum=obj1.intValue()+obj2.intValue(); // Unboxing
		System.out.println(sum);
		
		int a=Integer.parseInt("12345");
		int b=Integer.parseInt("12345");
		int c=a+b;
		System.out.println(c);
		
		Integer obj3=Integer.valueOf(50);
		Integer obj4=Integer.valueOf("50");  // 문자도 가능

		int sum2=obj3.intValue()+obj4.intValue();
		//int sum2=obj3+obj4; <= 자동 언박싱 auto Unboxing
		System.out.println(sum2);
		
		if(obj3 == obj4)
			System.out.println("obj3와 obj4는 동일 객체 참조");
		else
			System.out.println("obj3와 obj4는 다른 객체 참조");
	}

}