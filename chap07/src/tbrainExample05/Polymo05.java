package tbrainExample05;

class Parent{
	int x=100;
	
	void method(){
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x=200;
	
	@Override
	void method(){
		System.out.println("Child Method");
		System.out.println("super.x="+super.x);
	}	
}

public class Polymo05 {

	public static void main(String[] args) {
		Parent p=new Child();
		Child c=new Child();
		
		System.out.println("p.x="+p.x);//100
		p.method();//Child Method
		System.out.println("c.x="+c.x);//200
		c.method();//Child Method
		
	}

}
