package wArrayPractice_01;

import java.util.Scanner;

// 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가 
// 몇개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를
// 출력하세요

public class ArrayPractice05 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 : ");
		String str=sc.nextLine();
		int same=0;
		char[] arr=str.toCharArray();
		
		/*
		char[] arr=new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i]=str.charAt(i);
		}
		*/
		
		System.out.print("문자 : ");
		char search=sc.nextLine().charAt(0);
		
		System.out.print(str+"에 "+search+"가 존재하는 위치(인덱스) : ");
		for(int i=0; i<str.length(); i++) {
			if(arr[i]==search) {
				System.out.print(i+" ");
				same++;
			}
		}
		
		System.out.println();
		System.out.println(search+"의 개수 : "+same);
		sc.close();
	}
}
