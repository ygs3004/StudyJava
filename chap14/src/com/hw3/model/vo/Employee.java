package com.hw3.model.vo;

public class Employee {
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {}

	public Employee(String empName, String dept, String job, int age, char gender, int salary, double bonusPoint,
			String phone, String address) {
		super();
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	public String information() {
		return
		"\n"+
		"=============================="+"\n"+
		"사원 이름 : "+empName+"\n"+
		"부서 : "+dept+"\n"+
		"직급 : "+job+"\n"+
		"나이 : "+age+"\n"+
		"성별 : "+gender+"\n"+
		"급여 : "+salary+"\n"+
		"보너스 포인트 : "+bonusPoint+"\n"+
		"전화번호 : "+phone+"\n"+
		"주소 : "+address+"\n";
	}
	
	public String getEmpName() {return empName;}
	public void setEmpName(String empName) {this.empName = empName;}

	public String getDept() {return dept;}
	public void setDept(String dept) {this.dept = dept;}
	
	public String getJob() {return job;}
	public void setJob(String job) {this.job = job;}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	public char getGender() {return gender;}
	public void setGender(char gender) {this.gender = gender;}

	public int getSalary() {return salary;}
	public void setSalary(int salary) {this.salary = salary;}

	public double getBonusPoint() {return bonusPoint;}
	public void setBonusPoint(double bonusPoint) {this.bonusPoint = bonusPoint;}

	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}

	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
}