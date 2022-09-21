package tbrainExample02;

class InstCnt {
	static int instNum = 0;

	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성 : "+instNum);
	}

}

public class ClassVar06 {

	public static void main(String[] args) {
		InstCnt cnt1=new InstCnt();
		InstCnt cnt2=new InstCnt();
		InstCnt cnt3=new InstCnt();
		InstCnt cnt4=new InstCnt();
		
		// System.out.println(cnt1.instNum);
		// System.out.println(InstCnt.instNum);
		
	}
}