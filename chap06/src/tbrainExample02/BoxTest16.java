package tbrainExample02;

class Box2{
	
	long idNum;
	static long boxID=100;
	
	static long getCurrentID() {
		return ++boxID;
	}
}

public class BoxTest16 {

	public static void main(String[] args) {
		Box2 mybox1 = new Box2();
		mybox1.idNum = Box2.getCurrentID();
		
		Box2 mybox2 = new Box2();
		mybox2.idNum = Box2.getCurrentID(); // ??
		
		System.out.println("mybox1의 id번호 : "+mybox1.idNum); //101
		System.out.println("mybox2의 id번호 : "+mybox2.idNum); //102
		System.out.println("다음 박스의 번호는 "+Box2.getCurrentID()+"입니다."); //103
	}
}