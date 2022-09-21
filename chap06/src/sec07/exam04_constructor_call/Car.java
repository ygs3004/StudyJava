package sec07.exam04_constructor_call;

public class Car {

	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		System.out.println("기본 생성자");
	}
	
	Car(String model){
		this(model, null, 0); // 생성자 호출
		System.out.println("car2 객체 생성");
	}
	
	Car(String model,String color){
		this(model, null, 0); 
	}
	
	Car(String model,String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
}
