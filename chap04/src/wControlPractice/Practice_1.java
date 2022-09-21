package wControlPractice;

import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("중간 고사 점수");
		int midTerm=sc.nextInt();
		
		System.out.println("기말 고사 점수");
		int finalTerm=sc.nextInt();
		
		System.out.println("과제 점수");
		int homework=sc.nextInt();
		
		System.out.println("출석 횟수");
		int attendance=sc.nextInt();
		
		System.out.println("---------결과---------");
		
		// 30% 이상 결석 시 FAIL
		
		if (!(attendance < 20*7/10.0)) {
			System.out.println("중간 고수 점수(20) : "+midTerm*2/10.0);
			System.out.println("기말 고수 점수(30) : "+finalTerm*3/10.0);
			System.out.println("과제 점수(30) : "+homework*3/10.0);
			System.out.println("출석 횟수(20) : "+attendance);
		
			double sum=midTerm*2/10.0+finalTerm*3/10.0+homework*3/10.0+attendance;
			System.out.println("총점 : "+sum);
			if(sum>=70) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail[점수 미달]");
			}
			
		}else {
			System.out.println("Fail[출석 횟수 부족]:"+attendance+"일");
		}	
		
		sc.close();

	}

}
