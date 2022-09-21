package tbrainExample01;

public class WrapperEX11 {

	public static void main(String[] args) {
		
		printDouble(new Double(123.45));
		//auto Boxing
		printDouble(123.45);

	}
	
	public static void printDouble(Double obj) {

		System.out.println(obj);
		
	}

}