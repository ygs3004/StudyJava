package tbrainExample01;

class Parent {

	int x = 10;

	void method() {

	}
}

class Child extends Parent {
	int x = 20;

	@Override
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("Parent x=" + super.x);
	}
}

public class SuperTest04 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		
		Parent pa = new Parent();
		System.out.println(pa.x);
	}
}