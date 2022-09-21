package wpractice01;

import java.util.Scanner;

public class VariablePractice05 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		double kor,eng,mat;
		int tot,avg;
						
		System.out.println("국어 점수를 입력해주세요.");		
		kor=sc.nextDouble();
		
		System.out.println("영어 점수를 입력해주세요.");
		eng=sc.nextDouble();
		
		System.out.println("수학 점수를 입력해주세요.");
		mat=sc.nextDouble();
		
		tot=(int)(kor+eng+mat);
		avg=(int)(tot/3);
		
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);

	}

}
