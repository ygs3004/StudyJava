package wArrayExample_01;

import java.util.Scanner;

// 사용자에게 한 개의 정수를 입력받고 그 정수의 크기만큼 배열을 만든다.
// 1부터 100사이의 랜덤값을 발생시켜 배열에 넣는다
// 저장된 배열의 값들 중 짝수의 값을 찾아내어 누적 시킨다.
// 짝수의 합을 출력한다

public class ArrayEx_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("배열의 길이를 설정하시오");
		
		int sum=0;
		int size=sc.nextInt();
		int[] arr=new int[size];

		for(int i=0;i<size;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			System.out.println("arr["+i+"] 의 값 : "+arr[i]);
			
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		
		System.out.print("짝수인 배열의 값 : ");
		
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("짝수의 합: "+sum);

		
		sc.close();
	}

}
