package tbrainExample02;

class AccessWay{
	static int num=0;
	
	AccessWay(){
		// num++;
		incrCnt();
	}
	
	void incrCnt() {
		num++;
	}
}

public class StaticFieldExample08 {

	public static void main(String[] args) {
		AccessWay way=new AccessWay();
		way.num++;
		AccessWay.num++;
		
		System.out.println("num = "+AccessWay.num); // 3을 출력하시오
	}

}