package wpractice01;

import java.util.Scanner;

public class VariablePractice03 {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double area;
		double circle;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("사각형의 가로 값(실수)을 입력해주세요.");
		num1=sc.nextDouble();
		System.out.println();
		
		System.out.println("사각형의 세로 값(실수)을 입력해주세요.");
		num2=sc.nextDouble();
		System.out.println();
		
		
		area=num1*num2;
		circle=(num1+num2)*2;
				
		System.out.println("사각형의 면적은 "+(area)+"입니다.");
		System.out.println("사각형의 둘레는 "+(circle)+"입니다.");

	}

}
