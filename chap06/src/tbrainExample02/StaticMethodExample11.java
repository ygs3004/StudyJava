package tbrainExample02;

class Accumulator1{
	int total=0;
	static int grandTotal=0;
	
	void accumulate1(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	static int getGrandTotal() {
		return grandTotal;
	}
}

public class StaticMethodExample11 {

	public static void main(String[] args) {
		Accumulator1 obj1=new Accumulator1();
		Accumulator1 obj2=new Accumulator1();
		
		obj1.accumulate1(10);
		obj2.accumulate1(20);

		int grandTotal=Accumulator1.getGrandTotal();
		
		System.out.println("obj1.total = " + obj1.total); // 10
		System.out.println("obj2.total = " + obj2.total); // 20
		System.out.println("총계 = "+grandTotal); // 30
	}

}
