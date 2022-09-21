package chap09;

class DerivedThread2 extends Thread{

	public void run() {
		for(int i=0; i<50; i++)
		System.out.print(i+"\t");
	}
}

public class MultithreadExample03 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		DerivedThread2 d=new DerivedThread2();
		d.start();
		DerivedThread2 d2=new DerivedThread2();
		d2.start();
		System.out.println("프로그램 종료");

	}

}