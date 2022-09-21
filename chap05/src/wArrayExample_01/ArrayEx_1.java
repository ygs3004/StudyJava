package wArrayExample_01;

import java.util.Scanner;

// 키보드로 입력받은 정수로 배열의 길이를 지정하여 배열 할당

public class ArrayEx_1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("새로 할당할 배열의 길이를 입력하세요.");
		int num=sc.nextInt();
		int[] dArr=new int[num]; // 동적 할당
		
		System.out.println("dArr의 값 : "+dArr);
		System.out.println("dArr의 hashCode : "+dArr.hashCode());
		System.out.println("dArr의 길이 : "+dArr.length);
		dArr=null;
	// 	System.out.println("dArr의 길이 : "+dArr.length); null 이므로 에러
		
		
		sc.close();
	}

}
