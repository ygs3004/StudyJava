package wArrayPractice_01;

// 로또 번호 자동 생성기 프로그램을 작성하는데 중복값이 없이 오름차순으로
// 정렬하여 출력하세요

public class ArrayPractice14 {

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
		
		
		int[] sort=new int[choice];
		int min;
		
		for(int i=0; i<choice; i++) {
			
			min=46;
			for(int j=0; j<choice; j++) {
				if(lotto[j]<min) {
					min=lotto[j];
				}
			}
			
			for(int c=0; c<choice; c++) {
				if(lotto[c]==min) {
					lotto[c]=46;
				}
			}

			sort[i]=min;
			System.out.print(sort[i]+" ");
			
		}
				
			
		
		
		
		
		
		
	}
		

		
		
		
		
		
		
		

	}
