package tbrainExample02;

class NoneObject{
	static int number=3;
	
	static void printNumber() {
		System.out.println("number = " + number);
	}
}

public class StaticMethodExample14 {

	public static void main(String[] args) {
		NoneObject no=new NoneObject();
		System.out.println("no.number = "+no.number);
		no.printNumber();
		
		System.out.println("NoneObject.number = "+NoneObject.number);
		NoneObject.printNumber();

	}
}