package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Student[] stu=new Student[10];
		int korSum=0;
		int engSum=0;
		int mathSum=0;
		
		boolean more=true;
		while(more) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			stu[Student.count]=new Student(grade, classroom, name, kor, eng, math);
			Student.count++;
			korSum+=kor;
			engSum+=eng;
			mathSum+=math;
			
			boolean checkWhile = true;
			while(checkWhile) {
			System.out.println("학생을 추가 하시겠습니까?(y/n)");
			String check = sc.nextLine();
			if(check.equalsIgnoreCase("n")) {
				more = false;
				checkWhile=false;
			} else if(check.equalsIgnoreCase("y")) {
				checkWhile=false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}}
		}
		
		System.out.println("전체 국어평균 : "+(double)korSum/(Student.count));
		System.out.println("전체 영어평균 : "+(double)engSum/(Student.count));
		System.out.println("전체 수학평균 : "+(double)mathSum/(Student.count));
		for(int i=0; i<Student.count; i++) {
			System.out.println(stu[i].informaiton());
		}
		
		sc.close();
	}

}