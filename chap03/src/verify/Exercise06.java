package verify;

public class Exercise06 {

	public static void main(String[] args) {
		int lengthTop=5;
		int lengthBottom=10;
		int height=7;
		double area=((lengthTop+lengthBottom)*height)/2.0;
		System.out.println(area);
		
		area=(double)((lengthTop+lengthBottom)*height)/2;
		System.out.println(area);
		
		area=1.0*((lengthTop+lengthBottom)*height)/2;
		System.out.println(area);



	}

}
