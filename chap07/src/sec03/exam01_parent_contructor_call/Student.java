package sec03.exam01_parent_contructor_call;

public class Student extends People{
	
	public int studentNo;
	
	Student(String name, String ssn, int studentNo){
		super(name, ssn);
		this.studentNo=studentNo;
	}
	
}