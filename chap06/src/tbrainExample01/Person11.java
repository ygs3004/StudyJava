package tbrainExample01;

class PersonalInformation {
	private String name = "gemini";
	private int age = 10; // private 외부 접근 금지
	private String socialNumber = "991223-1234321";
	

	public void printInformation(String name, int age, String socialNumber) {
		this.name=name;
		this.age=age;
		this.socialNumber=socialNumber;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(socialNumber);
	}
	
	public void printInformation() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(socialNumber);
	}
	
	public void changeValue() {
		name="gemini12";
		age=20;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(socialNumber);
	}
}

public class Person11 {

	public static void main(String[] args) {

		PersonalInformation info = new PersonalInformation();
		//info.name = "gemini2";
		//System.out.println("name = " + info.name);
		//info.age = 20;
		//System.out.println("age = " + info.age);
		//System.out.println("socialNumber = " + info.socialNumber);
		
		info.printInformation("gemni2",20,"991223-1234321");
		info.printInformation();
		info.changeValue();
		
	}
}