package com.hw1.model.vo;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.setName(name);
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String information() {
		return
				"이름 : "+super.getName()+"\n"+
				"나이 : "+super.getAge()+"살\n"+
				"신장 : "+super.getHeight()+"cm\n"+
				"몸무게 : "+super.getWeight()+"kg\n"+
				"학년 : "+grade+"학년\n"+
				"전공 : "+major+"\n";
	}

	public int getGrade() {	return grade;}
	public void setGrade(int grade) {this.grade = grade;}

	public String getMajor() {return major;}
	public void setMajor(String major) {this.major = major;}
	
}