package sec04.exam01_arithmetic;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple=1;
		int totalPiece=apple*10;
		int number=7;
		int temp=totalPiece-number; //3
		
		double result=temp/10.0; // 3.0/10.0
				
		
			
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면,");
		System.out.println(result+"조각이 남는다.");
		
	}

}
