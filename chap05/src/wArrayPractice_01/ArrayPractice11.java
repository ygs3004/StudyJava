package wArrayPractice_01;

import java.util.Scanner;

//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수 형 배열을 선언 및 할당하고
//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화하세요
//그리고 배열 전체값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요


public class ArrayPractice11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("배열의 길이를 입력해주세요");
		int size = sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"인덱스에 저장될 값을 입력해주세요.");
			arr[i] = sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum+=arr[i];
		}
		
		System.out.println();
		System.out.println("인덱스에 저장된 값들의 합 : "+sum);
		
		sc.close();
		
	}

}
