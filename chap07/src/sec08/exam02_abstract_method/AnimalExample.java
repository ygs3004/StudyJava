package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-------");

		//변수의 자동 타입 변환
		Animal animal=null;
		animal = new Dog(); // 자식타입은 부모타입으로 자동타입변환
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		// 매개변수의 자동 타입 변환
		//animalSound1(new Dog());
		//animalSound2(new Cat());
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
/*	
	public static void animalSound1(Dog animal) {
		animal.sound();
	}
	public static void animalSound2(Cat animal) {
		animal.sound();
	}
	*/
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}