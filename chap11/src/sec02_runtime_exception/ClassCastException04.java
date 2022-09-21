package sec02_runtime_exception;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCastException04 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat);	
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {	// 검사 안할시 ClassCastException
			Dog dog=(Dog)animal;
			System.out.println("dog");
		}
		if(animal instanceof Cat) {	
			Cat cat=(Cat)animal;
			System.out.println("cat");
		}
		
	}
	

}