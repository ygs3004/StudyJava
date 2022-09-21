package sec06.exam01;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Hello, welcome to the java world!");
		System.out.println("2+5="+2+5); // + 연결 
		System.out.println("2+5="+(2+5));
		
		int score;
		score=100;					
		double score2=10.5;
		double result=score+score2;  // 자동 캐스팅, 실수+정수 => 실수
		//int result=score+score2;// 8byte 실수(110.5) 이므로 4byte 정수로(int)로 표현 불가
		System.out.println(result);
		
		int result2=(int)100.5; // 강제 캐스팅, 강제로 정수로 변화
		System.out.println(result2);
	}

}