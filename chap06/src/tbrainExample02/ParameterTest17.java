package tbrainExample02;

public class ParameterTest17 {

	public static void main(String[] args) {
	
		int[] x= {10};
		int[] x1=new int[1];
		
		System.out.println("main() : x="+x[0]);
		System.out.println("main() : x1="+x.hashCode());

		change(x); // 주소값을 매개변수 ex)1000번지
		System.out.println("main() : x="+x[0]);
		System.out.println("main() : x1="+x.hashCode());
		
		System.out.println("main() : x1="+x1[0]);
		System.out.println("main() : x1="+x1.hashCode());

	}
	
	static void change(int[] x) { // 참조형 매개변수, 주소값 ex)1000번지
		x[0]=1000;
		System.out.println("change() : x="+x[0]);
	}
}