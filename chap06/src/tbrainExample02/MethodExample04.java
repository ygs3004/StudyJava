package tbrainExample02;

class Avg3 {

	String name;
	String str;
	int total = 0;
	int average;

	String average(int x, int y) {
		this.total = x + y;
		this.average = this.total / 2;
		this.str = this.name + " 두 과목 평균 : " + this.average;
		
		return this.str;
	}

	String average(int x, int y, int z) {
		this.total = x + y + z;
		this.average = this.total / 3;
		this.str = this.name + " 세 과목 평균 : " + this.average;
		
		return this.str;
	}
}

public class MethodExample04 {

	public static void main(String[] args) {
		Avg3 student1 = new Avg3();
		Avg3 student2 = new Avg3();

		student1.name = "김철수";
		student2.name = "김영희";

		String st1_avg = student1.average(70, 80);
		String st2_avg = student2.average(80, 90, 100);

		System.out.println(st1_avg); // 김철수 두 과목 평균 : 75
		System.out.println(st2_avg); // 김영희 세 과목 평균 : 90 결과값이 나오도록 클래스를 작성하시오
	}
}
