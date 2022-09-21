package wArrayPractice_01;

import java.util.Scanner;

//3이상인 홀수 자연수를 입력받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고
//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요
//단, 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요"를 출력하고 다시 정수를 받도록 하세요


public class ArrayPractice12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("3 이상인 홀수를 입력해주세요");
		int size=sc.nextInt();
		
		while(size<3 || (size%2==0)) {
			System.out.println("다시 입력해주세요");
			System.out.println("3 이상인 홀수를 입력해주세요");
			size=sc.nextInt();
		}
		
		int[] arr=new int[size];
		int mid=(size+1)/2-1;
		int var=1;
		
		for(int i=0; i<size; i++) {
			if(i<mid) {
				arr[i]=var;
				var++;
				System.out.print(arr[i]+", ");
			
			}else if(i>=mid && i<size-1){
				arr[i]=var;
				var--;
				System.out.print(arr[i]+", ");
				
			}else {
				arr[i]=var;
				var--;
				System.out.print(arr[i]);
			}
		
		
		}
		
	sc.close();		

	}

}
