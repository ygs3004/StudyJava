package tbrainExample06;

class A0{
	void autoPlay(I0 i) {
		i.play();
	}
}

interface I0{
	public abstract void play();
}

class B0 implements I0{
	public void play() {
		System.out.println("play in B class");
	}
}

class C0 implements I0{
	public void play() {
		System.out.println("play in C class");
	}
}

public class InterfaceEx07 {

	public static void main(String[] args) {
		A0 a=new A0();
		//B0 b=new B0();
		//a.autoPlay(b);
		a.autoPlay(new B0());
		a.autoPlay(new C0());
	}
	
}