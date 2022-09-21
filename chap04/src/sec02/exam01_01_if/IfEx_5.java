package sec02.exam01_01_if;

import java.util.Scanner;

/*
 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
 세 과목에 대한 총 합계(국어+영어+수학)와 총 평균(합계/3.0)을 구하세요.
 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격,
 아니라면 불합격을 출력하세요.
*/
public class IfEx_5 {

	public static void main(String[] args) {
		
		int kor;
		int eng;
		int math;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("국어점수:");
		kor=sc.nextInt();
		
		System.out.println("영어점수:");
		eng=sc.nextInt();
		
		System.out.println("수학점수:");
		math=sc.nextInt();
		
		int tot=kor+eng+math;
		double avg=tot/3.0;
		
		System.out.println("총 합계:"+tot);
		System.out.println("평균:"+avg);
		
		if(kor>=40 && eng>=40 && math >=40 && avg>=60) {
			System.out.println("합격");
		}
		if(kor<40 || eng<40 || math<40 || avg<60) {
			System.out.println("불합격");
		}
		
		/*else {
		System.out.println("불합격");}*/
		
		sc.close();

	}

}
