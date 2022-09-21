package wpractice02;

import java.util.Scanner;

public class OperatorPractice05 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String name;
		int grade;
		int classNumber;
		int studentNumber;
		char gender;
		double score;		
		
		
		System.out.println("이름을 입력해주세요.");
		name=sc.nextLine();
						
		System.out.println("학년(숫자만)을 입력해주세요");
		grade=sc.nextInt();
		
		System.out.println("반(숫자만)을 입력해주세요.");
		classNumber=sc.nextInt();
		
		System.out.println("번호(숫자만)를 입력해주세요.");
		studentNumber=sc.nextInt();
		sc.nextLine();
				
		System.out.println("성별(M/F)을 입력해주세요.");
		gender=sc.nextLine().charAt(0);
		gender=(gender=='M')?'남':'여';
						
		System.out.println("성적을 입력해주세요.(소수점 아래 둘째자리까지)");
		score=sc.nextDouble();
		
		
		System.out.println(grade+"학년 "+classNumber+"반 "+studentNumber+"번 "+name+" "+gender+"학생의 성적은 "+score+"이다.");
		
		
		sc.close();
		
		
	}

}
