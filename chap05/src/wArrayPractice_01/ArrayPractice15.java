package wArrayPractice_01;

import java.util.Scanner;

//문자열을 입력받아 배열에 저장하고 저장된 값과 문자의 개수를 출력하세요
//중복문자 제외
//문자열:apple
//문자열에 있는 문자 : a p l e
//문자의 개수 : 4
//문자열 : apple
//문자열에 있는 문자 : 
//문자 개수

public class ArrayPractice15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str=sc.nextLine();
		System.out.print("문자열에 있는 문자 : ");
		
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			
			boolean check=false;
			
			if(i==(str.length()-1)) {
				System.out.println(str.charAt(i));
				count++;
				break;
			}
			
			for(int j=i+1; j<str.length(); j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					check=true;
					break;
				}
			}
			
			if(!check){
				System.out.print(str.charAt(i)+", ");
				count++;
			}
						

		sc.close();
		}
		System.out.println("문자의 개수 : "+count);
	}
}