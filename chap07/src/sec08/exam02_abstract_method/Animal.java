package sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	public Animal() {
		
	}
	
	public abstract void sound();
	// 추상 클래스를 상속 받는 클래스들은 추상 메소드를 반드시 오버라이드 해야한다.
}