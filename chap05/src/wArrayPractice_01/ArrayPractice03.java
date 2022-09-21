package wArrayPractice_01;

import java.util.Scanner;

// 키보드로 입력 받은 양의 정수 만큼 배열 크기를 할당하고
// 1부터 입력받은 값까지의 배열에 초기화 한 후 출력하세요

public class ArrayPractice03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("양의 정수 입력 : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
		sc.close();
	}
	
}