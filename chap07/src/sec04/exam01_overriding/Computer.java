package sec04.exam01_overriding;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		
		System.out.println("Math.PI = "+Math.PI);
		return Math.PI*r*r;
	}
}
