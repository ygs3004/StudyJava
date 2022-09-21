package chap09;

class DerivedThread extends Thread{

	public void run(){
		for(int i=0; i<50; i++) {
			System.out.print(i+"\t");
		}
	}
		
}

public class MultithreadExample02 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		DerivedThread d=new DerivedThread();
		d.start();
		System.out.println("프로그램 종료");
		
	}
}