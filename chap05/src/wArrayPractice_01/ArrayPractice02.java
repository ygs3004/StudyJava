package wArrayPractice_01;

//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//역순으로 배열 인덱스에 넣은 후 출력해본다

public class ArrayPractice02 {

	public static void main(String[] args) {
		
		int[] arr=new int[10];

		for(int i=0; i<arr.length; i++) {
			arr[i]=arr.length-i;
			System.out.println("arr["+i+"] : "+arr[i]);
		}
	}
}