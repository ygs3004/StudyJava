package wArrayPractice_01;

import java.util.Scanner;

// 주민 등록 번호 성별자리 이후부터 *로 가리고 출력하세요..
// 단, 원본ㄴ 배열값은 변경없이 배열 복사본으로 변경하세요.
// ex.
// 주민등록번호(-포함) : 123456-123456
// 123456-1*****

public class ArrayPractice13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String civ;
		
		System.out.print("주민등록번호(-포함) : ");
		civ=sc.nextLine();

		char[] civArr=civ.toCharArray();
		/*
		char[] civArr=new char[civ.length()];
		for(int i=0; i<civ.length(); i++) {
			civArr[i]=civ.charAt(i);
		}
		*/
		
		char[] copyArr= new char[civArr.length];
		
		for(int i=0; i<civArr.length; i++) {
			if(i<8) {
				copyArr[i]=civArr[i];
			}else {
				copyArr[i]='*';
			}
			System.out.print(copyArr[i]);
		}
		
		sc.close();
	}

}
