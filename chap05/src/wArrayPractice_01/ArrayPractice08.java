package wArrayPractice_01;

//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요

public class ArrayPractice08 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10)+1;
			System.out.print(arr[i]+" ");
		}
	}

}
