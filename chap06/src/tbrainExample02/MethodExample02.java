package tbrainExample02;

public class MethodExample02 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		Numbers obj=new Numbers(arr);

		System.out.println("합계 : "+obj.getTotal());
		System.out.println("평균 : "+obj.getAverage());
	}
}