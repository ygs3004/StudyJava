package tbrainExample01;

class Avg{
	String name;
	int avg;
	
	public String average(int kor, int eng) {
		avg=(kor+eng)/2;
		return name+" "+avg;
	}
}

public class AvgTest01 {

	public static void main(String[] args) {
		Avg student1=new Avg();
		Avg student2=new Avg();
		
		student1.name="김철수";
		student2.name="김영희";
		
		String st1_avg=student1.average(70, 80);
		String st2_avg=student1.average(80, 90);

		System.out.println(st1_avg);
		System.out.println(st2_avg);
		
	}
	
}