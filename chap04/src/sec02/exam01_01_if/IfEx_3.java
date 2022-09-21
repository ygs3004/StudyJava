package sec02.exam01_01_if;

import java.util.Scanner;

public class IfEx_3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		
		String name; // 이름
		int grade; // 학년
		int classNum; // 반
		int num; // 번호	
		char gender;
		double score;
		String student=null;
		
		System.out.print("이름:");
		name=sc.nextLine();
										
		System.out.print("학년(숫자만):");
		grade=sc.nextInt();
		
		System.out.print("반(숫자만):");
		classNum=sc.nextInt();
		
		System.out.print("번호(숫자만):");		
		num=sc.nextInt();
		sc.nextLine();
		

		/* do-while 연습
		
		do {System.out.print("성별(M/F):");
			gender=sc.nextLine().charAt(0);
			
			if(gender!='M' && gender!='m' && gender!='F' && gender!='f'){
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}}
			
		
		while(gender!='M' && gender!='m' && gender!='F' && gender!='f');
				
		if(gender=='M'|| gender =='m') {
			student="남학생"; 
		}
		if(gender=='F'|| gender =='f') {
			student="여학생"; 
		}*/
			
			
		System.out.print("성별(M/F):");
		gender=sc.nextLine().charAt(0);
				
		if(gender=='M'|| gender =='m') {
			student="남학생"; 
		}
		if(gender=='F'|| gender =='f') {
			student="여학생"; 
		}
		if(gender!='M' && gender!='m' && gender!='F' && gender!='f') {
			System.out.println("잘못 입력하였습니다.");}
			
		
		
		System.out.print("성적(소수점 둘째자리까지):");
		score=sc.nextDouble();
				
		
		System.out.println(grade+"학년 "+classNum+"반 "+num+"번 "+name+" "+student+"의 성적은 "+score+"이다.");
				
		sc.close();
		
		
			

	}

}
