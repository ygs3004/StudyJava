package wArrayExample_01;

// 10개의 데이터를 입력하려고 한다. 홀수 자리에는 하트를 "♡"
// 짝수 자리에는 별표를 입력해서 출력해보자 "☆"
// for 
public class ArrayEx_5 {

	public static void main(String[] args) {
		
		char[] arr=new char[10];

		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				arr[i]='☆';
			} else {
				arr[i]='♡';
			}
			System.out.printf("%3c",arr[i]);
		}

	}

}
