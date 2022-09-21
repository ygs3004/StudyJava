package chap09;

class AlphabetThread extends Thread{
	public void run() {
		for (char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class DigitThread3 extends Thread{
	public void run(){
		for(int cnt=0; cnt<10; cnt++) {
			System.out.print(cnt);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e){
				e.getMessage();
			}
		}
	}
}

public class MultithreadExample04 {

	public static void main(String[] args) {
		Thread thread1=new DigitThread3();
		Thread thread2=new DigitThread3();
		Thread thread3=new AlphabetThread();
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
