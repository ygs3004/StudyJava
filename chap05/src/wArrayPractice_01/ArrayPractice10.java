package wArrayPractice_01;

//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//1~10사이의 난수를 발생시켜 배열에 초기화 후 배열 전체값과 그 중에서 최대값과 최소 값을 출력하세요

public class ArrayPractice10 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		int max=0; // 1
		int min=arr.length; // 10
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10)+1;
			System.out.print(arr[i]+" ");
		
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최대값 : "+min);
		
	}

}
