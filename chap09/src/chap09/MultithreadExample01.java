package chap09;

/*
 스레드(thread) : 하나의 프로그램내에서 독립적으로 실행되는 메서드
 싱글 스레드(single thread program):스레드가 하나뿐인 프로그램
 멀티스레드 프로그램(multithread program):스레드가 둘 이상인 프로그램(동영상 + 소리)
java.lang.Thread
java.lang.Runnalbe (Interface)
 */


class DigitThread extends Thread{
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

public class MultithreadExample01 {

	public static void main(String[] args) {
		//DigitThread digit = new DigitThread();
		//digit.run();
		Thread thread = new DigitThread();
		//thread run();
		thread.start();
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e){
				e.getMessage();
			}
		}

	}
}
	
