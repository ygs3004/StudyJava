package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores=null;
		scores=new int[] {83, 90, 87};
		int sum1=0;
		for(int i=0;i<3;i++) {
			sum1+=scores[i];
		}
			
		System.out.println("총합 : "+sum1);
		//System.out.println(scores);
		int sum2=add(new int[] {83, 90, 87}); // 메소드 호출
		System.out.println("총합 : "+sum2);
		int sum3=add(new int[] {99, 90, 100});
		System.out.println("총합 : "+sum3);
	}
	

	
	
	public static int add(int[] scores) {
		int sum=0; // 지역 변수 local
		for(int i=0;i<3;i++) {
			sum+=scores[i];
		}
		return sum;
	}
}
