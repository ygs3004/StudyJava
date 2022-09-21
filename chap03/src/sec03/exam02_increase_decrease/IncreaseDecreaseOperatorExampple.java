package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExampple {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("---------------------");
		x++; // x=x+1
		++x; // x=x+1
		System.out.println("x="+x); // x=12
		
		System.out.println("---------------------");
		y--; // y=y-1
		--y; // y=y-1
		System.out.println("y="+y);
		
		System.out.println("---------------------");
		z=x++; // 후위 연산자
		System.out.println("z="+z); // 12
		System.out.println("x="+x); // 13
		
		System.out.println("---------------------");
		z=++x; // 전위 연산자
		System.out.println("z="+z); // 14
		System.out.println("x="+x); // 14
		
		System.out.println("---------------------");
		z=++x + y++; // x:전위 연산자, y:후위 연산자
		System.out.println("z="+z); // 23
		System.out.println("x="+x); // 15
		System.out.println("y="+y); // 9

	}

}
