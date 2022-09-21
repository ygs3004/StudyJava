package tbrainExample01;

class C1{
	static int x;
	static int y;
}

class C2 extends C1{
	static String x;
}

public class InheritanceTest06 {

	public static void main(String[] args) {
		C2.x="java programming";
		System.out.println(C2.x);
		C1.x=30000;
		C1.y=20000;
		
		System.out.println("클래스 변수 C2.x값 : "+C2.x);
		System.out.println("클래스 변수 C2.y값(C1으로부터 상속) : "+C2.y);
		System.out.println("클래스 변수 C1.x값 : "+C1.x);
	}
}