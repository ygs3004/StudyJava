package wArrayPractice_01;

import java.util.Scanner;

//문자열을 입력받아 배열에 저장하고 저장된 값과 문자의 개수를 출력하세요
//중복문자 제외
//문자열:apple
//문자열에 있는 문자 : a p l e
//문자의 개수 : 4

public class ArrayPractice15_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str=sc.nextLine();
		char[] chArr=new char[str.length()];
		chArr[0]=str.charAt(0);
		
		boolean check=false;
		
		for(int i=1; i<str.length(); i++) {
			for(int j=0; j<chArr.length; j++) {
				if(str.charAt(i)==chArr[j]) {
					check=true;
					break;
				}
			}
		
			if(!check){
				for(int k=1; k<chArr.length; k++) {
					if(chArr[k]=='\u0000') {
					chArr[k]=str.charAt(i);
					break;
					}
				}
			}
			check=false;			

		}
		int count=0;
		System.out.println("문자열에 있는 문자 : ");
		for(int i=0;i<chArr.length;i++) {
			if(chArr[i] != '\u0000') {
				if(chArr[i+1]=='\u0000') {
					System.out.print(chArr[i]+" ");
					System.out.println();
				}else {
					System.out.print(chArr[i]+", ");
				}
				count++;
			}
		}

		System.out.println("문자 개수 : "+count);
		sc.close();
		
	}
}
