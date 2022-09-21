package tbrainExample01;

class Data1 {
	int value;
}

class Data2 {
	int value;

	Data2(int x) {
		value = x;
		System.out.println("value : " + value);
	}
}

public class Constructor08 {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		// Data d2=new Data2(); error
		Data2 d2 = new Data2(100);

		System.out.println("d1.value : " + d1.value);
		System.out.println("d2.value : " + d2.value);
	}
}