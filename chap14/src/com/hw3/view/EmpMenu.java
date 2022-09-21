package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {
	Scanner sc=new Scanner(System.in);
	Employee emp = null;
	public EmpMenu(){}
	
	public void mainMenu() {
		boolean program = true;
		while(program) {
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력	");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 번호 : ");
			int button = sc.nextInt();
			sc.nextLine();
			
			switch(button) {
				case 1:
					emp = inputEmployee();
					break;
				case 2:
					modifyEmployee(emp);
					break;
				case 3:
					emp=null;
					System.gc();
					break;
				case 4:
					if(emp==null) {
						System.out.println("입련되 사원 정보가 없습니다");
						break;
					}
					System.out.println(emp.information());
					break;
				case 9:
					program = false;
					break;
			}
		}
		sc.close();
	}
	
		public Employee inputEmployee() {
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			System.out.print("직급 : ");
			String job = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("성별(남/여) : ");
			char gender = sc.nextLine().charAt(0);
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("보너스 포인트 : ");
			double bonusPoint = sc.nextDouble();
			sc.nextLine();
			System.out.print("전화번호 : ");
			String phone = sc.nextLine();
			System.out.print("주소 : ");
			String address = sc.nextLine();
			Employee emp = new Employee(name, dept, job, age, gender, salary, bonusPoint, phone, address);
			return emp;
		}
		
		public void modifyEmployee(Employee emp) {
			boolean modify=true;
			while(modify) {
				System.out.println("===== 사원 정보 수정 메뉴 =====");
				System.out.println("1. 이름 변경");
				System.out.println("2. 급여 변경");
				System.out.println("3. 부서 변경");
				System.out.println("4. 직급 변경");
				System.out.println("9  이전 메뉴로");
				System.out.print("메뉴 선택 번호 : ");
				int button2 = sc.nextInt();
				sc.nextLine();
					switch(button2) {
						case 1:
							System.out.print("이름 변경 : ");
							String name = sc.nextLine();
							emp.setEmpName(name);
							break;
						case 2:
							System.out.print("급여 변경 : ");
							int salary = sc.nextInt();
							sc.nextLine();
							emp.setSalary(salary);
							break;
						case 3:
							System.out.print("부서 변경 : ");
							String dept = sc.nextLine();
							emp.setDept(dept);
							break;
						case 4:
							System.out.println("직급 변경 : ");
							String job = sc.nextLine();
							emp.setJob(job);
							break;
						case 9:
							modify=false;
				}
			}
		}
}