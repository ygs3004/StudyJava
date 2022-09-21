package wArrayPractice_01;

//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//1~10사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화 한 후 출력하세요

public class ArrayPractice09 {

	public static void main(String[] args) {
	
		int[] arr=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=(int)(Math.random()*10)+1;
			
			for(int j=0; j<arr.length; j++) {                   // j<i 로 조건을 바꾸고 if(i==j) 조건문 지우고 간략화 가능
				
				if(i==j) {
					continue;
				}

				if(arr[i]==arr[j]) {
					arr[i]=(int)(Math.random()*10)+1;
					j=-1;
				}
			}
			System.out.print(arr[i]+" ");
		}
	
		/*
		//강사님 해설
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length; ) {
			int random=(int)(Math.random()*10+1);
			boolean check=false;
			
			for(int j=0; j<i; j++) {
				if(arr[j]==random) {
					check=true;
				}
			}
			
			if(!check) {
				arr[i]=random;
				System.out.print(arr[i]+" ");
				i++;
			}
		}
	
	*/
	
	
	}

}