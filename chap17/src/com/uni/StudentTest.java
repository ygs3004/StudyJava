package com.uni;

public class StudentTest {

	public static void main(String[] args) {
		Student arrays[] = new Student[3];
		arrays[0] = new Student("홍길동", 15, 171, 81, "201101", "영문");
		arrays[1] = new Student("한사람", 13, 183, 72, "201102", "건축");
		arrays[2] = new Student("임꺽정", 16, 175, 65, "201103", "무용");
		
		for(int i=0; i<arrays.length; i++) {
			System.out.println(arrays[i].printInformation());
		}
	}

}