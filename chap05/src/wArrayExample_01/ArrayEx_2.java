package wArrayExample_01;

import java.util.Scanner;

// 사용자에게 5명의 키의 정보를 입력받아 배열에 저장하고 
// 반복문을 통해 5명의 키의 평균값을 구하세요, 배열크기 5고정

public class ArrayEx_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		double sum=0;
		double avg=0;
		double[] height=new double[5];
		
		for(int i=0;i<height.length;i++) {
		System.out.println((i+1) + "번째 사람의 키를 입력해주세요");
		height[i]=sc.nextDouble();
		sum+=height[i];		
		}
		
		avg=sum/height.length;
		
		System.out.println("평균 : "+ avg);
		
		sc.close();
	}

}
