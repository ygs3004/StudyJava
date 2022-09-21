package tbrainExample05;

class A5 {
	int x=100;
	
	public void over() {
		
	}
}

class B5 extends A5 {
	int y=200;
	
	@Override
	public void over() {
		System.out.println("y="+y);
	}
}

public class Polymo03 {

	public static void main(String[] args) {
		A5 ap=new B5();
				
		System.out.println("x="+ap.x);
		ap.over();
	}
}