package tbrainExample06;

class A {
	void methodA() {
		I i=InstanceManager.getInstance();
		i.methodB();
	}
}

interface I{
	public abstract void methodB();
}

class B implements I{
	
	public void methodB() {
		System.out.println("method in B Class");
	}
}

class InstanceManager{
	public static I getInstance() {
		//B b=new B();
		//return b;
		return new B();
	}
}

public class InterfaceEx08 {

	public static void main(String[] args) {
		A a=new A();
		a.methodA();
	}
	
}