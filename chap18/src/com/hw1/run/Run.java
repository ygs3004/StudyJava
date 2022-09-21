package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45.0, 	4, "정보통신학과");
		
		for(Student student : students) {
			System.out.println(student.information());
		}
		
		Employee[] employees = new Employee[10];
		boolean input = true;
		while(input) {
			System.out.println("======사원 추가=====");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();

			employees[Employee.getCount()] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.print("사원을 더 추가하시겠습니까?(y/n)");
			char check = sc.nextLine().toUpperCase().charAt(0);
			System.out.println();
			
			if(!(check=='Y'))  input=false;
		}
		
		for(Employee employee : employees) {
			if(employee!=null)
			System.out.println(employee.information());
		}
		sc.close();
	}

}
