package tbrainExample01;

class PersonalInformation2 {
	final String name = "gemini"; // final : 반드시 초기화, 데이터값 변경 불가
	int age = 10;

	public void printInfo() {
		System.out.println(name+":"+age+":");
	}
	
	public void changeValue() {
		// name="gemini12"; //error 파이널은 바꿀수 없다.
		age=20;
		
		System.out.println(name+":"+age);
	}
}

public class Person12 {

	public static void main(String[] args) {

		PersonalInformation2 info = new PersonalInformation2();

		info.printInfo();
		info.changeValue();

	}
}