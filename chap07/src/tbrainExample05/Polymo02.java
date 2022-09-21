package tbrainExample05;

class A4 {
	int x=100;
}

class B4 extends A4 {
	int y=200;
}

public class Polymo02 {

	public static void main(String[] args) {
		//B4 ap=new B4();
		A4 ap=new B4();
		
		System.out.println("x="+ap.x);
		//System.out.println("y="+ap.y);
	}
}