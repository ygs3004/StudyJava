package sec04.exam01_class_new;

public class StudentExample {
	int a; // 전역변수(global)
	public static void main(String[] args) {
		// int a; 지역변수(local)
		Student s1=new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		System.out.println("s1="+s1.hashCode());
		
		Student s2=new Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
		System.out.println("s2="+s2.hashCode());

	}
	
}