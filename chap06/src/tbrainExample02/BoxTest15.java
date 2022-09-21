package tbrainExample02;

class Box{

	long idNum;
	static long boxID=0;
	
	void increment() {
		this.idNum=++boxID;
	}
	
}

public class BoxTest15 {

	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Box mybox3 = new Box();
		Box mybox4 = new Box();
		
		mybox1.increment();
		mybox2.increment();
		mybox3.increment();
		mybox4.increment();
		
		System.out.println("mybox1의 id 번호 : "+mybox1.idNum);
		System.out.println("mybox2의 id 번호 : "+mybox2.idNum);
		System.out.println("mybox3의 id 번호 : "+mybox3.idNum);
		System.out.println("mybox4의 id 번호 : "+mybox4.idNum);
		
		System.out.println("전체 박스의 개수는 "+Box.boxID+"입니다.");
		
	}

}