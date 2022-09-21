package tbrainExample01;

class B1 {
	int x;

}

class B2 extends B1 {
	String x; // 변수 이름이 같을 경우 상위 클래스 변수 가려짐
}

public class InHeritanceTest05 {

	public static void main(String[] args) {
		B2 b2 = new B2();
		b2.x="상속을 공부중 입니다~~";
		// b2.x=1000; ㄴㅅ갸ㅜㅎ xkdlq
		System.out.println("객체 b2에 들어있는 x값 : "+b2.x);

		B1 b1=new B1();
		b1.x=5000;
		System.out.println("객체 b1에 들어있는 x값"+b1.x);
	}
	
}