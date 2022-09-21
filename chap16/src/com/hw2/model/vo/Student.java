package com.hw2.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
	public static int count;
	
	public Student() {}

	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String informaiton() {
		return
		grade+"학년 "+classroom+"반 "+name+")"+"국어점수:"+kor+" 영어점수:"+eng+" 수학점수:"+math;
	}

	public int getGrade() {return grade;}
	public void setGrade(int grade) {this.grade = grade;}

	public int getClassroom() {return classroom;}
	public void setClassroom(int classroom) {this.classroom = classroom;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}

	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}

	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	
}