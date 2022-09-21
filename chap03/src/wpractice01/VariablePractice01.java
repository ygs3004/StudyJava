package wpractice01;

import java.util.Scanner;

public class VariablePractice01 {

	public static void main(String[] args) {
		
	    String name;
	    int age;
	    char gender;
	    double height;
	    		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름을 입력하세요:");
		name=sc.nextLine();		
				
		System.out.println("나이를 입력하세요:");
		age=sc.nextInt();
		sc.nextLine();
						
		System.out.println("성별을 입력하세요(남/여):");
		gender=sc.nextLine().charAt(0);
									
		System.out.println("키를 입력하세요");
		height=sc.nextDouble();
						
		System.out.println("키:"+height+"인 "+age+"살 "+gender+"자 "+name+"님 반갑습니다^^");

	
		// 키보드 입력
		
		// 문자열 입력 받을 때 : sc.nextLine();
		// 정수형 입력 받을 때 : sc.nextInt();
		// 실수형 입력 받을 때 : sc.nextDouble();
		
		 // new -> 메모리에 생성(heap)
		

	
	}

}
