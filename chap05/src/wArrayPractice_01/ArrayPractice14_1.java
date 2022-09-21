package wArrayPractice_01;

// 로또 번호 자동 생성기 프로그램을 작성하는데 중복값이 없이 오름차순으로
// 정렬하여 출력하세요

public class ArrayPractice14_1 {

	public static void main(String[] args) {
		
		int[] lotto=new int[6];
		int random;
		int choice=6;

		for(int i=0; i<choice;) {
			
			random=(int)(Math.random()*45)+1;
			boolean check = true;
			
			for(int j=0; j<i; j++) {
				if(random == lotto[j]) {
					check=false;
				}
			}	
			
			if(check) {
				lotto[i]=random;
				System.out.print(lotto[i]+" ");
				i++;
			}
			
		} // 난수 6개 배열 저장
		
		System.out.println();
		
		for(int i=0; i<6; i++) {
			
			for(int j=i+1; j<6 ; j++) {
				
				if(lotto[i]>lotto[j]) {
					int small=lotto[j];
					lotto[j]=lotto[i];
					lotto[i]=small;
				}
				
			}

			System.out.print(lotto[i]+" ");
			
		}
		
	}
		
}