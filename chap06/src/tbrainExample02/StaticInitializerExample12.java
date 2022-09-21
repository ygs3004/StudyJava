package tbrainExample02;

class HundredNumbers {
	static int arr[];

	// 정적 초기화 블록
	static {
		arr=new int[100];
		for(int cnt=0; cnt<100; cnt++) {
			arr[cnt]=cnt;
		}
	}
}


public class StaticInitializerExample12 {

	public static void main(String[] args) {
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[27]);
		System.out.println(HundredNumbers.arr[63]);
	}
}