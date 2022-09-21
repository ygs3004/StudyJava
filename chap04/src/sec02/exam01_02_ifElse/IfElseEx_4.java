package sec02.exam01_02_ifElse;

import java.util.Scanner;
/*
  나이를 키보드로 입력 받아 어린이(13세 이하)인지,
  청소년(13세 초과 ~ 19세 이하)인지,
  성인(19세 초과)인지
  출력하세요
 */

//if, Scanner

public class IfElseEx_4 {
 
	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		
		String str=null;
		System.out.println("나이:");
		int age=sc.nextInt();
				
		if(age<=13) {
			str="어린이 입니다.";
		}else if(age<=19){
			str="청소년 입니다.";
		}else{
			str="성인입니다.";
		}
		
		/*
		if(age<=13) {
			str="어린이 입니다.";
			
		}else{
			str="청소년 입니다.";
			
		}if(age>19){
			str="성인입니다.";
		}
		*/
		
	System.out.println(str);
	
	sc.close();

	}
	
}
