package com.hw1.model.vo;

public class Employee extends Person{

	private int salary;
	private String dept;
	private static int count;
	
	public Employee(){
		count++;
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.setName(name);
		this.salary = salary;
		this.dept = dept;
		count++;
	}
	
	@Override
	public String information() {
		return
				"이름 : "+super.getName()+"\n"+
				"나이 : "+super.getAge()+"살\n"+
				"신장 : "+super.getHeight()+"cm\n"+
				"몸무게 : "+super.getWeight()+"kg\n"+
				"급여 : "+salary+"원\n"+
				"부서 : "+dept+"\n";
	}
	
	public int getSalary() {return salary;}
	public void setSalary(int salary) {this.salary = salary;}

	public String getDept() {return dept;}
	public void setDept(String dept) {this.dept = dept;}
	
	public static int getCount() {return count;}

	public static void setCount(int count) {Employee.count = count;}

	
}
