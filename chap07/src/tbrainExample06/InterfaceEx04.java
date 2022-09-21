package tbrainExample06;

interface A1 {
	int w = 10;
	static int x = 20;
	final int y = 30;
	public static final int z = 40;

}

public class InterfaceEx04 {

	public static void main(String[] args) {
		//A1 ap=new A1(); 인터페이스는 객체 생성이 안됨
		//A1.x=100;
		System.out.println("w="+A1.w);
		System.out.println("x="+A1.x);
		System.out.println("y="+A1.y);
		System.out.println("z="+A1.z);

	}

}
