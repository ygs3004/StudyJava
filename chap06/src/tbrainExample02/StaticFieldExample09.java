package tbrainExample02;

class InstCnt2 {
	static int instNum = 100;

	InstCnt2() {
		instNum++;
		System.out.println("인스턴스 생성(객체) : " + instNum);
	}
}

public class StaticFieldExample09 {

	public static void main(String[] args) {
		InstCnt2.instNum -= 15; // 생성자 작동 안함, 바로 static 필드에 접근 가능
		
		System.out.println(InstCnt2.instNum);
	}
}